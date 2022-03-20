package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;
import java.lang.Math;

public class Distance{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.print("Enter x2 coordinate:");
        float x2 = input.nextFloat();
        out.print("Enter y2 coordinate:");
        float y2 = input.nextFloat();
        out.print("Enter x1 coordinate:");
        float x1 = input.nextFloat();
        out.print("Enter y1 coordinate:");
        float y1 = input.nextFloat();

        double dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),2));
        out.print("Distance between two points is: "+  dist);
    }
}
