package com.Garvita;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.out;

public class MultiDimAList{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i<size; i= i+1){
            list.add(new ArrayList());
        }

        for(int i = 0; i<size-1; i = i + 1){
            for(int j = 0; j<size; j= j+1){
                out.print("Enter a number: ");
                list.get(j).add(input.nextInt());
            }
        }


        for (int i = 0; i <size; i= i+1){
            out.println(list.get(i) + " ");
        }

    }
}