package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class MinimumNumber{

    static int[] getArray(int size){
        int[] mat = new int[size];

        Scanner input = new Scanner(System.in);

        for(int i = 0 ; i<mat.length; i = i+1){
            out.print("Enter element: ");
            mat[i] = input.nextInt();
        }
        return mat;
    }

    static int minimumOfArray(int[] mat){
       int min = mat[0];
       for(int i =1; i<mat.length; i = i+1){
           if(mat[i]<min){
               min = mat[i];
           }
       }
       return min;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        if(size>=0){
         int[] num = getArray(size);
            int min = minimumOfArray(num);
            out.print("Minimum of Array is: " + min);
        }
        else{
            out.print("Enter a valid size");
        }
    }
}
