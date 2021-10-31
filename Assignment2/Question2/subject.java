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
public class subject {
    
    public  int subjecID;
    public String subjectName;
    public int SubjectHours;
     private static int Numberofobject=0;

    public subject()
    {
        Numberofobject++;
    }

    /**
     *
     * @param subjecID
     * @param subjectName
     * @param SubjectHours
     */
    public subject(int subjecID, String subjectName, int SubjectHours) {
        this.subjecID = subjecID;
        this.subjectName = subjectName;
        this.SubjectHours = SubjectHours;
         Numberofobject++;
    }
    public void display()
    {
        System.out.println("the subjecID is" + subjecID + " the subjectName is  " + subjectName + "  SubjectHours ");
    }
     public String toString ()
       {
           return subjectName + " subject ";
       }
     
      public static int getNumberofobject()
    {
        return Numberofobject;
    }
}

    
    
    
    
    
    
   