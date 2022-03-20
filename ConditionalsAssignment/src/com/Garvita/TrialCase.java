package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.Character.toUpperCase;
import static java.lang.Character.toLowerCase;

public class TrialCase {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str = input.next();
//        if(str.equalsIgnoreCase("Mango"))
//        {
//            out.print("Mango is the king of fruits");
//        }

        //How to implement .equalsIgnoreCase in Switch Statements?







        //Passing ONLY UPPER CASE in switch
        switch(str.toUpperCase())
        {
            case "MANGO":
                out.println("Mango is the king of fruits!");
                break;
        }

        //Passing ONLY LOWER CASE in Switch
        switch(str.toLowerCase()){
            case "mango":
                out.print("Mnago YAYYYYYYYYYYY");
                break;
        }
    }

}
