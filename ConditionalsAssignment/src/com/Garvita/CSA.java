package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class CSA{
    public static void main(String[] args)
    {
        out.println("This program computes CSA of a cylinder.");
        Scanner input = new Scanner(System.in);
        float r = input.nextFloat();
        float h = input.nextFloat();
        double csa = 2*3.14*r*h;
        out.print("The CSA of cylinder is: " + csa);
    }
}