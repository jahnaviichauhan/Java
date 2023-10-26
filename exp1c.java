/* 
Author: Jahnavi Singh Chauhan
Roll no: R2142220526 
SAP ID: 500102342
Date: 12 August 2023 
*/

import java.util.Scanner; 
public class exp1c { 
        public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = sc.nextInt(); 
        int fact = 1; 
        for (int i = 1; i <= num; i++) { 
             fact *= i; 
        } 
        System.out.println("Factorial of " + num + " is: " + fact); 
    } 
} 