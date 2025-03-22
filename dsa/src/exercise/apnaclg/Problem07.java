package exercise.apnaclg;

import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                if (number > 0) {
                    positiveCount++;
                } else if (number < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'done' to stop.");
            }
        }

        sc.close(); // Closing the scanner to prevent resource leak
        System.out.println(positiveCount + " positive numbers");
        System.out.println(negativeCount + " negative numbers");
        System.out.println(zeroCount + " zero numbers");
    }
}
