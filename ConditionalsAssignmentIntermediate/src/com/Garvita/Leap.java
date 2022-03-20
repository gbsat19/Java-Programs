package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Leap{
// A Year is a leap year if it is divisible by 4 and not by 100 or by 400;
    static boolean check_leap_year(int yr){
        return ((yr % 4 == 0 && yr % 100!= 0) || yr % 400 == 0);
    }
    public static void main(String[] args){
        out.print("This is to check if a year is leap or not!");
        Scanner input = new Scanner(System.in);
        out.print("Enter a year: ");
        int year = input.nextInt();

        boolean value = check_leap_year(year);
        out.println(value);
    }
        }