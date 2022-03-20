package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Fruits {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        out.print("Enter the fruit: ");
        String fruit = input.next().trim();

        switch (fruit) {
            case "Apple" -> out.print("An apple a day keeps the doctor away!");
            case "Apple || apple"-> out.print("Appleeeeeeeeeee"); 
            case "Mango" -> out.print("Mango the sweetest of them all!!");
            default -> out.print("Bananas are rich in pottasium!");
        }

    }
}
