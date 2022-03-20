package com.Garvita;
import static java.lang.System.out;
import java.util.Arrays;

public class MaxArr{

    static int maxArr(int[] mat){
        int max = mat[0];
        for(int i = 1; i<mat.length; i++){
            if(mat[i]>max){
                max = mat[i];
            }
        }
        return max;
    }

    public static void main(String[] args){

        int[] arr = new int[] {1,2,89,67,45,102, 67, 178, 90, 5, 2};
        int value = maxArr(arr);
        out.print("Max value in array is: " + value);
    }
}