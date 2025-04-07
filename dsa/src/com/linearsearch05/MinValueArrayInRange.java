package com.linearsearch05;

public class MinValueArrayInRange {
    public static void main(String[] args) {
        int[] arr = {140,8447,958,221, -214, 887};
        System.out.println(minInArray(arr, 1,3)); //221

    }
    public static int minInArray(int[] arr, int start , int end){
        if(arr.length == 0){
            return -1;
        }
        int min = arr[start];

        for (int i = start; i <= end; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
