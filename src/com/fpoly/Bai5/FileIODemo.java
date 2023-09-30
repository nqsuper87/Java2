/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.Bai5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nghiaquach
 */
public class FileIODemo {
    public static void main(String[] args) {
        FileIODemo fileIODemo = new FileIODemo();
        fileIODemo.writeFile("file.dat", "Hello SD 18401");
        String str = fileIODemo.readFile("file.dat");
        System.out.println(str);
    }
    
    private void writeFile(String fileName, String content){
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            String text = content;
            byte[] bs = text.getBytes();
            fos.write(bs);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileIODemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(FileIODemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String readFile(String fileName){
        String str = "";
        try {
            FileInputStream fis = new FileInputStream(fileName);
            int c;
            
            while((c= fis.read()) != -1){
                //System.out.print((char)c);
                str += (char)c;
            }
            
        } catch (Exception ex) {
            Logger.getLogger(FileIODemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return str;
    }
    
}
