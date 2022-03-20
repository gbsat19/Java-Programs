package com.Gravita;
import javax.swing.*;
import java.util.Scanner;
import static java.lang.System.out;

public class MonthandDays{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.print("Enter month number: ");
        int month = input.nextInt();
        int days;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month ==8 || month ==10 || month ==12)
        {
            days =31;
            int k =1;
            out.println("Kunal can go out on below mentioned dates: ");
            while(2*k<=days){
                out.print(2*k + " ");

                k = k+1;
        }
        }
        else if(month == 2){
            days = 28;
            int k =1;
            out.println("Kunal can go out on below mentioned dates: ");
            while(2*k<=days){
                out.print(2*k + " ");

                k = k+1;
            }
        }
        else
        {
            days = 30;
            int k =1;
            out.println("Kunal can go out on below mentioned dates: ");
            while(2*k <= days){
                out.print(2*k + " ");

                k = k+1;
            }
        }
    }
}