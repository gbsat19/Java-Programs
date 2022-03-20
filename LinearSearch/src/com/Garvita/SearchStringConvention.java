package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class SearchStringConvention{

    static boolean searchChar(String str, char ch){
        for(int i =0; i<str.length(); i= i+1){
            if(str.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        if(str.length() != 0){
            char target = input.next().trim().charAt(0);
            boolean value = searchChar(str, target);
            if(value){
                out.print("Character in string!");
            }
            else
            {
                out.print("Character not in string");
            }
        }
        else{
            out.print("Enter a valid string!");
        }
    }
}