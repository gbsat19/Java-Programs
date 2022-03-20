package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Avg_Marks{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.print("Enter the number of subjects: ");
        int n = input.nextInt();
        float marks = 0;
        double sum = 0;

        int i = 1;
        while(i<=n){
            out.print("Enter marks out of 100: ");
            marks = input.nextFloat();
            if (marks<=100) {
                sum = sum+ marks;
            }
            else {
                out.print("Enter a valid score: ");
                marks = input.nextFloat();
                sum = sum + marks;
            }

            i = i+1;
        }
        double average = sum/n ;
        out.print("Enter average marks: " + average);
    }
}