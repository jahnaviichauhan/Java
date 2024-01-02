

/*Implement the Ping-Pong program using thread class extension
Print as follows:
        Ping: 1/20th of a second
        Pong:1/40th of a second

Author: Jahnavi Singh Chauhan
Roll no: R2142220526
SAP ID: 500102342
Date: 27/11/23
*/
class PingPongThread extends Thread{
    String mes="";
    int s_Time;
    PingPongThread(String mes, int s_Time){
        this.mes=mes;
        this.s_Time=s_Time;
    }
    public void run(){
        try{
            for(;;) {
                System.out.println(mes);
                Thread.sleep(s_Time);
            }
        }
        catch (InterruptedException e){
            return;
        }
    }

}
public class exp9{
    public static void main(String[] args)
    {
        PingPongThread ping = new PingPongThread("Ping" , 50);//1/20th second
        PingPongThread pong = new PingPongThread("Pong" , 25);//1/40th second
        ping.start();
        pong.start();
    }
}
