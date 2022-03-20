package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Average{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.print("Enter the number of values for caluclating average: ");
        int n = input.nextInt();
        float sum = 0;
        int num;

        int i = 1;
        while(i<=n){
            out.print("Enter the number: ");
            num = input.nextInt();
            sum = sum + num;

            i = i+1;
        }
        float average = sum / n;
        out.print("The average is: " + average);
    }
}