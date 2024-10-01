package com.amol;

public class ThreadDemo extends Thread{
    public ThreadDemo(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1;i < 5;i++){
            String a = "";
            for (int j = 0;j<10000;j++){
                a += "a";
            }
            System.out.println(Thread.currentThread().getName()+ " - Priority: " + Thread.currentThread().getPriority()+ "- count" + i);
        }

    }

    public static void main(String[] args) {
        ThreadDemo l = new ThreadDemo("Low Priority Thread");
        ThreadDemo m = new ThreadDemo("Medium Priority Thread");
        ThreadDemo h = new ThreadDemo("High Priority Thread");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        h.start();



    }
}
