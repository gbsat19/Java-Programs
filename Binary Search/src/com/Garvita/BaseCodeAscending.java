package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class BaseCodeAscending {

    static boolean binSearch(int[] mat, int targ){
        int start = 0;
        int end = mat.length -1;
        int mid;

        while(start<=end){
            mid = start + ((end-start)/2);

            if(mat[mid] == targ){
                return true;
            }
            else if(targ>mat[mid]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return false;
    }

    static int binSearchA(int[] mat, int targ){
        //To return index

        int start = 0;
        int end = mat.length - 1;
        int mid;

        while(start <= end){
            mid= start + ((end - start)/2);

            if(mat[mid] == targ){
                return mid;
            }
            else if(mat[mid]<targ){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        //Given array in ascending order
        int[] a = new int[] {1,2,3,4,5,6,7};

        //Code for binary search
        Scanner input = new Scanner(System.in);
        out.print("Enter target element to be searched: ");
        int target = input.nextInt();

        boolean ans = binSearch(a, target);
        int index = binSearchA(a,target);
        if(ans){
            out.println("Element found");
            out.print("Found at index: " + index);
        }
        else{
            out.println("Element not found");
            out.print(index);
        }

    }
}