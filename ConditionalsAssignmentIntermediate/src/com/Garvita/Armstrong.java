package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;
import java.lang.Math;

public class Armstrong{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.print("Enter a number: ");
        int num = input.nextInt();
        int original = num;
        int original_value = num;
//        out.print("Enter number of digits: ");
//        int n = input.nextInt();
        int rem;
        int k =0; //No.of digits;

        //To find no of digits in armstrong number
        while(num>0){
            rem = num%10;

            num = num/10;
            k = k+1;
        }

        double sum = 0;

        // To check if number is armstrong or not
        while(original>0){
            rem = original%10;
            sum = sum + Math.pow(rem, k);

            original = original/10;
        }
        out.println(sum);
        if(original_value == sum){
            out.print("Armstrong number!");
        }
        else{
            out.print("Not Armstrong.");
        }

    }
}