package com.linearsearch05;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {42,1,2, 4852};
        System.out.println(evenDigits(arr));
    }
    public static int evenDigits(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(even(digit2(arr[i]))){
                count = count + 1;
            }
        }
        return count;
    }
    public static int digit(int num){
        int count = 0;
        if(num < 0){
            num = num * -1;
        }
        while (num > 0){
            count = count + 1;
            num = num / 10;
        }
        return count;
    }
    public static int digit2(int num ){
        if(num < 0){
            num = num * -1;
        }
        return (int) Math.log10(num) + 1;
    }
    public static boolean even (int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
}
