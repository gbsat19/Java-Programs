package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Armstrong{

    static boolean check_armstrong(int number){
        int rem = 0;
        int original = number;
        int sum = 0;
        while(number>0){
            rem = number%10;
            sum = sum +rem*rem*rem;

            number = number/10;
        }
        return (original == sum);
    }

    public static void main(String[] args){

        out.print("3 digit armstrong numbers are: ");
        for(int i =100; i<=999; i=i+1){
            boolean value = check_armstrong(i);
            if (value) {
                out.print(i + " ");
            }
        }
    }
}