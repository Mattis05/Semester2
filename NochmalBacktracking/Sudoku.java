package NochmalBacktracking;

public class Sudoku {
    private static final int GRIDSIZE =9;

    private static boolean isnumberinrow(int[][] board, int number, int row){
        for(int i =0;i<GRIDSIZE; i++){
            if(board[row][i]==number){
                return true;
            }
        }
        return false;
    }
    private static boolean isnumberincolumn(int[][] board, int number, int column){
        for(int i =0;i<GRIDSIZE; i++){
            if(board[i][column]==number){
                return true;
            }

        }
        return false;
    }
    private static boolean isnumberinbox(int[][] board, int number, int column, int row){
        int localboxrow = row- row % 3;
        int localboxcolumn = column - column%3;

        for(int i =localboxrow;i<localboxrow+3; i++){
            for(int j =localboxcolumn;j<localboxcolumn+3; j++){
                if(board[i][j]==number){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean isSafe(int[][] board, int number, int column, int row){
        return !isnumberinrow(board,number,row) &&
                !isnumberincolumn(board,number,column) &&
                !isnumberinbox(board,number,column,row);
    }


    public static boolean solve(int[][] board){
        for(int i =1; i<GRIDSIZE;i++){
            for(int j = 1; j<GRIDSIZE;j++) {
                if (board[i][j]==0) {
                    for (int numbertry = 1; numbertry <= GRIDSIZE; numbertry++) {
                        if (isSafe(board, numbertry, i, j)) {
                            board[i][j] = numbertry;

                            if (solve(board)) {
                                return true;
                            }
                            else {
                                board[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }

            }
        }
        return true;
    }

    private static void printer(int[][] board){
        for(int row =0;row<GRIDSIZE;row++){
            if(row%3==0 && row !=0){
                System.out.println("-----------");
            }
            for(int column = 0 ; column<GRIDSIZE;column++){
                if(column%3 ==0 && column!=0){
                    System.out.print("|");
                }
                System.out.print(board[row][column]);
            }
            System.out.println();
        }

    }




    public static void main(String[] args) {
        int[][] board = {
                {7, 0, 2, 0, 5, 0, 6, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0},
                {1, 0, 0, 0, 0, 9, 5, 0, 0},
                {8, 0, 0, 0, 0, 0, 0, 9, 0},
                {0, 4, 3, 0, 0, 0, 7, 5, 0},
                {0, 9, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 9, 7, 0, 0, 0, 0, 5},
                {0, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 7, 0, 4, 0, 2, 0, 3}
        };
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        printer(board);
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        if(solve(board)){
            System.out.println("Solved!");
        }


        printer(board);
    }
}
