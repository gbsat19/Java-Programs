package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;
import java.lang.Math;

public class Cinterest{
    public static void main(String[] args){
        //Method 1 using formula of CI
        // CI = P(1 + (r/n)/100)^nt)
        // t in years; n is number of times compounded;
        Scanner input = new Scanner(System.in);
        out.print("Enter principal: ");
        float p = input.nextFloat();
        out.print("Enter rate of interest per annum: ");
        float r = input.nextFloat();
        out.print("No. of times interest is compounded: ");
        int n = input.nextInt();
        out.print("Enter no of years of loan: ");
        float t = input.nextFloat();

        double m = (p*(1+(r/n)/100));
        float k = n*t;
//        out.println(m);
//        out.println(k);

//        int i =1;
//        double prod = 1;
//        while(i<=k){
//            prod = prod * m;
//            i = i+1;
//        }
//        out.print(prod);
        double ci = Math.pow(m, k);
        out.print("Interest compounded at the end of " + t + " is: " + ci);

    }
}
