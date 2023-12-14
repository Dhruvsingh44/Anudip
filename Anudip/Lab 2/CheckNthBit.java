import java.util.Scanner;

public class CheckNthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Input number: ");
        int num = scanner.nextInt();

        // Input the nth bit position
        System.out.print("Input nth bit number: ");
        int n = scanner.nextInt();

        // Right-shift num by n positions and perform bitwise AND with 1
        int bitStatus = (num >> n) & 1;

        // Display the result
        System.out.println("The " + n + "th bit of " + num + " is set to " + bitStatus);

        scanner.close();
    }
}

