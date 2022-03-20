package com.Garvita;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.out;

public class Practise{
    public static void main(String[] args){

        //CASE 1 -> ArrayLiteral of primitves
        int[] values =  {1, 2, 3, 4, 5};

        //Simple for loop
        //Accessing individual elements by indices
       for(int i  = 0; i<values.length; i = i+1){
           out.print(values[i] + " ");
       }

       //Enhanced for loop
        //Accessing elements one by one
        for (int val: values){
            out.print(val);
        }

       //Printing the entire array in one go using Arrays.toString() method
       out.print(Arrays.toString(values));

       // NOTE:
        // if calling out.print(values) indice wise giving correct value
        // if trying to display entirely giving arbitrary value

        //CASE 2 ->Array of Primitives
        /*Scanner input = new Scanner(System.in);
        float[] ans = new float[10];
        for(int i = 0; i<ans.length; i = i+1){
            ans[i] = input.nextFloat();
        }
        out.print(Arrays.toString(ans));*/

        //CASE 3 -> Array of Non - Primitves
        String[] fun;
        fun = new String[5];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i<fun.length; i = i+1){
            fun[i] = input.next().trim();
        }
        out.print(Arrays.toString(fun));
        fun[4] = "Ansh"; //You can directly access ref variables and modify value stored in them
        out.print(Arrays.toString(fun));
    }
}


        //Create and display string array literal
