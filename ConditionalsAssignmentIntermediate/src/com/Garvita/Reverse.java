package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Reverse{
    //Reversing Number
    //Reversing String
    public static void main(String[] args){
        out.print("Main Menu: \n1. Reverse a number \n2. Reverse a string ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        int num;
//        String str;

        switch(choice){
            case 1:
                out.print("Enter a number: ");
                num = input.nextInt();
                int num_reverse = number_reverse(num);
                out.println("original number: " + num);
                out.print("reverse number: " + num_reverse);
                break;
//            case 2:
//                out.print("Enter a string: ");
//                str = input.next().trim();
//                String str_reverse = string_reverse(str);
//                out.println("Original string: " + str);
//                out.print("Reversed string: " + str_reverse);
//                break;
            default:
                out.print("Enter a valid option!");
        }
    }

    static int number_reverse(int number){

        int sum = 0;
        int rem = 0;
        while(number>0){
            rem = number%10;
            sum = sum*10 + rem;

            number = number/10;
        }
        return sum;
    }

//    static String string_reverse(String stri){
//
//
//    }
}