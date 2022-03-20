package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;

public class StringRangeSearch{
    static String getString(){
        Scanner input = new Scanner(System.in);
        out.print("Enter a string: ");
        String str = input.next().trim();
        return str;
    }

    static char getChar(){
        Scanner input = new Scanner(System.in);
        out.print("Enter character to be searched: ");
        char ch = input.next().trim().charAt(0);
        return ch;
    }

    static boolean charInRange(String st, char target, int si, int ei){
        char[] arr = st.toCharArray();
        if(si<ei){
            for(int i = si; i<=ei; i= i+1){
                if(arr[i] == target){
                    return true;
                }
            }
            return false;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = getString();
        if(str.length()!=0){
            char ch = getChar();

            out.print("Enter range starting index: ");
            int si = input.nextInt();
            out.print("Enter range ending index: ");
            int ei = input.nextInt();

            boolean value = charInRange(str, ch, si, ei);
            if(value){
                out.print("Character in specified range of string!");
            }
            else{
                out.print("Character not in rnage of string!");
            }
        }
        else{
            out.print("Enter a valid STring!");
        }
    }
}