package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class SearchInRange{
    static int[] getArray(int size){
        Scanner input = new Scanner(System.in);
        int[] mat = new int[size];
        for(int i =0; i<mat.length; i = i+1){
            out.print("Enter a number: ");
            mat[i] = input.nextInt();
        }
        return mat;
    }

    static boolean searchElement(int[] mat, int element, int si, int ei){
        while(si<=ei){
            if(mat[si] == element){
                return true;
            }
             si = si+1;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.print("Enter size of array: ");
        int size = input.nextInt();
        if(size<=0){
            out.print("Enter a valid size!");
        }
        else{
            int[] num = getArray(size);
            out.print("Enter element to be searched: ");
            int element = input.nextInt();
            out.print("Enter range starting index: ");
            int si = input.nextInt();
            out.print("Enter range ending index: ");
            int ei = input.nextInt();
            boolean result = searchElement(num, element, si, ei);
            if(result){
                out.print("Number in specified range");
            }
            else{
                out.print("Number not in specified range");
            }
        }
    }
}