package exercise.kk;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(checkPrime(2) ? "Prime": "Not Prime");
    }
    public static boolean checkPrime(int number){
        if(number <= 1){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
