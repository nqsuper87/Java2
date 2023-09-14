/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fpoly.Bai1;

/**
 *
 * @author nghiaquach
 */
public class Java2Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Student std = new Student();
//        std.input();
//        std.output();
//        
//        std.setDiem(0);
//        std.getDiem();
//        
//        ChuNhat cn = new ChuNhat();
//        
//        ChuNhat cn1 = new ChuNhat(3.0,3.0);
        
//        SinhVien sv = new SinhVien();
//        sv.setHoTen("Nguyen Van A");
//        sv.setDiem(-1);

        //abstract class
//        Animal dg = new Dog();
//        dg.speak();
//
//        Animal d = new Duck();
//        d.speak();
//
//        Animal c = new Cat();
//        c.speak();
        //interface
        
          AnimalInterface p = new Pig();
          p.sound();
          p.eat();
          
          AnimalInterface c = new Chicken();
          c.sound();
          c.eat();
          
          
          AnimalInterface t = new Tiger();
          t.sound();
          t.eat();

    }
    
}
