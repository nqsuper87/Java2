/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.Bai6;

/**
 *
 * @author nghiaquach
 */
public class MultiThreadExample {
    public static void main(String[] args) {
        // Create two instances of the Runnable implementation
        MyRunnable runnable1 = new MyRunnable("Thread 1");
        MyRunnable runnable2 = new MyRunnable("Thread 2");

        // Create two threads and assign runnables to them
        Thread thread1 = new Thread(runnable1);
        thread1.setPriority(Thread.MAX_PRIORITY);
        
        Thread thread2 = new Thread(runnable2);

        // Start the threads
        thread1.start();
        thread2.start();
        
        
        
        
        System.out.println("Thong tin Thread 1");
        System.out.println("Id: " + thread1.getId());
        System.out.println("Name: " + thread1.getName() + "");
        System.out.println("Priority: " +thread1.getPriority());
        System.out.println("Dead: " +thread1.isAlive());
        
        System.out.println("Thong tin Thread 2");
         System.out.println("Id: " + thread2.getId());
        System.out.println("Name: " + thread2.getName() + "");
        System.out.println("Priority: " +thread2.getPriority());
        System.out.println("Is Alive: " +thread2.isAlive());
        
    }
}

class MyRunnable implements Runnable {
    private final String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public synchronized void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + ": " + i);
            try {
                // Add a small delay for demonstration purposes
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

