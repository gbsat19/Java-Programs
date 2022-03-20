package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Palindrome{

    static boolean check_palindrome(int num){
        int original = num;
        int r_num = 0;
        int rem = 0;

        while(num>0){
            rem = num % 10;
            r_num = r_num * 10 + rem;

            num = num/10;
        }
        return (r_num == original);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        boolean result = check_palindrome(num);
        if(result){
            out.print("Palindromic Number");
        }
        else{
            out.print("Not Palindrome");
        }
    }
}
