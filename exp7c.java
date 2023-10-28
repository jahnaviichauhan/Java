import java.lang.*; 
import java.util.*; 

class MyException extends Exception 
{ 
    public MyException(String message)  
    { 
        super(message); 
    } 
} 

public class ExceptionHandling 
 {  
    public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in); 
        String s = sc.nextLine(); 
        try  
        { 
            System.out.println("Try block entered"); 
            int i = Integer.parseInt(s); 
            if (i < 0) 
            { 
              throw new MyException("Input cannot be negative"); 
            } 
        } 
        catch (NumberFormatException ex)  
        { 
            System.out.println("Catch block entered"); 
            System.out.println(ex.getMessage()); 
        }  
        catch(MyException zx) 
        { 
            System.out.println("Custom Exception caught " + zx.getMessage()); 
        } 
        finally  
        { 
            System.out.println("Finally block entered"); 
        } 
    } 
} 
 
