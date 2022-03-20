package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class BasicParameterisedFunctions{
    public static void main(String[] args){
//        int ans = diff(10,6);
//        out.print("Difference is: " + ans);
        Scanner input = new Scanner(System.in);
        String name = input.next();
        String result = greet(name);
        out.print("\n" + result);
    }
    static String greet(String name){
        String value = "Adios " + name;
        return value;
    }
    static int diff(int a, int b){
        int diff = a-b;
        return diff;
    }
}