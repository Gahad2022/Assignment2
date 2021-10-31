/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import javax.security.auth.Subject;

/**
 *
 * @author ABO AMER
 */
public class JavaApplication24 {

    
    public static void main(String[] args) {
        
        
       Student sd= new Student ("gehad", 35 , 2.6);
         System.out.println(sd.toString());
       sd.display();
        System.out.println("the number of objects created in this class is " + sd.getNumberofobject());
       
       System.out.println("////////////////////////");
      
        Address a =new Address(45, "minia", "egypt");
        System.out.println(a.toString());
       a.display();
       
        System.out.println("////////////////////////");
       
       
       subject s= new subject(101, "science", 3);
       System.out.println(s.toString());
       s.display();
        
       
    }
    
