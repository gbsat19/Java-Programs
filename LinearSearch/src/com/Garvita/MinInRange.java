package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class MinInRange{

    static int[] getArray(int size){
        Scanner input = new Scanner(System.in);

        int[] mat = new int[size];

        for(int i =0; i<mat.length; i = i+1){
            mat[i] = input.nextInt();
        }
        return mat;
    }

    static int minimumRange(int[] arr, int si, int ei){
        int min = arr[si];
        for(int i =si; i<= ei ; i = i+1){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        if(size<=0){
            out.print("Enter a valid size!");
        }
        else{
            int[] num = getArray(size);
            int si = input.nextInt();
            int ei = input.nextInt();
            int min_value = minimumRange(num, si, ei);
            out.print("Minimum value in given range is: " + min_value);
        }

    }
}