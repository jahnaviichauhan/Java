/*Name- Jahnavi Singh Chauhan
  Roll no.- R2142220526
  SAP ID- 500102342
  Date- 18/08/2023*/
 //Question- WAP to print fibonacci series till 50

class Lab1 {
    public static void main(String[] args) {
        int i,n1=0, n2=1;
        while(n2<50)
        {
        System.out.print(n2  + " ");
        n2=n2+n1;
        n1=n2-n1;
        }
    }
}