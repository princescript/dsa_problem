package com.linearsearch05;

public class MinValueInArray {
    public static void main(String[] args) {
        int[] arr = {140,87,958,221, -214, 887};
        System.out.println(minInArray(arr)); //-214

    }
    public static int minInArray(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
