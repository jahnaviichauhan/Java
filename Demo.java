class Test{}

public class Demo
{
    public static void main(String[] args)
    {
        Test t1=new Test();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread t2=new Thread();
        t2.setName("MyThread");
        System.out.println(t2.getName());
        }
}