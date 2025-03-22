package com.basic01;

public class ReverseNumber05 {
    public static void main(String[] args) {
        int number = 9479656;
        int reverse = 0;
        while (number > 0){
            int res = number % 10;
            number = number / 10;
            reverse = reverse * 10 + res;
        }
        System.out.println(reverse);
    }
}
