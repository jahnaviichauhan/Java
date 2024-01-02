/*
Program Description:
Write a program for generating 2 threads, one for printing even numbers and the other for printing odd numbers.
The two threads should be synchronized.
Author: Jahnavi Singh Chauhan
Roll no: R2142220526
SAP ID: 500102342
Date: 27/11/23
 */
class NumPrint {

    private int currentNum = 1;
    private final int limit;

    public NumPrint(int limit) {
        this.limit = limit;
    }

    public synchronized void printEven() {
        while (currentNum <= limit) {
            if (currentNum % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": Even Number = " + currentNum);
                currentNum++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void printOdd() {
        while (currentNum <= limit) {
            if (currentNum % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ": Odd Number = " + currentNum);
                currentNum++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class exp9c {
    public static void main(String[] args) {
        int limit = 10; // Set the limit here
        final NumPrint numberPrinter = new NumPrint(limit);
        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                numberPrinter.printEven();
            }
        });
        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                numberPrinter.printOdd();
            }
        });
        evenThread.setName("Even Thread");
        oddThread.setName("Odd Thread");
        evenThread.start();
        oddThread.start();
    }
}

