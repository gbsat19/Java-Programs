package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Prime{

    static boolean check_prime(int num){
        if(num<=1){
            return false;
        }
        else{
            int k = 2;
            while(k*k <num){
                if(num%k != 0){
                    k = k+1;
                }
                else{
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        boolean value = check_prime(num);
        if(value){
            out.print("Prime");
        }
        else{
            out.print("Not Prime");
        }
    }
}