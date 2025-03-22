package com.basic01;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        while (true){
            System.out.print("Enter op ");
            Scanner sc = new Scanner(System.in);
            char op = sc.next().trim().toLowerCase().charAt(0);
            if(op == '+' ||op == '-' || op == '*' || op == '/' ||op == '%' ){
                System.out.print("Enter two Numbers:");
                float num1 = sc.nextFloat();
                float num2 = sc.nextFloat();
                float ans = Integer.MIN_VALUE;

                if(op == '+') ans = num1 + num2;

                if(op == '-') ans = num1 - num2;

                if(op == '*') ans = num1 * num2;

                if(op == '/') ans = num1 / num2;

                if(op == '%') ans = num1 % num2;

                System.out.println(ans);
            }
            else if(op == 'x'){
                break;
            } else {
                System.out.println("Invalid Input.");
            }
        }
    }
}
