package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Factors{
    public static void main(String[] args){
        out.println("This program prints all the factors of a number.");
        Scanner input = new Scanner(System.in);
        out.print("Enter a number: ");
        int num = input.nextInt();
        int fact = 0;

        out.println("Factors are: ");
        int i = 1;
        while(i<=num)
        {
            if(num%i == 0){
                fact = i;
                out.print(i + " ");
            }
            i = i+1;
        }
    }
}