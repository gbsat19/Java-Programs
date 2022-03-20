package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class EvenOdd{

    static boolean check_evenodd(int n){
        return (n % 2 == 0);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        boolean value = check_evenodd(num);
        if(value){
            out.print("Even");
        }
        else{
            out.print("Odd");
        }
    }
}
