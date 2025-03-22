package com.basic01;

public class CountingOccurence04 {
    public static void main(String[] args) {
        //find how many times 5 come in num
        int num = 45536;
        int count =0;
        while (num > 0){
            int rem = num % 10;
            if(rem == 5){
                count ++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}
