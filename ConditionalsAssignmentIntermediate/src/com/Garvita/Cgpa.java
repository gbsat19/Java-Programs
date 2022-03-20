package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class Cgpa{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.print("Enter number of Subjects: ");
        int n = input.nextInt();
        float marks; //marks received by student
        float total_cred = 0; //Total subject credits
        float credit; //individual subject credit alloted
        int cred =0; //credit recieved based on marks
        double prod = 1;

        int i = 1;
        while(i <= n){
            out.print("Enter subject marks: ");
            marks = input.nextFloat();
            if(marks>= 80 && marks <=100){
                cred = 10;
            }
            else if(marks>=60 && marks<80){
                cred = 9;
            }
            out.print("Enter subject credit: ");
            credit = input.nextFloat();
            prod = prod + cred*credit;
            total_cred = total_cred + credit;

            i = i+1;
        }
        double cgpa = prod/total_cred;
        out.print("Cgpa is: " + cgpa);
    }
}




//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int n = 2;
//        int credit = 0;
//        double sum = 0;
//        out.print("Enter marks of S1: ");
//        float s1 = input.nextFloat();
//        out.print("Enter credits of s1: ");
//        float cred1 = input.nextFloat();
//        out.print("Enter marks of S2: ");
//        float s2 = input.nextFloat();
//        out.print("Enter credits of s2: ");
//        float cred2 = input.nextFloat();
//
//
//        if(s1>= 80 && s1 <=100){
//            credit = 10;
//        }
//        else if(s1>=60 && s1<80){
//            credit = 9;
//        }
//        sum = cred1 * credit;
//        if(s2>= 80 && s2 <=100){
//            credit = 10;
//        }
//        else if(s2>=60 && s2<80){
//            credit = 9;
//        }
//        sum = sum + cred2 * credit;
//        double cgpa = sum / (cred1 + cred2);
//        out.print("CGPA is: " + cgpa);
//    }
