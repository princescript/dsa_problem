package exercise.kk;

public class CountingOccurrence {
    public static void main(String[] args) {
        System.out.println(checkDigitCount(451454474)); // output - 5 times come 4
    }
    public static int checkDigitCount(int num){
        int count = 0;
        while (num > 0){
            int lastDigit = num % 10;
            num = num / 10;
            if(lastDigit == 4){
                count = count + 1;
            }
        }
        return count;
    }
}
