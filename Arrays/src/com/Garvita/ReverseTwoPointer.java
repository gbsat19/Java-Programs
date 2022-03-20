package com.Gravita;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;

public class ReverseTwoPointer{

    //function to reverse inputted array
    static int[] reverse_arr(int[] mat){
        int start = 0;
        int end = mat.length - 1;
        int temp;

        //reversing array using 2 pointer method
        while(start<end){  //when start> end we have crossed mid-point
            temp = mat[start];
            mat[start] = mat[end];
            mat[end]  = temp;

            start = start + 1;
            end = end - 1;
        }

        return mat; //returning reversed array
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.print("Enter size: ");
        int size = input.nextInt(); //Inputting array size

        int[] nums = new int[size]; //Declaration and Initialisation of Array

        //Inputting values in array
        for(int i =0; i<nums.length ; i= i+1){
            out.print("Enter number: ");
            nums[i] = input.nextInt();
        }

        //Calling function to reverse the array
        int[] num = reverse_arr(nums);

        //printing reversed array
        out.print("Reversed array is: " + Arrays.toString(num));




    }

}
