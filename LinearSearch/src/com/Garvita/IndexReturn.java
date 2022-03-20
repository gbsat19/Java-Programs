package com.Garvita;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;

public class IndexReturn{

    static int findElement_Index(int[] mat, int ele){
        for(int i = 0; i<mat.length; i = i+1){
            if(mat[i] == ele) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int target = input.nextInt();

        int[] num = new int[size];

        for(int i = 0; i <num.length; i = i+1){
            num[i] = input.nextInt();
        }

        if(num.length == 0 ){
            out.print("Eneter a vlid size of array!!");
        }
        else{
            int index = findElement_Index(num, target);
            out.print(index);
        }
    }

}