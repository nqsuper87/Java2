/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.Bai1;

/**
 *
 * @author nghiaquach
 */
public class SinhVien {
    private String hoTen;
    private double diem;

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }
    
    
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    
    public String getHoTen(){
        return this.hoTen;
    }
    
    public void setDiem(double diem){
        if(diem<0|| diem>10){
            System.out.println("Điểm không hợp lệ");
        }
        else{
            this.diem = diem;
        }
    }
    
    public double getDiem(){ 
        return this.diem;
    }    
}
