package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class InputsLargest{
    public static void main(String[] args){
        int largest = 0;

        Scanner input = new Scanner(System.in);
        out.print("Enter a number: ");
        int num = input.nextInt();
        while(num!=0){
            if(num>largest){
                largest = num;
            }
            out.print("Enter a number: ");
            num = input.nextInt();
        }
        out.print("The largest of all inputs is: " + largest);
    }
}

