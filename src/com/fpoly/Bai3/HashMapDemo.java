/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.Bai3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author nghiaquach
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<String, Double>();
        map.put("Nokia", 700.00);
        map.put("Nokia", 200.00);
        map.put("Samsung", 1000.00);
        map.put("Black Berry", 100.00);
        map.put("Samsung", 300.00);
        
        //System.out.println(map.toString());
        
        Set<String> keys = map.keySet();
        
        System.out.println(keys.toString());
        //cách thứ nhất
        for (String key : keys) {
            Double price = map.get(key);
            System.out.println("Giá: " + price);
        }
        
        System.out.println("===================");
        
        //cách thứ hai
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            
            System.out.println("Sản phẩm: " + key);
            System.out.println("Giá: " + val);
        }
        
    }
}
