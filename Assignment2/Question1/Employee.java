
package task2;

public class Employee extends person {
    String office;
    double salary;
    
    public Employee(String n,String a,String p,String e,String o,double s)
 
    {
    super(n,a,p,e);
    this.office=o;
    this.salary=s;
 
    }

    Employee() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public String toString()
    {
    
    return name+"empioyee";
    }
    
}


