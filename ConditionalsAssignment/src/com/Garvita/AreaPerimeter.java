package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;
import java.lang.Math;

public class AreaPerimeter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.print("Enter the shape whose area and perimeter you want: ");
        String shape = input.next().trim();

        switch (shape) {
            case "Circle" -> {
                out.print("Enter radius of circle: "); float radius = input.nextFloat();
                double perimeter = 2 * 3.14 * radius;
                double area = 3.14 * Math.pow(radius, 2);
                out.println("The area of circle is: " + area);
                out.print("The perimeter of circle is: " + perimeter);
            } case "Triangle" -> {
                out.print("Enter 3 sides of triangle: "); float s1 = input.nextFloat();
                float s2 = input.nextFloat();
                float s3 = input.nextFloat();
                double perimeter = s1 + s2 + s3;
                double s = perimeter / 2;
                double ar = s * (s - s1) * (s - s2) * (s - s3);
                double area = Math.sqrt(ar);
                out.println("The area of circle is: " + area);
                out.print("The perimeter of circle is: " + perimeter);
            } case "Rectangle" -> {
                out.print("Enter length of rectangle: "); float length = input.nextFloat();
                out.print("Enter breadth of rectangle: "); float breadth = input.nextFloat();
                double perimeter = 2 * (length + breadth);
                double area = length * breadth;
                out.println("The area of circle is: " + area);
                out.print("The perimeter of circle is: " + perimeter);
            } case "Isoceles Triangle" -> {
                out.print("Enter common side of triangle: "); float side1 = input.nextFloat();
                out.print("Enter 3rd side of triangle: "); float side2 = input.nextFloat();
                out.print("Enter angle between the 2 sides: ");
                float angle = input.nextFloat();
                double perimeter = 2 * side1 + side2;
                double area = 0.5 * side1 * side2 * Math.sin(angle);
                out.println("The area of circle is: " + area);
                out.print("The perimeter of circle is: " + perimeter);
            } case "Parallelogram" -> {
                out.print("Enter length of parallelogram: "); float length = input.nextFloat();
                out.print("Enter breadth of parallelogram: "); float breadth = input.nextFloat();
                out.print("Enter height of parallelogram: ");
                float height = input.nextFloat();
                double perimeter = 2 * (length + breadth);
                double area = length * height;
                out.println("The area of circle is: " + area);
                out.print("The perimeter of circle is: " + perimeter);
            } case "Rhombus" -> {
                out.print("Enter side of rhombus: "); float side = input.nextFloat();
                out.print("Enter length of both diagonals: "); float d1 = input.nextFloat();
                float d2 = input.nextFloat();
                double perimeter = 4 * side;
                double area = (d1 * d2) / 2;
                out.println("The area of circle is: " + area);
                out.print("The perimeter of circle is: " + perimeter);
            } case "Equilateral Triangle" -> {
                out.print("Enter side of triangle: "); float side = input.nextFloat();
                double perimeter = 3 * side;
                double area = Math.sqrt(3) / 4 * Math.pow(side, 2);
                out.println("The area of circle is: " + area);
                out.print("The perimeter of circle is: " + perimeter);
            } default -> out.print("Enter a valid Shape!");
        }

    }
}