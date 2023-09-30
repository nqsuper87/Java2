/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.Bai5;

import com.fpoly.Bai1.SinhVien;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nghiaquach
 */
public class ObjectIOStreamDemo {
    
    public static void main(String[] args) {
       ObjectIOStreamDemo oisd = new ObjectIOStreamDemo();
       oisd.writeObjectToFile();
       oisd.readObjectFromFile();
        
    }
    
    private void readObjectFromFile(){
        FileInputStream fis;
        try {
            fis = new FileInputStream("SinhVien.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //read object from file
            List<SinhVien> svs = (List<SinhVien>)ois.readObject();
            
            for (SinhVien sv : svs) {
                System.out.println(sv.getHoTen());
                System.out.println(sv.getDiem());
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(ObjectIOStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ObjectIOStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void writeObjectToFile(){
         try {
            FileOutputStream fos = new FileOutputStream("SinhVien.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            List<SinhVien> svs = new ArrayList<SinhVien>();
            
            SinhVien sv1 = new SinhVien("Nguyen Van A", 7.0);
            SinhVien sv2 = new SinhVien("Nguyen Van B", 6.0);
            SinhVien sv3 = new SinhVien("Nguyen Thi C", 9.0);
            
            svs.add(sv1);
            svs.add(sv2);
            svs.add(sv3);
            
            oos.writeObject(svs);
            oos.close();   
            
        } catch (IOException ex) {
            Logger.getLogger(ObjectIOStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
