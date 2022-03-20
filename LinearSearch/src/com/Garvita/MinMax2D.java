package com.Garvita;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;

public class MinMax2D {
    static int[][] getMatrix(int nr, int nc){
        int[][] mat = new int[nr][nc];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i<mat.length; i = i+1){
            for(int j= 0; j<mat[i].length; j= j+1){
                out.print("Enter element: ");
                mat[i][j] = input.nextInt();
            }
        }
        return mat;
    }

    static int maxMatrix(int[][] num){
        int max = Integer.MIN_VALUE;
        for(int[] value: num){
            for(int vale: value){
                if(vale>max){
                    max = vale;
                }
            }
        }
        return max;
    }

    static int minMatrix(int[][] num){
        int min = Integer.MAX_VALUE;
        for(int[] nums: num){
            for(int val: nums){
                if(val<min){
                    min = val;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        out.print("Enter no.of rows: ");
        int row = input.nextInt();
        if (row <= 0) {
            out.print("Enter a valid size!");
        } else {
            out.print("Enter column size: ");
            int col = input.nextInt();
            if(col>0){
                int[][] mat = getMatrix(row, col);
                int max_value = maxMatrix(mat);
                int min_value = minMatrix(mat);
                out.println("Max value in matrix is: " + max_value);
                out.print("Min value in matrix is: " + min_value);
            }
            else{
                out.print("Enter valid column size!");
            }
        }
    }
}
