import java.util.Scanner;

public class StrongNumberChecker {
    // Function to calculate the factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to check if a number is a Strong number
    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sumOfFactorials = 0;

        while (num > 0) {
            int digit = num % 10;
            sumOfFactorials += factorial(digit);
            num /= 10;
        }

        return originalNum == sumOfFactorials;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if it's a Strong number
        boolean isStrong = isStrongNumber(number);

        // Display the result
        System.out.println(number + " is " + (isStrong ? "a Strong number" : "not a Strong number"));

        scanner.close();
    }
}
