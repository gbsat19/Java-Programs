package com.Garvita;
import java.util.Arrays;
import static java.lang.System.out;

public class SwapArrEle{

    static void swapArr(int[] mat, int pos1, int pos2){
        int temp = mat[pos1];
        mat[pos1] = mat[pos2];
        mat[pos2] = temp;
    }

    public static void main(String[] args){
        int[] arr = new int[] {1,2,3,4,5,6,7,89,10};
        swapArr(arr, 2, 5);
        out.print(Arrays.toString(arr));
    }
}
