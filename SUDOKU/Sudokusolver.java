package SUDOKU;

public class Sudokusolver {
    private static final int GRID_SIZE = 9;

    private static boolean isNumberInRow(int[][] board, int number,int row){
        for(int i=0;i<GRID_SIZE;i++){
            if(board[row][i]==number){
                return true;
            }
        }
        return false;
    }
    private static boolean isNumberInColumn(int[][] board, int number,int column){
        for(int i=0;i<GRID_SIZE;i++){
            if(board[i][column]==number){
                return true;
            }
        }
        return false;
    }
    private static boolean isNumberInBox(int[][] board, int number,int row,int column){
       int localBoxRow=row-row%3;
       int localBoxColumn=column-column%3;
       for(int i=localBoxRow;i<localBoxRow+3;i++){
           for(int j=localBoxColumn;j<localBoxColumn+3;j++){
               if(board[i][j]==number){
                   return true;
               }
           }
       }
       return false;
    }
    private static boolean validplacement(int[][] board, int number,int row,int column){
        return  !isNumberInRow(board,number,row)&&
                !isNumberInBox(board,number,row,column)&&
                !isNumberInBox(board,number,row,column);
     }
     public static boolean solveboard(int[][] board){
        for(int row=0;row<GRID_SIZE;row++){
            for(int column=0;column<GRID_SIZE;column++){
                if (board[row][column]==0){
                    for(int trynumber=1;trynumber<=GRID_SIZE;trynumber++){
                        if(validplacement(board,trynumber,row,column)){
                            board[row][column]=trynumber;
                            if(solveboard(board)){
                                return true; //Sudoku fertig
                            }
                            else{
                                board[row][column]=0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
     }

    private static void printBoard(int[][] board) {
        for(int row=0;row<GRID_SIZE;row++){
            if(row%3==0 && row!=0){
                System.out.println("-----------");

            }
            for(int column=0;column<GRID_SIZE;column++){
                if(column%3==0 && column!=0){
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
        printBoard(board);
        if(solveboard(board)){
            System.out.println("Solved!!");
        }
        else{
            System.out.println("Unsolvable Board");
        }
       printBoard(board);



    }

}
