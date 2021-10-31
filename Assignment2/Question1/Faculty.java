/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

public class Faculty extends Employee{
    double work_hour;
    String rank;
    public Faculty(String n,String a,String p,String e,String o,double s,double w,String r)
    {
    super(n,a,p,e,o,s);
    this.work_hour=w;
    this.rank=r;  
    }  

    Faculty() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public String toString()
    {
    
    return name +"Faculty";
            
    
    
    }
      
}
