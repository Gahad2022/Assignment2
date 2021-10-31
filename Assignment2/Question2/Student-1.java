
package javaapplication24;

import javax.security.auth.Subject;


public class Student {
    String     name;
    int        id;
    double     gpa;
    Subject     subject;
    Address      address;
    public Student(String name , int id , double gpa , Subject subject , Address address )
    {
 
       this  .name=name;
       this   .id=id;
       this   .gpa=gpa;
       this   .subject=subject;
       this   .address=address;
     
 }

    Student(String gehad, int i, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  void display()
  {
      System.out.print("Name is :"+ name + "ID is :"+ id +"GPA is : "+ gpa);
      
      System.out.print( " the Subject is : "+subject.id+" "+subject.name+" "+subject.hours);
      System.out.print(" the Address is :"+address.streetNO+" "+address.city+" "+address.country);
      
  }

    String getNumberofobject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated// methods, choose Tools | Templates.
    }
    
    
}

    

