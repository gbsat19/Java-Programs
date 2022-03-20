package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class TwoD_VarCol {
    public static void main(String[] args) {
        int[][] fun = {
                {1, 2, 3, 4, 5},
                {1, 2, 3},
                {1}
        };

        //Printing a 2D matrix of variable column length

        for (int row = 0; row < fun.length; row = row + 1) {
            for (int col = 0; col < fun[row].length; col = col + 1) {
                out.print(fun[row][col] + " ");
            }
            out.println();
        }
        // Cannot input a 2D Matrix of variable column length using conventional for loop
        //Because we won't be able to define the column break of a row
        //So think of ArrayList

    }
}
