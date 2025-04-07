package com.linearsearch05;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {140,87,958,221, -214, 887};
        System.out.println(maxInArray(arr)); // 958

    }
    public static int maxInArray(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
