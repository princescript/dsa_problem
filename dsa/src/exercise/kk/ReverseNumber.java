package exercise.kk;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Reverse Number is " + reverseNumber(123456)); //Reverse Number is 654321
    }
    public static int reverseNumber(int num) {
        int rnum = 0;
        while (num > 0){
            int lastDigit = num % 10;
            num = num / 10;
            rnum = rnum * 10 + lastDigit;
        }
        return rnum;
    }
}
