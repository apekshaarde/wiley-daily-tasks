package com.lock.ex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample {


    private Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args) {
        DeadLockExample deadlock = new DeadLockExample();

        Thread thread1 = new Thread(()-> deadlock.operation1(), "T1");
        Thread thread2 = new Thread(()-> deadlock.operation1(), "T2");

        thread1.start();
        thread2.start();

    }

    public void operation1() {
        lock1.lock();
        System.out.print("lock1 acquired, waiting to acquire lock2.");
        try{
            Thread.sleep(50);
        }catch (InterruptedException ex){
            System.err.println(ex);
        }

        lock2.lock();
        System.out.println("lock2 acquired");

        System.out.println("executing first operation.");

        lock2.unlock();
        lock1.unlock();
    }

    public void operation2() {
        lock2.lock();
        System.out.println("lock2 acquired, waiting to acquire lock1.");
        try{
            Thread.sleep(50);
        }catch (InterruptedException ex){
            System.err.println(ex);
        }

        lock1.lock();
        System.out.println("lock1 acquired");

        System.out.println("executing second operation.");

        lock1.unlock();
        lock2.unlock();
    }

}

