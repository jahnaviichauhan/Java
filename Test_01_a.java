/*Class Test -01
ASSIGN-01
Q. (a) WAP in java to take two no.s as input using command line args.
   (b) Print the addition and subtraction of the two no.s.
   (c) Write appropriate statements in the code and the output.

Author: Ayush Dey 
Roll no: R2142220053
SAP ID: 500104986
Date: 20 October 2023  
*/

public class Test_01_a {
    public static void main(String[] args) {
        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            int sum = n1 + n2;
            int diff = n1 - n2;

            System.out.println("The sum of " + n1 + " and " + n2 + " is: " + sum);
            System.out.println("The difference of " + n1 + " and " + n2 + " is: " + diff);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide two integer arguments.");
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integer arguments.");
        }
    }
}
