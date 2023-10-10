/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.Bai6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nghiaquach
 */
public class Customer {
    int balance = 1000;
    
    public synchronized void withdraw(int amount){
        System.out.println("Ban dang rut tien .. ");
        
        if(amount>balance){
            System.out.println("Khong du tien rut, doi nap tien");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //balance = balance - amount
        balance -= amount;
        System.out.println("Ban da rut tien thanh cong, balance con lai: " + balance);
    }
    
    public synchronized void deposit(int amount){  
        System.out.println("Ban dang nap tien .. ");
        balance += amount;
        System.out.println("Ban da nap so tien: " + amount);
        System.out.println("So tien trong tk la: " + balance);
        notify();
    }
    
    public static void main(String[] args) {
        Customer c = new Customer();
        Thread t1 = new Thread(){
            @Override
            public void run() {
               c.withdraw(2000);
            }
            
        };
        t1.start();
        
        Thread t2 = new Thread(){
            @Override
            public void run() {
               c.deposit(100);
            }  
        };
        
        //t2.start();
        
    }
}
