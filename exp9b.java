/*
 * Implement the Ping-Pong program using runnable
 * In one second, approximately print: 2 ping 1 pong
 *
 * Author: Jahnavi Singh Chauhan
 * Roll no: R2142220526
 * SAP ID: 500102342
 * Date: 27/11/23
 */

// Runnable class for "Ping"
class Ping implements Runnable {
    public void run() {
        for (int c = 0; c < 2; c++) {
            System.out.println("Ping");
            try {
                Thread.sleep(500); // Sleep for 1/2 of a second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Runnable class for "Pong"
class Pong implements Runnable {
    public void run() {
        System.out.println("Pong");
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class exp9b {
    public static void main(String[] args) {
        Ping ping = new Ping();
        Thread pingThread = new Thread(ping);

        Pong pong = new Pong();
        Thread pongThread = new Thread(pong);

        // Start the "Ping" thread
        pingThread.start();

        // Start the "Pong" thread
        pongThread.start();
    }
}
