package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Hcf{

    static int hcf_numbers(int n1, int n2){
        int hcf = 1;
        int min;

        if(n1<=0 || n2<=0){
            hcf = 0;
            return hcf;
        }

        else{

         int k = 1;

         if(n1>n2){
             min = n2;
         }
         else if(n2>n1){
             min = n1;
         }
         else {
             min = n1;
         }

         while(k<=min){
             if(n1 % k == 0 && n2 % k ==0){
                 if(k>hcf){
                     hcf = k;
                 }
             }
             k = k+1;
         }
         return hcf;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        out.print("Enter 2nd number: ");
        int num2 = input.nextInt();

        int hcf = hcf_numbers(num1, num2);
        out.print("HCF of two numbers is: " + hcf);
    }
}
