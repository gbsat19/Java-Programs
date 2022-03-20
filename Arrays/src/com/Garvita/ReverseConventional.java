package com.Garvita;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;

public class ReverseConventional {

    //Function to reverse an array using conventional method
    static int[] reverse_array(int[] num, int size){
        int mid, temp;

        // For even size of array
        if(size % 2 == 0){
            mid = (size/2) ;
        }
        //For odd size of array
        else{
            mid = (size - 1)/2;
        }

        //Reversing values of array till mid point
        for(int i =0; i<mid; i = i+1){
            temp = num[i];
            num[i] = num[size-1 -i];
            num[size - 1 -i] = temp;
        }
        return num;
    }

    //Calling the main method
    public static void main(String[] args){

        //Inputting size of array
        Scanner input = new Scanner(System.in);
        out.print("Enter size of array: ");
        int size = input.nextInt();

        //Declaration and Initialisation of an array
        int[] arr = new int[size];

        //Inputing elements in an array
        for(int i = 0; i<arr.length; i = i +1){
            out.print("Enter number: ");
            arr[i] = input.nextInt();
        }

        //Calling the reverse array function
        int[] rev = reverse_array(arr,size);

        //Printing reversed array
        out.print(Arrays.toString(rev));

    }
}