package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Factorial{
    public static void main(String[] args){
        out.print("This is to find factorial of a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int prod = 1;

        if(num>0){
            int i=1;
            while(i<=num){
                prod = prod*i;
                i = i + 1;
            }
            out.print("Factorial of " + num + " is " + prod);
        }
        else if(num == 0){
            out.print("0 factorial is 1");
        }
        else{
            out.print("Enter a valid number.");
        }
    }
}