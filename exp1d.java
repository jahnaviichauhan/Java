/* 
Author: Jahnavi Singh Chauhan
Roll no: R2142220526 
SAP ID: 500102342
Date: 12 August 2023 
*/ 

import java.util.Scanner; 
public class exp1d {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = sc.nextInt(); 
        boolean isPrime = true; 
        if (num <= 1) {
            isPrime = false; 
        } 
        else { 
            for (int i = 2; i <= Math.sqrt(num); i++) { 
                   if (num % i == 0) { 
                    isPrime = false; 
                    break; 
                } 
            } 
        } 
        if (isPrime) { 
            System.out.println(num + " is a prime number."); 
        } 
        else { 
            System.out.println(num + " is not a prime number."); 
        } 
    } 
} 
