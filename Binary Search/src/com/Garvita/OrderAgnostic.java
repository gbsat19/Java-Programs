package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class OrderAgnostic{
    static int[] getSortedArray(int size){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];

        for(int i =0; i<arr.length; i = i+1){
            out.print("Enter element: ");
            arr[i] = input.nextInt();
        }
        return arr;
    }


    static boolean checkSortingType(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        return(arr[s]<arr[e]); //true if ascending ; false if descending
    }


    static int binSearch(int[] arr, boolean type, int target){ //return index of target element
        int s = 0;
        int e = arr.length -1;
        int mid;

        while(s<=e){
            mid = s + ((e-s)/2);
            if(target == arr[mid]){
                return mid;
            }
            if(type){
             //ascending
             if(target>mid){
                 s = mid +1;
             }
             else if(target<mid){
                 e = mid -1;
             }
            }
            else{
                //descending
                if(target>mid){
                    e = mid -1;
                }
                else if(target<mid){
                    s = mid +1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        //get sorted array
        Scanner input = new Scanner(System.in);
        out.print("Enter size of array: ");
        int size = input.nextInt();
        if(size>0){
            int[] arr = getSortedArray(size);

            //check array ascending or descending
            int start = 0;
            int end = arr.length - 1;

            boolean check = checkSortingType(arr);

            // Apply binary search accordingly
            out.print("Enter target element: ");
            int target = input.nextInt();

            int index = binSearch(arr, check, target);
            out.print(index);
        }
        else{
            out.print("Enter a valid size!");
        }
    }
}