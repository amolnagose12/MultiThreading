package com.amol.synchronization;

public class BankaAcc extends Thread {

   private int balence = 100;

   public synchronized void withdraw(int amount){
       System.out.println(Thread.currentThread().getName() + " Attempting to withdraw "+ amount);
       if(balence>= amount){
           System.out.println(Thread.currentThread().getName() + " Proceeding with withdraw " + "proceeding with withdraw" );

           try {
               Thread.sleep(3000);
           } catch (InterruptedException e) {

           }
           balence-=amount;
           System.out.println(Thread.currentThread().getName() + " Remaining Balence" + balence);
       }else {
           System.out.println(Thread.currentThread().getName() + " Insufficient balence" + balence);
       }
   }
}
