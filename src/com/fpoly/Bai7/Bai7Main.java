/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.Bai7;

/**
 *
 * @author nghiaquach
 */
public class Bai7Main {
    public static void main(String[] args) {
        System.out.println("Transport Enum len:" + Transport.values().length);
        System.out.println("Transport value: " + Transport.valueOf("TRAIN").getSpeed());       
        double money = 30.99;
        //AUTOBOXNG/CAST
        Double dMoney = (Double)money;
        dMoney.doubleValue();
        //Static import class
        double number = Math.random();
        System.out.println(number);
  
    }
    
    @MyAnno(value = "ABC", owner = "My Anno")
    public void display(){
        System.out.println("Test Annoation method");
    }
    
}
