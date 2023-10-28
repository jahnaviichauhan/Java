/*
Author- Jahnavi Singh Chauhan
Roll no.- R2142220526
SAP ID- 500102342
Date- 18/08/2023
*/
 //Question- WAP to print fibonacci series till 70 and star the even members of series

class exp2a {
    public static void main(String[] args) {
        int i=1,n1=0, n2=1;
        System.out.println("The fibonacci series till 70 is:");
        while(n2<70)
        {
        if(n2%2==0)
        System.out.println(i + ":" + n2  + "*");
        else
        System.out.println(i + ":" + n2);
        n2=n2+n1;
        n1=n2-n1;
        i=i+1;
        }
        System.out.println("Series ended.");
    }
}
