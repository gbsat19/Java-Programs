package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class BasicsFunctions {
    public static void main(String[] args){
    /*    henlo(); //henlo is a function with NO RETURN TYPE; it simply prints string output

        sum(); //sum is a function with NO RETURN TYPE; it simply prints the sum

        int ans = product();
        //product is a function with INTEGER return type; it returns product of 2 nos.
        //product simply returns value and stores it in reference variable ans; no printing
        out.println("Product of 2 numbers is " + ans);

        int a = anything();
        out.print(a);
    */
        String str = quote();
        out.println(str);

    }
    static void henlo(){
        out.println("Hello World!!!!!!!!!!!!!!!!!!");
    }

    static void sum(){
        Scanner input = new Scanner(System.in);
        out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        out.println("Sum is " + sum);
    }

    static int product(){
        Scanner input = new Scanner(System.in);
        out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        int prod = num1*num2;
        return prod;
    }

    static String quote(){
        Scanner input = new Scanner(System.in);
        out.print("Enter a string: ");
        String strl = input.nextLine();
        return strl;
    }

    static int anything(){
        return 23;
    }
}

