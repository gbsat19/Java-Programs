package com.Garvita;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;

public class MaxWealth{

    static int[][] getMatrix(int row, int col){
        int[][] mat = new int[row][col];

        Scanner input = new Scanner(System.in);
        for(int i =0; i < mat.length; i = i + 1){
            for(int j = 0; j < mat[i].length; j = j + 1){
                out.print("Enter a number: ");
                mat[i][j] = input.nextInt();
            }
        }
        return mat;
    }

    static int maxWealth(int[][] mat){
        //Find sum of each array
        int[] sum = new int[mat.length];

        int i =0;

        for(int[] arr: mat){
            for(int value: arr){
                sum[i]  = sum[i] + value;
            }
            i = i+1;
        }

        int max = getMax(sum);
        return max;
    }

    static int getMax(int[] sum){
        int max = Integer. MIN_VALUE;

        for(int ele: sum){
            if(ele>max){
                max = ele;
            }
        }
        return max;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        out.print("Enter row size: ");
        int row = input.nextInt();
        if(row>0){
            out.print("Enter number of columns: ");
            int col = input.nextInt();
            if(col>0){
               int[][] mat = getMatrix(row, col);
               int max = maxWealth(mat); //Array because 2 or more people can have the same wealth
               out.print(max);

            }
            else{
                out.print("Enter a vlaid size!");
            }
        }
        else{
            out.print("Enter a valid size");
        }
    }
}




