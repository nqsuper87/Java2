/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.Bai5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nghiaquach
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriterDemo fwd = new FileWriterDemo();
        fwd.writeTextToFile("text.txt","Ghi nội dung văn bản vào "
                + "file text sử dụng Buffered Writer \n");
        String contentFromFile = fwd.readTextFromFile("text.txt");
        System.out.println(contentFromFile);
    }
    
    private void writeTextToFile(String fileName, String content){
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(FileWriterDemo.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    private String readTextFromFile(String fileName){
        StringBuilder sb = new StringBuilder();
 
        try {
            FileReader fd = new FileReader(fileName);    
            BufferedReader br = new BufferedReader(fd);
            String text;
            while((text = br.readLine()) != null ){
                sb.append(text);
            }
            br.close();
            fd.close();
        } catch (IOException ex) {
            Logger.getLogger(FileWriterDemo.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return sb.toString();
    }
}
