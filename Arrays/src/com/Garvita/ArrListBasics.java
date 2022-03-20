package com.Garvita;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.out;

public class ArrListBasics{
    public static void main(String[] args){
        ArrayList<Integer> ls = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

//        Printing array list
//        for(int i = 0; i<5; i = i+1){
//           out.print(ls.get(i) + " ");
//        }

        //Initialising ls Array list
//        for(int i = 0; i<5; i++){
//         out.print("Enter number: ");
//         ls.add(input.nextInt());
//        }
//
//        //Printing array list
//        for(int i = 0; i<5; i = i+1){
//            out.print(ls.get(i) + " ");
//        }


        //2D Array list
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initialising array list
        for(int i = 0; i<5; i = i+1){
            list.add(new ArrayList<>());
        }

        //getting input in each array list
        for(int i = 0; i<5; i= i+1){
            for(int j= 0; j<3; j = j+1){
                list.get(i).add(input.nextInt());
            }
        }


    }
}