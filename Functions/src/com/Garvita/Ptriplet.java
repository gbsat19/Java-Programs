package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Ptriplet {
    //(a,b,c) is a pythagorean triplet only when a*a + b*b = c*c
    static boolean check_triplet(int a, int b, int c){
        long prod1 = a*a + b*b;
        long prod2 = c*c;
        return (prod1 == prod2);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        boolean result = check_triplet(n1, n2, n3);
        if(result){
            out.print("Pythagorean Triplet!");
        }
        else {
            out.print("Not Pythagorean");
        }

    }
}
