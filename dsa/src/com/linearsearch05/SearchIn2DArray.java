package com.linearsearch05;

import javax.xml.transform.stax.StAXResult;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {11,42,43},
                {41,28,37},
                {17,27,38},

        };
        int target = 41;
        int[] ans = findElem(arr,target);
        System.out.println(Arrays.toString(ans)); //[1,0]
    }
    public static int[] findElem(int[][] arr,int target){
        if(arr.length == 0) {
            return new int[]{-1, -1};
        }
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if(arr[r][c] == target){
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
