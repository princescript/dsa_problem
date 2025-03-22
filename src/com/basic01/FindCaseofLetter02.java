package com.basic01;

import java.util.Scanner;

public class FindCaseofLetter02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Letter: ");
        int ch1 = sc.next().trim().charAt(0);
        if(ch1 >= 65 && ch1 <= 90){
            System.out.printf("UpperCase Letters : %d" , ch1);
        } else if (ch1 >= 97 &&  ch1 <= 122) {
            System.out.printf("LowerCase Letters : %d" , ch1);
        }
    }
}
