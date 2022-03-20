package com.garvita;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;

public class ArrFunctions{

    static void changeArr(int[] arr){
        arr[0] = 99;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.print("Enter array size: ");
        int size = input.nextInt();
        int[] r = new int[size];

        for(int i = 0; i<r.length; i = i+1){
            out.print("Enter value: ");
            r[i] = input.nextInt();
        }
        out.print(Arrays.toString(r));
        changeArr(r);
        out.print(Arrays.toString(r));
    }
}
