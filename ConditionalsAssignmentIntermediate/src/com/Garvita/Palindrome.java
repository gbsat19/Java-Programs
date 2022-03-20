package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Palindrome{

    static boolean palindrome_check(int number){

        int original = number;
        int rem = 0;
        int sum = 0;
        while(number>0){
            rem = number%10;
            sum = sum*10 + rem;

            number = number/10;
        }
        return (original == sum);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        boolean value = palindrome_check(num);
        out.print(value);
    }
}