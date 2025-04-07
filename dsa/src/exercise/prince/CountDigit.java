package exercise.prince;

public class CountDigit {
    public static void main(String[] args) {
        int[] arr = {12, 4, 1, 4578, 555, 8744, 984715, 41, 51151};
        arrayDigitEvenOrOdd(arr);
    }

    public static void arrayDigitEvenOrOdd(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(countDigit(arr[i]) % 2 == 0){
                System.out.println(arr[i] + " Even Number of Digits.");
            }
            else {
                System.out.println(arr[i] + " Odd Number of Digits.");
            }
        }
    }

    public static int countDigit(int num){
        int count = 0;
        while (num > 0){
            count = count + 1;
            num = num / 10;
        }
        return count;
    }
}

