package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class SearchIn2D{

    static int[][] getMatrix(int sr, int cr){
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[sr][cr];

        for(int i = 0; i<arr.length; i = i + 1){
            for(int j = 0; j<arr[i].length; j = j + 1){
                out.print("Enter value: ");
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }


    static boolean searchElement(int[][] arr, int element){
        for(int i = 0; i<arr.length; i = i= i + 1){
            for(int j =0; j<arr[i].length; j = j+1){
                if(arr[i][j] == element){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();

        if(row<=0){
            out.print("Enter a valid row size!");
        }
        else{
            int col = input.nextInt();
            int[][] mat = getMatrix(row, col);
            out.print("Enter element to be searched: ");
            int num = input.nextInt();

            boolean value = searchElement(mat,num);
            if(value){
                out.print("Element FOUND in matrix");
            }
            else{
                out.print("Element NOT FOUND in matrix");
            }
        }
    }
}