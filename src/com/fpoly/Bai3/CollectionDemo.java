/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.Bai3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author nghiaquach
 */
public class CollectionDemo {
    public static void main(String args[]) {
        //add mssv into List
        List<String> studentsList = new ArrayList<String>();
        studentsList.add("PC123");
        studentsList.add("PC123");
        studentsList.add("PC456");
        
        //System.out.println("List: " + studentsList.toString());
        
        
         //add mssv into List
        Set<String> studentsSet = new HashSet<String>();
        studentsSet.add("PC789");
        studentsSet.add("PC789");
        studentsSet.add("PC777");
        
        studentsSet.addAll(studentsList);
        
        //System.out.println("Set: " + studentsSet.toString());
        
        
        List<String> nameList = new ArrayList<String>();
        nameList.add("Minh");
        nameList.add("Long");
        nameList.add("Linh");
        nameList.add("Vy");
        
        nameList.set(1, "An");
        
        //System.out.println("Name List: " + nameList.toString());
        
        nameList.remove("Minh");
        
        //System.out.println("Name List after remove: " + nameList.toString());
        
        for (String name : nameList) {
            System.out.print(name + ";");
        }
        
    }
}
