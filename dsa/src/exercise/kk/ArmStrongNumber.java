package exercise.kk;

public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.println(checkArmStrong(153));
    }
    public static boolean checkArmStrong(int number){
        int original = number;
        int sum = 0;

        while (number > 0){
        int rem = number % 10;
        number = number / 10;
        sum = sum + rem * rem * rem;
        }
        if(sum == original){
            return true;
        }
        return  false;
    }
}
