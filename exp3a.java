/*
Author- Jahnavi Singh Chauhan
Roll no.- R2142220526
SAP ID- 500102342
Date- 1/09/2023
*/

import java.util.Scanner; 
class StudentRecord {
    String name; 
    int roll; 
    void insert(){ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Student Name: "); 
        name = sc.nextLine(); 
        System.out.print("Enter Student Roll no: "); 
        roll = sc.nextInt(); 
    } 
    void display(){ 
        System.out.println(roll + "\t" + name); 
    } 
} 
public class exp3a { 
    public static void main(String[] args) { 
    	StudentRecord s1 = new StudentRecord(); 
    	StudentRecord s2 = new StudentRecord(); 
    	StudentRecord s3 = new StudentRecord(); 
s1.insert(); 
s2.insert(); 
s3.insert(); 
System.out.println("The Students present in the Database are:"); 
s1.display(); 
s2.display(); 
s3.display(); 
    } 
} 
