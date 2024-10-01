package com.amol;

public class ThreadMethodPractice extends  Thread{

    @Override
    public void run() {
//        try {
//            Thread.sleep(1000);
//            System.out.println("Sleeping");
//        } catch (InterruptedException e) {
//            System.out.println("Thread interrupted : " + e);
//        }

//        yeild

        for (int i = 0; i < 5 ; i++) {
            System.out.println(Thread.currentThread().getName() + "is running");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        ThreadMethodPractice t1 = new ThreadMethodPractice();
        ThreadMethodPractice t2 = new ThreadMethodPractice();
        t1.start();
        t2.start();
//        t1.interrupt();


    }
}
