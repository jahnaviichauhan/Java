/*
Question: Use throw throws to implement an arithmetic exception
Author: Jahnavi Singh Chauhan
Roll No.: R2142220526
SAP ID: 500102342
Date: 06/10/2023
 */

 class ArithmeticExceptionCustom extends ArithmeticException {
    public ArithmeticExceptionCustom(String message) {
        super(message);
    }
}

public class exp7a {
    static float mydivide(int a, int b) throws ArithmeticExceptionCustom {
        if (b == 0) {
            throw new ArithmeticExceptionCustom("Division by zero is not allowed.");
        }
        return (float) a / b;
    }

    int main() {
        // Change values of a and b to learn more about throw and throws
        int a = 4;
        int b = 0; // Change to 0 to trigger the custom exception

        System.out.println("TRY block entered");

        try {
            float c = mydivide(a, b);
            System.out.println("Result: " + c);
        } catch (ArithmeticExceptionCustom ex) {
            System.out.println("CATCH block entered");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("FINALLY block entered");
        }

        System.out.println("Remaining code");

        return 0;
    }

    public static void main(String[] args) {
        exp7a program = new exp7a();
        program.main();
    }
}
