/*Taking three input and printing all possible combinations
 * Name-Jahnavi Singh Chauhan
 * SAP ID-500102342
 * Enrollment No.-R2142220526
 * Date-20/10/2023
 */

import java.util.Scanner;

public class Assgn2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three unique digits
        System.out.print("Enter the first digit (0-9): ");
        int digit1 = scanner.nextInt();

        System.out.print("Enter the second digit (0-9): ");
        int digit2 = scanner.nextInt();

        System.out.print("Enter the third digit (0-9): ");
        int digit3 = scanner.nextInt();

        // Check if the entered digits are unique and within the valid range
        if (isValidInput(digit1, digit2, digit3)) {
            // Generate and print all possible three-digit combinations
            generateCombinations(digit1, digit2, digit3);
        } else {
            System.out.println("Invalid input. Digits must be unique and between 0 and 9.");
        }

        scanner.close();
    }

    // Check if the entered digits are unique and within the valid range
    public static boolean isValidInput(int digit1, int digit2, int digit3) {
        return digit1 >= 0 && digit1 <= 9
                && digit2 >= 0 && digit2 <= 9
                && digit3 >= 0 && digit3 <= 9
                && digit1 != digit2
                && digit1 != digit3
                && digit2 != digit3;
    }

    // Generate and print all possible three-digit combinations
    public static void generateCombinations(int digit1, int digit2, int digit3) {
        System.out.println("All possible three-digit combinations:");
        System.out.println(digit1 + "" + digit2 + "" + digit3);
        System.out.println(digit1 + "" + digit3 + "" + digit2);
        System.out.println(digit2 + "" + digit1 + "" + digit3);
        System.out.println(digit2 + "" + digit3 + "" + digit1);
        System.out.println(digit3 + "" + digit1 + "" + digit2);
        System.out.println(digit3 + "" + digit2 + "" + digit1);
    }
}
