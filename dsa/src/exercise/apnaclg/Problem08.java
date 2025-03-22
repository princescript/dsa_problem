package exercise.apnaclg;

import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(Math.pow(x,n));
        powerOf(x,n);
    }

    public static void powerOf(int x , int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= x;
            System.out.println("Hoo");
        }
        System.out.println(res + " is result.");
    }
}
//Two numbers are entered by the user, x and n. Write a function to find the
// value of one number raised to the power of another i.e. x^n