package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Week{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        out.print("Enter the number of the day: ");
        int day = input.nextInt();

        switch (day) {
            case 1 -> out.print("Monday ;(");
            case 2 -> out.print("Tuesday :(");
            case 3 -> out.print("Wednesday :|");
            case 4 -> out.print("Thursday ;)");
            case 5 -> out.print("Friday!!!!!!!!!! :)");
            case 6 -> out.print("Saturday :))");
            case 7 -> out.print("SUNDAY YAYAYAYYAYAYAYAYAY!!!!!!!!");
            default -> out.print("Please enter a valid day of the week! :()");
        }
    }
}