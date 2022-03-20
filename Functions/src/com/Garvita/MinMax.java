package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class MinMax{

    static int maximum(int a, int b, int c){
        int max;

        if(b>a && b>c){
            max =b;
        }
        else if (c>a && c>b){
            max = c;
        }
        else
        {
            max = a ;
        }
        return max;
    }

    static int minimum(int a, int b, int c){
        int min;
        if(b<a && b<c){
            min = b;
        }
        else if(c<a && c<b){
            min = c;
        }
        else{
            min =a;
        }
        return min;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.print("Enter number: ");
        int a = input.nextInt();
        out.print("Enter number: ");
        int b= input.nextInt();
        out.print("Enter number: ");
        int c = input.nextInt();

        int ans1 = maximum(a,b,c);
        out.println("Maximum: " + ans1);

        int ans2 = minimum(a,b,c);
        out.print("Minimum number is: " + ans2);
    }
}
