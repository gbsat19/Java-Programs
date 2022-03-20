package com.Garvita;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;

public class ElementFoundOrNot {

    static boolean find_element(int[] arr, int num){
        for(int i = 0; i<arr.length; i= i+1){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int target = input.nextInt();
        int[] num = new int[size];

        for(int i = 0; i<num.length; i = i+1){
            num[i] = input.nextInt();
        }

        if(num.length<=0){
            out.print("Enter a valid size of array!");
        }
        else{
            boolean ans = find_element(num, target);
            if(ans){
                out.print("Element found!");
            }
            else {
                out.print("Element not found!");
            }
        }
    }
}