package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Sum{

    static int sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int ans = sum(n1, n2);
        out.print("Sum: " + ans);
    }
}
