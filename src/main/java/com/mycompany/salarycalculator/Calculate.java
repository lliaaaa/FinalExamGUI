/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salarycalculator;

/**
 *
 * @author Janelle
 */
public class Calculate {
    
    public double getSalary(double hr, double hw){
        
        return  hr * hw;
        
    }
    public double getSalary( double hr , double hw, double tx){
        double gross = hr * hw;
        return  gross * (tx/100);
        
        
        
    }
    
    public double getSalary(double hr, double hw,double tx, double l){
        double grossPay = hr * hw; 
        double taxDeduction = grossPay * (tx /100);
        return grossPay - taxDeduction - l;
        
    }
    
    
}
