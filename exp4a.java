//WAP in Java to demonstrate inheritance 
//Author: Jahnavi Singh Chauhan 
//Roll No.: R2142220526
//SAP ID: 500102342
//Date: 22/09/2023 

class grandfather{ 
    String gprop="house"; 
    void disp3(){ 
        System.out.println("Grandfather has a house"); 
    } 
} 
class father extends grandfather{ 
    String fprop="car"; 
    void disp1(){ 
        System.out.println("Father has a car"); 
    } 
} 
class son extends father{ 
    String sprop="bike"; 
    void disp2(){ 
        System.out.println("Son has a bike"); 
    } 
} 
class exp4a {
    public static void main(String[] args) {
        son s = new son();
        System.out.println("Son has " + s.sprop);
        System.out.println("Father has " + s.fprop);
        System.out.println("Grandfather has " + s.gprop);

        s.disp1();
        s.disp2();
        s.disp3();
    }
} 