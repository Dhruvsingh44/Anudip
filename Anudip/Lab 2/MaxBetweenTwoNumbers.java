import java.util.Scanner;

public class MaxBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Input the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Use the ternary operator to find the maximum
        int max = (num1 > num2) ? num1 : num2;

        // Display the maximum
        System.out.println("The maximum between " + num1 + " and " + num2 + " is: " + max);

        scanner.close();
    }
}
