package com.linearsearch05;

import java.util.Arrays;

public class SearchArrayInRange {
    public static void main(String[] args) {
        int[] arr = {10,87,958,221, 14, 887};
        int target = 14;
        System.out.println(searchArrayInRange(arr,target,2,5)); //4

    }
    public static int searchArrayInRange(int[] arr, int target,int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index < end; index++) {
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }

    public static class Search2DArray {
        public static void main(String[] args) {
            int target = 72;
            int[][] arr = {
                    {11, 20, 13},
                    {45, 5, 46, 54},
                    {72, 45},
                    {87,99,74}
            };
            int[] ans = indexFind2DArray(arr,target);
            //System.out.println(ans[0] + " " + ans[1]);
            System.out.println(Arrays.toString(ans));

        }
        public static int[] indexFind2DArray(int[][] arr, int target){
            if(arr.length == 0){
                return new int[]{-1,-1};
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
}
