package com.garvita;
import java.util.Scanner;
import static java.lang.System.out;

//Error

public class Grading{
    static String grades(float marks){
        String str = " ";
        if(marks>=91 && marks<=100){
            str = "AA";
        }
        else if(marks>=81 && marks<=90){
            str = "AB";
        }
        else if(marks>=71 && marks<=80){
            str = "BB";
        }
        else if(marks>=61 && marks<=70){
            str = "BC";
        }
        else if(marks>=51 && marks<=60){
            str = "CD";
        }
        else if(marks>=41 & marks<=50){
            str = "DD";
        }
        else if(marks<=40){
            str = "Fail";
        }
        return str;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float marks = input.nextInt();

        String result = grades(marks);
        out.print(result);
    }
}