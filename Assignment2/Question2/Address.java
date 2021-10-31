/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

/**
 *
 * @author ABO AMER
 */
public class Address {
    
     int streetNO;
    String city;
    String country;
    public Address(int streetNO , String city , String country)
    {
        this.streetNO=streetNO;
        this.city=city;
        this.country=country;
    } 

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}