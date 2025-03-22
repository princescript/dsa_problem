package com.basic01;

public class Fobonacciseries03 {
    public static void main(String[] args) {
        //find nth focaccia series
        // 0 1 1 2 3 5 8 13 .....
        int count = 2;
        int n = 7;
        int a =0;
        int b = 1;
        while (count <= n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
