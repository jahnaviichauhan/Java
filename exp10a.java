/* 
 * Author: Jahnavi Singh Chauhan
 * Roll no: R2142220526
 * SAP ID: 500102342
 * Date: 27/11/23

*/ 
import java.sql.*;  

public class exp10a {  

 public static void main(String[] args) {  
Connection con = null;  
try {  
Class.forName("com.mysql.cj.jdbc.Driver");  
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");  
if (con != null) {  
System.out.println("Connection Established");  
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
}  }  }  } 
