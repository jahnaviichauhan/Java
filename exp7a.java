/*
Question: Use try, catch and finally to implement an arithmetic exception
Author: Jahnavi Singh Chauhan
Roll No.: R2142220526
SAP ID: 500102342
Date: 06/10/2023
 */

public class exp7a {
    static float mydivide(int a, int b)
    {
        float i=a/b;
        return i;
    }
    int main()
    {
        //change values of a and b to learn more about try, catch and finally
        int a=4;
        int b=1; 
        try{
            System.out.println("TRY block entered");
            float c= mydivide(a,b);
        }
        catch(ArithmeticException ex){
           System.out.println("CATCH block entered");
           System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("FINALLY block entered");
        }
        System.out.println("Reamaining code");
        
        return 0;
    }
}
