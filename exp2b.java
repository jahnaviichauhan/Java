/*
Author- Jahnavi Singh Chauhan
Roll no.- R2142220526
SAP ID- 500102342
Date- 18/08/2023
*/

class exp2b {
        public static void main(String[] args) { 
            int num1 = 1; 
            int num2 = 1; 
            System.out.println("Fibonacci Series: "); 
            System.out.print(num2); 
            while (num2 < 50) { 
                System.out.print(" " + num2); 
                num2 = num1 + num2; 
                num1 = num2 - num1; 
            } 
        } 
    } 
