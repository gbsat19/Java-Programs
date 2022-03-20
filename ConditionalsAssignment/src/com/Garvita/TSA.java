package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;
import java.lang.Math;

public class TSA{
    public static void main(String[] args){
        out.println("This program computes TSA of a cube.");
        out.print("Enter length of one side of cube: ");
        Scanner input = new Scanner(System.in);
        float side = input.nextFloat();
        double tsa = 6*Math.pow(side,2);
        out.print("TSA of cube is: " + tsa);
    }
}