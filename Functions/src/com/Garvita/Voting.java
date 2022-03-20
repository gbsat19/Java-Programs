package com.garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Voting{

    static boolean check_eligibility(int age){
        return (age>=18);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        boolean value = check_eligibility(age);
        if(value){
            out.print("Eligible");
        }
        else {
            out.print("Not eligible");
        }
    }
}
