package com.Garvita;
import java.util.Scanner;
import java. util.Arrays;
import static java.lang.System.out;

public class TwoDFunc{

    static int[][] input2D(){
        Scanner input = new Scanner(System.in);
        out.print("enter no.of rows: ");
        int r = input.nextInt();
        out.print("enter no.of columns: ");
        int c = input.nextInt();
        int[][]mat = new int[r][c];

        for(int row = 0; row < mat.length; row = row + 1){
            for(int col = 0; col<mat[row].length; col = col + 1){
                out.print("Enter element: ");
             mat[row][col] = input.nextInt();
            }
        }
        return mat;
    }

    static void print2D(int[][] matrix){
        for(int row = 0; row < matrix.length; row = row + 1){
            out.println(Arrays.toString(matrix[row]));
        }

    }

    public static void main(String[] args){
        out.println("This program is to input and output a 2d matrix.");
        int[][] mat = input2D();
        print2D(mat);
    }
}

