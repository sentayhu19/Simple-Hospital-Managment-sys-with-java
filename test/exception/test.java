/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author User
 */
import java.lang.Exception;
import java.util.*;
public class test {
    public static void main (String args [])
    {
        System.out.println("Dividing");
      a();     
    }
    public static void a()
    {
      try 
        {
        m();
        }
     catch (InputMismatchException e)
        {
            System.out.println("ERRRRRR");  
        }  
    }
    public static void m () throws ArithmeticException 
    {
        int n=3,n2=0;
        try 
        {
            n2=n/n2;
        }
        catch (Exception e)
        {
          a();  
        }
        
        
    }
}
