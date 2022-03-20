package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Circle{
    static double circumference(float radius){
        double perimeter = 2*3.14*radius;
        return perimeter;
    }
    static double area(float radius){
        double area = 3.14*radius*radius;
        return area;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float r = input.nextFloat();
        double ans1 = circumference(r);
        out.println("Circumference of circle: " + ans1);
        double ans2 = area(r);
        out.print("Area of circle: " + ans2);
    }
}