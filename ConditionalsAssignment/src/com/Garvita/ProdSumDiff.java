package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;
import java.lang.Math;

public class ProdSumDiff{
    public static void main(String[] args){
        out.println("This is a program to print diff of Product & Sum of digits.");
        Scanner input = new Scanner(System.in);
        out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = 0;
        int rem = 0;
        int diff = 0;
        int prod = 1;

        if(n>1 && n<Math.pow(10,5))
        {
            while(n>0)
            {
               rem = n%10;
               prod = prod*rem;
               sum = sum + rem;

               n = n/10;
            }
            diff = prod - sum;
            out.print("The result is: " + diff);
        }
        else
        {
            out.print("Enter a number between 1 and 10,000!");
        }


    }
}