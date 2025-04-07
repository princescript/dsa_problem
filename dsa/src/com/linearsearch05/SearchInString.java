package com.linearsearch05;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Aadarsh";
        char target = 'g';
        System.out.println(findChar(name,target)); //false
    }
    public static boolean findChar(String str, int target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== target){
                return true;
            }
        }
        return false;
    }
}
