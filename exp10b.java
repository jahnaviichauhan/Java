/* 
Author: Jahnavi Singh Chauhan  
Roll no: R2142220526
SAP ID: 500102342
Date: 1 December 2023  
*/ 

import java.sql.*;  
public class Main {  
public static void main(String[] args) {  
Connection con = null;  
try {  
Class.forName("com.mysql.cj.jdbc.Driver");  
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");  
 if (con != null) {  
 System.out.println("Connection Established");  
 }  
 Statement stmt = con.createStatement();  
int result = stmt.executeUpdate("insert into stud_rec values(2,'Rahul')");  
if (result > 0) {  
System.out.println("Record Inserted Successfully");  
 } else {  
System.out.println("Record Insertion Failed");  
}  
} catch (Exception e) {  
System.out.println(e);  
} finally {  
try {  
if (con != null) {  
con.close();  
 }  
 } catch (Exception e) {  
System.out.println(e);  
 }}}}