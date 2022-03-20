package com.Gravita;
import java.util.Scanner;
import static java.lang.System.out;
import java.lang.Math;

public class FutureValue{

    static double simple_fv(int amt, float rate, int time){
        double sfv = amt + amt*time*(rate/100);
        return sfv;
    }

    static double compound_fv(int amount, float rate, int time, int mul){
        double cfv = Math.pow(amount*(1 + ((rate/mul)/100)), mul*time);
        return cfv;
    }

    public static void main(String[] args){
        out.print("Main Menu: \n1. Simple Interest \n2.Compound interest");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if(choice == 1){
            out.println("Case of Simple Interest: ");
        }
        else {
            out.println("Case of compund interest: ");
        }
        out.print("Enter prinicpal amount: ");
        int p = input.nextInt(); //prinicpal
        out.print("Enter % rate of interest: ");
        float r = input.nextFloat(); //rate of interest in percentage
        out.print("Enter time in years: ");
        int t = input.nextInt(); //time in years
        int n; //times compunded in a year

        switch (choice) {
            case 1 -> {
                double sfv = simple_fv(p, r, t);
                out.print("future value: " + sfv);
            }
            case 2 -> {
                out.print("Enter number of times compunded in a year: ");
                n = input.nextInt();
                double cfv = compound_fv(p, r, t, n);
                out.print("future value: " + cfv);
            }
            default -> out.print("Enter a valid case!");
        }
    }
}