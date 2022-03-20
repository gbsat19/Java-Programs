package com.Garvita;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.Arrays;

public class TwoDArr{
    public static void main(String[] args){

        int[][]hoh = new int[4][];
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        float[][] nump = {
                {1.0f, 2.1f, 3.2f}, //0th index: nump[0]
                {4.3f, 5.4f, 6.5f},//1st index: nump[1]
                {7.6f, 8.7f, 9.8f}//2nd index: nump[2]
                //nump[2][1] = 8.7f
        };
       for(int i = 0; i<nump.length; i = i+1)
       {
           System.out.println(Arrays.toString(nump[i]));
       }
    }
}
