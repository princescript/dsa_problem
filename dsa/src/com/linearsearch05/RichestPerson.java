package com.linearsearch05;

public class RichestPerson {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,5},
                {7,8},
                {9,7}
        };
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        if(accounts.length == 0){
            return -1;
        }
        int maxWealth = Integer.MIN_VALUE;
        for (int p = 0; p < accounts.length; p++) {
            int sum = 0;
            for (int a = 0; a < accounts[p].length; a++) {
                sum = sum + accounts[p][a];
            }
            if(sum > maxWealth){
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
