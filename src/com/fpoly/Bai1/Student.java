/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.Bai1;

import java.util.Scanner;

/**
 *
 * @author nghiaquach
 */
public class Student extends Course {
    public String mssv;
    public String name;
    public int khoaHoc;
    protected int mobilePhone;
    private double diem;
    
    
    
    
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> MSSV: ");
        
        this.mssv = scanner.nextLine();
        
        System.out.println(">> Name: ");
        
        this.name = scanner.nextLine();
        
        System.out.println(">> Khoa Hoc: ");  
        this.khoaHoc = scanner.nextInt();
        
    }
    
    public void output(){
        System.out.println(">> MSSV: " + this.mssv);
        System.out.println(">> Name: " + this.name);
        System.out.println(">> Khoa Hoc: " + this.khoaHoc);
    } 

    /**
     * @return the diem
     */
    public double getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double diem) {
        this.diem = diem;
    }
}
