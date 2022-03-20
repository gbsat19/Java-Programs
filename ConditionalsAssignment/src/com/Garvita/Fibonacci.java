package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Fibonacci{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n =  input.nextInt();
        int a = 0;
        int b = 1;
        out.print(a + " " + b + " ");
        int sum = 0;

        int i = 3;
        while(i<=n)
        {
            sum = a +b;
            out.print(sum + " ");
            a=b;
            b=sum;

            i = i+1;
        }

    }
}