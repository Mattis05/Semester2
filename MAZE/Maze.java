package MAZE;

import java.util.Arrays;
import java.util.Objects;

public class Maze {

    static boolean isSafe(int[][] maze,int row, int column){
        return(row< maze.length && column< maze.length&&column>=0&&row>=0 && maze[row][column]==1);

    }
    static boolean findPathUtil(int[][] maze, int[][] solution,int row, int column){
        if(row== maze.length-1 && column== maze.length-1 && maze[row][column]==1){
            solution[row][column]=1;
            return true;

        }

        if(isSafe(maze,row+1,column)){
            solution[row][column]=1;
            if(findPathUtil(maze,solution,row+1,column)){
                return true;
            }
            solution[row][column]=0;
            return false;
        }
        if(isSafe(maze,row,column+1)){
            solution[row][column]=1;
            if(findPathUtil(maze,solution,row,column+1)){
                return true;
            }
            solution[row][column]=0;
            return false;

        }
        //Here i tried to implement that i can go left and right but it Doesnt work..
        if(isSafe(maze,row-1,column)){
            solution[row][column]=1;
            if(findPathUtil(maze,solution,row-1,column)){
                return true;
            }
            solution[row][column]=0;
            return false;
        }
        if(isSafe(maze,row,column-1)){
            solution[row][column]=1;
            if(findPathUtil(maze,solution,row,column-1)){
                return true;
            }
            solution[row][column]=0;
            return false;
        }

        return false;
    }

    static void findPath(int[][] maze, int n){
        int solution[][]=new int[n][n];
        if(findPathUtil(maze,solution,0,0)){
            MazePrinter(solution);

        }
        else{
            System.out.println(" NO SOLUTION ");
        }
    }

    static public void MazePrinter (int[][] maze){
            for (int row = 0; row < maze.length; row++) {
                for (int column = 0; column < maze.length; column++) {
                    System.out.print(maze[row][column] + " ");
                }
                System.out.println();

            }
        }

    public static void main(String[] args) {

        int[][] maze={
                {1,1,1,1,1},
                {1,0,0,1,1},
                {0,1,1,1,0},
                {0,1,0,0,0},
                {0,1,1,1,1},
        };
        /*
int[][] maze={
                {1,1,0,0},
                {1,1,0,0},
                {1,1,0,0},
                {0,1,1,1}
                };
                   */
        int n = maze.length;
        findPath(maze,n);
    }

}
