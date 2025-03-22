package com.basic01;

import java.util.Scanner;

public class Largest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Q1 : find largest of three numbers
//        int max = a;
//        if( b > max){
//            max = b;
//        }
//        if( c > max){
//            max =c;
//        }
//        System.out.println(max);

        //in build method Math.max(a,b)
        System.out.println(Math.max(c,Math.max(a , b)));

    }
}