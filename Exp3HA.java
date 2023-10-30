/*Program to display use of final and static
 * Name: Jahnavi Singh Chauhan
 * SAP ID: 500102342
 * Roll number: R2142220526
 * Date: 4/10/2023
 */

class ExampleClass {
    // Static variable
    static int staticVariable = 10;

    // Final variable (constant)
    final int finalVariable = 20;

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        // Accessing static variable and method
        System.out.println("Static variable: " + ExampleClass.staticVariable);
        ExampleClass.staticMethod();

        // Creating an instance of the class
        ExampleClass obj = new ExampleClass();

        // Accessing final variable
        System.out.println("Final variable: " + obj.finalVariable);

        // Trying to modify the final variable (will result in a compilation error)
        // obj.finalVariable = 30; // Uncommenting this line will result in a compilation error
    }
}


