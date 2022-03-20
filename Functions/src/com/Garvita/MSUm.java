package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class MSUm {
    static int sum(int n){
        int num;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        int i=1;
        while(i<=n){
            out.print("Enter a number: ");
            num = input.nextInt();
            sum = sum + num;

            i = i+1;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int ans = sum(n);
        out.print("Sum is: " + ans);
    }
}
