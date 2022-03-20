package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Sum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        out.print("Enter 2nd number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        out.print("Sum is: " + sum);

    }
}
