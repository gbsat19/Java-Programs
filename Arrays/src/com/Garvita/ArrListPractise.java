package com.Garvita;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;

public class ArrListPractise{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        out.print("Enter size of array list: ");
        int size = input.nextInt() ;

        //Declaring and initialising an integer array list
        ArrayList<Integer> lits = new ArrayList<Integer>();

        //inputting values in integer array list
        for(int i = 0 ; i<size ; i= i+1){
            out.print("Enter a number: ");
            lits.add(input.nextInt());
        }

        //printing integer array list
        for(int i = 0; i<size; i = i+1){
            out.print(lits.get(i) + " ");
        }
        out.println();

        //Declaring and initialising a string array list
        ArrayList<String> str = new ArrayList<String>();

        //inputting values in string array list
        for(int i =  0; i<size; i= i+1){
            out.print("Enter a string: ");
            str.add(input.next().trim());
        }

        //printing values of string array list
        for(int i = 0; i< size; i = i+1){
            out.print(str.get(i) + " ");
        }
    }
}