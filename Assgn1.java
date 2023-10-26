/*Taking two inputs as command line arguments and printing the addition and subtraction of them
 * Name-Jahnavi Singh Chauhan
 * SAP ID-500102342
 * Enrollment No.-R2142220526
 * Date-20/10/2023
 */

public class Assgn1 {
    public static void main(String[] args) {
        // Check if exactly two command-line arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers as command-line arguments.");
        } else {
            // Parse the command-line arguments as numbers
            try {
                double number1 = Double.parseDouble(args[0]);
                double number2 = Double.parseDouble(args[1]);

                // Calculate addition and subtraction
                double addition = number1 + number2;
                double subtraction = number1 - number2;

                // Print the results with appropriate output statements
                System.out.println("The addition of " + number1 + " and " + number2 + " is: " + addition);
                System.out.println("The subtraction of " + number1 + " and " + number2 + " is: " + subtraction);
            } catch (NumberFormatException e) {
                System.out.println("Please provide valid numeric values as command-line arguments.");
            }
        }
    }
}
