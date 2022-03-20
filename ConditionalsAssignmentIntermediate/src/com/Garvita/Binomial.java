package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Binomial{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.println("This program calculates and prints npr and ncr");
        //ncr = n!/(r!*(n-r)!)
        //npr = n!/(n-r)!
        out.print("Enter value of n: ");
        int n = input.nextInt();
        out.print("Enter value of r: ");
        int r = input.nextInt();

        //To calculate n!
        int i = 1;
        int prod1 = 1;
        while(i<=n){
            prod1 = prod1*i;

            i= i+1;
        }
        out.println("n! " + prod1);

        //To calculate r!
        int k =1;
        int prod2 = 1;
        while(k<=r){
            prod2 = prod2*k;

            k = k+1;
        }
        out.println("r! " + prod2);

        //To calculate (n-r)!
        int m = 1;
        int prod3 = 1;
        while(m<=n-r){
            prod3 = prod3*m;

            m = m + 1;
        }
        out.println("(n-r)! " + prod3);
        double ncr = prod1/(prod2*prod3);
        double npr = prod1/prod3;

        out.println("ncr " + ncr);
        out.print("npr " + npr);
    }
}