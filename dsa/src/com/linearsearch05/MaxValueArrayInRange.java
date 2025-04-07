package com.linearsearch05;

public class MaxValueArrayInRange {
    public static void main(String[] args) {
        int[] arr = {140,87,958,221, -214, 887};
        System.out.println(maxInArray(arr, 1,3)); //

    }
    public static int maxInArray(int[] arr, int start , int end){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[start];

        for (int i = start; i <= end; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
