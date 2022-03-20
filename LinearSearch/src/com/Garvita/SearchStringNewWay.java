package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class SearchStringNewWay {

    static boolean stringSearch(String st, char target){
        char[] str = st.toCharArray();
        for(char element: str ){
            if(element == target){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.next().trim();
        if(str.length() != 0){
            char ch = input.next().trim().charAt(0);
            boolean result = stringSearch(str, ch);
            if(result){
                out.print("Character in string!");
            }
            else{
                out.print("Character not in string!");
            }
        }
        else{
            out.print("Enter a valid string!");
        }
    }
}