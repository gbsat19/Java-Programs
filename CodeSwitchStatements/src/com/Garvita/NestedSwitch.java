package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class NestedSwitch{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        out.print("Enter the employee id: ");
        int EmpId = input.nextInt();
        out.print("Enter department name: ");
        String dept = input.next();

        switch(EmpId)
        {
            case 1:
                out.print("Employee 1 is Garvita Bhateja.");
                break;
            case 2:
                out.print("Employee 2 is Rohita Ahuja. ");
                break;
            case 3:
                out.print("Employee 3 is Anand Jha. ");
                switch(dept)
                {
                    case "IT":
                        out.print("He is in IT dept.");
                        break;
                    case "Security":
                        out.print("He is in the security dept.");
                        break;
                    default:
                        out.print("He is in Software Development!!");
                }
                break;
            default:
                out.print("Enter valid employee id! ");
        }

    }
}