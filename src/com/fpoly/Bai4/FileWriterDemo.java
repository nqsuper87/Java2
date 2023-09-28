/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.Bai4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nghiaquach
 */
public class FileWriterDemo {
    public static void main(String[] args){
        FileWriterDemo fileWriterDemo = new FileWriterDemo();
        String fileName = "java2.txt";
        String content = "Xin chào lớp 18304";
        try {
            fileWriterDemo.writeFile(fileName, content);
        } catch (IOException ex) {
            Logger.getLogger(FileWriterDemo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Lỗi ghi file");
        }
    }
    
    public void writeFile(String fileName, String content) throws IOException{
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(content);
        fileWriter.close();
        System.out.println("Hoàn thành ghi file");        
    }
    
}
