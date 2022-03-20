package com.Garvita;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
import static java.lang.System.out;

public class EvenDigitCount{

    static int[] getArray(int size){
        int[] mat = new int[size];
        Scanner input = new Scanner(System.in);

        for(int i =0; i<mat.length; i = i+1){
            out.print("Enter element: ");
            mat[i] = input.nextInt();
        }
        return mat;
    }

    static int evenDigitCount(int[] mat){
        int[] k = new int[mat.length];
//        k[0] = 0;
// k counts number of digits of each element of array

        for(int i= 0; i<mat.length; i= i+1){
//            int rem = 0; NOT REQUIRED
            if(mat[i]<0){
                mat[i] = Math.abs(mat[i]);
            }

            while(mat[i]>0){ //only valid for positive numbers; Convert negative to positive
//               rem = mat[i]%10;
               mat[i] = mat[i]/10;

               k[i] = k[i]+1;
            }
        }
//        out.print(Arrays.toString(k));
        int m =0; // m counts number of elements with even digits in array
        for(int i =0; i<k.length; i = i+1){
            if(k[i]%2 == 0){
                m = m+1;
                if(k[i] == 0){
                    m = m-1;
                }
            }
        }
        return m;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        out.print("Enter number of elements in array: ");
        int size = input.nextInt();
        if(size>0){
            int[] mat = getArray(size);
            int edigits = evenDigitCount(mat);
            out.print("Total even digits in array is: " + edigits);
        }
        else{
            out.print("Enter a valid size!");
        }
    }
}
