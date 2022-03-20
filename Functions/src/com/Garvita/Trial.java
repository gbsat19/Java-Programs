package com.Garvita;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;

public class Trial{
    static void display(char ch, int num, int ...v){
        out.print(Arrays.toString(v));
    }

    public static void main(String[] args){

        //Example to elaborate the concept of Scoping
        int a = 10;
        out.println(a); //a=10
        {
            a = 98;
            out.println(a); // a=98
        }
        out.println(a); // a=98


        //Example to elaborate the concept of variable arguments
        display('a',2,2,3,43,45,6,7,78);
    }
}
//    public static void main(String[] args){
//        int x = 10;
//        boolean value = is_positive(x);
//        out.print(value);
//    }
//    static boolean is_positive(int num){
//        if(num>0){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
