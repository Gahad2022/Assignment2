
package task2;


public class person {
   String name;
    String address;
    String phone_number;
    String email_address;
    

 public person()
    {
        
    }
    public person(String n,String a,String p,String e)
    {
    name=n;
    address=a;
    phone_number=p;
    email_address=e;
    
    
    }
    public String toString()       
    {
    return name+"person";
    }
}
