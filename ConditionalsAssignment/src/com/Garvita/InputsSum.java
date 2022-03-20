package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class InputsSum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;

        out.print("Enter a number: ");
        int num = input.nextInt();
        while(num!=0){
            sum = sum + num;
            out.print("Enter a number: ");
            num = input.nextInt();
        }
        out.print("Sum is: " + sum);
    }
}