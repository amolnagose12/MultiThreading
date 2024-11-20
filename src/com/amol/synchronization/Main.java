package com.amol.synchronization;

public class Main {
    public static void main(String[] args) {
        BankaAcc sbi = new BankaAcc();
        Runnable task = new Runnable() {
            @Override

            public void run() {
                sbi.withdraw(50);
            }
        };
        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");
        t1.start();
        t2.start();
    }
}
