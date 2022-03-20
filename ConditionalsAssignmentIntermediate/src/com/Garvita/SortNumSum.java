package com.Gravita;
import java.util.Scanner;
import static java.lang.System.out;

public class SortNumSum{

    static void sort_num_sum(){
        int sumn = 0;
        int sume = 0;
        int sumo = 0;
        Scanner input = new Scanner(System.in);
        out.print("Enter number: ");
        int num = input.nextInt();
        while(num!=0){
            if(num<0)
            {
                sumn = sumn + num;
            }
            else
            {
                if(num%2 == 0)
                {
                    sume= sume+num;
                }
                else
                {
                    sumo = sumo + num;
                }
            }

            out.print("Enter next number: ");
            num = input.nextInt();
        }
        out.println("Negative numbers sum: " + sumn);
        out.println("Even positive numbers sum: " + sume);
        out.println("Odd positive numbers sum: " + sumo);
    }
    public static void main(String[] args){

        sort_num_sum();
    }
}