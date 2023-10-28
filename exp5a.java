 /* 
Author: Jahnavi Singh Chauhan
Roll no: R2142220526 
SAP ID: 500102342
Date: 29 September 2023 
*/

 interface MyDisp {
        void disp();
    }
    
    class MyClass implements MyDisp {
        public void disp() {
            System.out.println("Hello");
        }
    }
    
    public class exp5a {
        public static void main(String[] args) {
            MyClass myObject = new MyClass();
            myObject.disp();
        }
    }
    
