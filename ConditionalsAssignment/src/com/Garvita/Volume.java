package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.Math.pow;

public class Volume{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.print("This program is to find volume! \n 1. Volume of Cone \n 2. Volume of Prism \n");
        out.print(" 3. Volume of Cylinder \n 4. Volume of Sphere \n 5. Volume of Pyramid");
        out.print("Choose a number from the menu: ");
        int num = input.nextInt();
        switch(num)
        {
            case 1->
                    {out.print("Enter the radius and height of cone: ");
                    float r = input.nextFloat();
                    float h = input.nextFloat();
                    double volume = (3.14 * pow(r,2) * h)/3;
                    out.print("Volume of cone is: " + volume);
                    }
            case 2-> {
                out.print("Enter the triangular base and height: ");
                float b = input.nextFloat();
                float h = input.nextFloat();
                out.print("Enter the height of the prism");
                float H = input.nextFloat();
                double volume = 0.5 * b * h * H;
                out.print("Volume of prism is: " + volume);
            }
            case 3->
                    {out.print("Enter the radius and height of cylinder: ");
                float r = input.nextFloat();
                float h = input.nextFloat();
                double volume = 3.14 * pow(r,2) * h;
                out.print("Volume of cylinder is: " + volume);
                }
            case 4->
                    {
                        out.print("Enter the radius of sphere: ");
                float r = input.nextFloat();
                double volume = 4/3 *(3.14*pow(r,3));
                out.print("Volume of Sphere is: "+ volume);
                    }
            case 5-> {
                out.print("Enter the rectangular length and breadth: ");
                float l = input.nextFloat();
                float b = input.nextFloat();
                out.print("Enter the height of the pyramid: ");
                float H = input.nextFloat();
                double volume = (b * l * H) / 3;
                out.print("Volume of prism is: " + volume);
            }
            default->
                out.print("Enter a valid case!!");
        }

    }
}