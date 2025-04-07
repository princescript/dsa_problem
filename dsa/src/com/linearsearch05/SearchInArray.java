package com.linearsearch05;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {10,87,958,221, 14, 887};
        int target = 14;
        System.out.println(searchInArray(arr,target)); //true

    }
    public static boolean searchInArray(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

}

