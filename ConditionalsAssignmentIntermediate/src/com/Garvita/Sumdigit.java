package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Sumdigit{

    static int sum_of_digits(int number){

        int sod = 0;
        int rem = 0;
        while(number>0){
            rem = number%10;
            sod = sod+rem;

            number = number/10;
        }
        return sod;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.print("Enter number: ");
        int num = input.nextInt();

        int sum = sum_of_digits(num);
        out.println("Number: " + num);
        out.print("Sum of digits of number: " + sum);
    }
}