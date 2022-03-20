package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class PerfectNumber{

    static boolean check_perfect_number(int number){
        int sum = 0;
        int k;
            k=1;
            while(k<number){
                if(number% k == 0){
                    sum = sum + k;
                }
                k = k+1;
            }
            out.println(number);
            out.println(sum);
            return(number == sum);
    }

    public static void main(String[] args){
        //Number is perfect if number = sum of factors

        out.println("This program checks for perfect numbers: ");
        Scanner input = new Scanner(System.in);
        out.print("Enter a number: ");
        int num = input.nextInt();

        boolean result = check_perfect_number(num);
        out.print(result);
    }
}