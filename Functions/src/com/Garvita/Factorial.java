package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Factorial{
    static int fact(int num){

        int prod =1;
        int k =2;
        while(k<=num){
            prod = prod*k;

            k = k+1;
        }
        return prod;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         int num = input.nextInt();

         int ans = fact(num);
         out.print("Factorial: " + ans);
    }
}