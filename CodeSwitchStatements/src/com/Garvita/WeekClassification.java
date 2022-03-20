package com.Garvita;
import java.util.Scanner;

public class WeekClassification{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.print("Weekday ;(");
                break;
            case 6:
            case 7:
                System.out.print("Weekendingggggggggggggggggggg");
                break;
        }
    }
}