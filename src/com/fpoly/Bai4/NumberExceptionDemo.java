/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.Bai4;

/**
 *
 * @author nghiaquach
 */
public class NumberExceptionDemo {
    public static void main(String[] args) {
        String[] numbers = {"8","1","a"};
        try{
            int number = Integer.parseInt(numbers[2]);
        }
        catch(NullPointerException ex){
            System.out.println("Mảng chưa khởi tạo");
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("Truy xuất sai phần tử mảng");
        }
        
        catch(NumberFormatException ex){
            System.out.println("Không đúng định dạng");
        }
        
    }
}
