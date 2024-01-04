/*Class Test -01
ASSIGN-02
Q. (a) WAP in java to accept three digits as user input,form 0 to 9.
   (b) Print all the possible combinations of the digits.
   (c) Do not repeat the dgits in the combination.
    
   eg.)  i/p : 0,2
         o/p : 2,20 (00,22 isn't a combination due to repetition)

Author: Ayush Dey 
Roll no: R2142220053
SAP ID: 500104986
Date: 20 October 2023  
*/

import java.util.Scanner;

public class test_01_b {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter three digits (from 0 to 9):");
        int digit1 = a.nextInt();
        int digit2 = a.nextInt();
        int digit3 = a.nextInt();

        System.out.println("The possible combinations are:");
        System.out.println(digit1 + "" + digit2 + "" + digit3);
        System.out.println(digit1 + "" + digit3 + "" + digit2);
        System.out.println(digit2 + "" + digit1 + "" + digit3);
        System.out.println(digit2 + "" + digit3 + "" + digit1);
        System.out.println(digit3 + "" + digit1 + "" + digit2);
        System.out.println(digit3 + "" + digit2 + "" + digit1);
    }
     
}
