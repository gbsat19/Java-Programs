package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class BaseCodeDescending{
    static boolean binSearch(int[] mat, int targ){
        int start = 0;
        int end = mat.length - 1;

        int mid;
        while(start <= end){
            mid = start + ((end - start)/2);

            if(mat[mid] == targ){
                return true;
            }
            else if(mat[mid]>targ){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }

    static int binSearchIndex(int[] mat, int target ){
        int start = 0;
        int end = mat.length - 1;
        int mid;

        while(start<=end){
            mid = start + ((end - start)/2);

            if(mat[mid] == target){
                return mid;
            } else if (mat[mid]>target){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        //Array given in descending order: largest to smallest
        int[] a = {8,7,6,5,4,3,2,1};

        Scanner input = new Scanner(System.in);
        out.print("Enter target element to be searched: ");
        int target = input.nextInt();
        boolean ans = binSearch(a, target);
        int index = binSearchIndex(a, target);
        if(ans){
            out.println("Element found");
            out.println("At index: " + index);
        }
        else{
            out.println("Element NOT found");
            out.print(index);
        }
    }
}

