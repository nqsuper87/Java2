/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.fpoly.Bai7;

/**
 *
 * @author nghiaquach
 */
public enum Transport {
    CAR(80), TRUCK(100), 
    BOAT(60), TRAIN(150), 
    AIRPLANE(900);
    
    private int speed;
    
    private Transport(int _speed) {
        this.speed = _speed;
    }
    
    public int getSpeed(){
        return speed;
    }
}




