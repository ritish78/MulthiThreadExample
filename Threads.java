package com.company;

class Task1 extends Thread{
    public void run(){            //We need to have run() statement. Other statement doesn't run multithread
        System.out.print("\n Task 1 started");
        for (int i=101; i<199; i++){
            System.out.print(i+" ");
        }
        System.out.print("\nTask 1 is done");
    }
}
class Task2 implements Runnable{
    public void run(){
        System.out.print("\n Task 2 started");
        for (int i=201; i<299; i++){
            System.out.print(i+" ");
        }
        System.out.print("\n Task 2 is done");
    }
}

public class Threads {
    public static void main (String[] args){
        //Task 1
        Task1 pahilo = new Task1();
        pahilo.start();         //Need to call start not run

        //Task 2
        Task2 task2 = new Task2();
        Thread task2thread = new Thread(task2);
        task2thread.setPriority(10);
        task2thread.start();

        //Task 3
        for (int i=301; i<399; i++){
            System.out.print(i+" ");
        }
        System.out.print("\n Task 3 is done ");
        System.out.print("\n All is done ");

    }

}
