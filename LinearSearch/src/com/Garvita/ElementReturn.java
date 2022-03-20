package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class ElementReturn{

    static int[] getArray(int size){
        Scanner input = new Scanner(System.in);
        int[] mat = new int[size];
        for(int i =0; i<mat.length; i = i+1){
            mat[i] = input.nextInt();
        }
        return mat;
    }

    static int returnElement(int[] mat, int num){
        for(int element: mat){
            if(element == num){
                return element; // Directly accessing element using ENHANCED FOR loop
            }
        }
        return Integer.MAX_VALUE;
       // Not a good idea as user confused whether -1 is array element or basuce element not found
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        if(size <= 0 ){
            out.print("-1");
        }
        else {
            int target = input.nextInt();

            int[] num = getArray(size); //To create and get array with input values

            int ans = returnElement(num, target); //To search for an element using linear search and
            // return elment if found
            out.print(ans);
        }
    }
}
