package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class CeilFloorValues{
    static int[] getArray(int size){
        Scanner input = new Scanner(System.in);
        int[] mat = new int[size];

        for(int i =0; i<mat.length; i = i+1){
            out.print("Enter number: ");
            mat[i] = input.nextInt();
        }
        return mat;
    }

    static boolean checkArrayType(int[] arr){
        int start =0 ;
        int end = arr.length -1;

        return (arr[start]<arr[end]);
        //returns true if ascending
        //returns false if descending
    }

    static int getFloorVal(int[] arr, boolean type, int target){
        int start =0;
        int end = arr.length -1;
        int mid;

        while(start<=end){
            mid = start + ((end - start)/2);
            if(arr[mid] == target){
                return arr[mid];
            }
            if(type){
                //ascending sorted array
                if(target<arr[start]){
                    return -1;
                }
                if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid +1;
                }
            }
            else{
                //descending sorted array
                if(target<arr[end]){
                    return -1;
                }
                if(target>arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return arr[end];
    }

    static int getCeilVal(int[] arr, boolean type, int target){
        int start = 0 ;
        int end = arr.length -1;
        int mid;
        while(start<=end){
            mid = start + ((end-start)/2);
            if(arr[mid] == target){
                return arr[mid];
            }
            if(type){
                //ascending array
                if(target>arr[end]){
                    return -1;
                }
                if(target<arr[mid]){
                    end = mid -1;
                }
                else {
                    start = mid +1;
                }
            }
            else{
                //descending array
                if(target>arr[start]){
                    return -1;
                }
                if(target>arr[mid]){
                    end = mid -1;
                }
                else {
                    start = mid +1;
                }
            }

        }
        return arr[start];
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.print("Enter size of array: ");
        int size = input.nextInt();
        //get size of array

        if(size>0){
            //get sorted array
            int[] arr = getArray(size); //For ascending case

            //get target value
            out.print("Enter target variable: ");
            int target = input.nextInt();

            //apply binary search and give back ceil and floor values
            boolean check = checkArrayType(arr);
            int floor = getFloorVal(arr, check, target);
            int ceil = getCeilVal(arr, check, target);
            out.println("Floor value of target: " + floor);
            out.print("Ceil Value of target: " + ceil);
        }
        else{
            out.print("Enter a valid value!");
        }
    }
}
