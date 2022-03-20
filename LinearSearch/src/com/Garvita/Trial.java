package com.Garvita;
import java.util.Scanner;

public class Trial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int num = input.nextInt();
        System.out.println(num);
        System.out.println(Math.log10(num)+1);
        System.out.println((int)(Math.log10(num) + 1));//Shortcut to find number of digits of a number

    }
}
