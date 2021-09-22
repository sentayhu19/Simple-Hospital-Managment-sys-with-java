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
import java.util.Scanner;
public class ud {
    public static void val (double ht,double wt)
    {
        try 
        {
            if (ht<0 || wt<0)
            {
                throw new Exception ("Negative Heigh and Weignt not acceptable");
            }
            else if (ht==0)
            {
                    System.out.println("not valid");
                    }
            else
            {
                System.out.println("NUMBER IS VALID");
            }
           
            
        }
        catch (Exception e)
        {
            System.out.println("Exception cought"+e);
        }
        
        
    }
    public static void main (String args [])
    {
        Scanner b=new Scanner (System.in);
     System.out.println("Enter Height Employee: ");   
     double ht=b.nextDouble();
       System.out.println("Enter Weight Employee: ");   
     double wt=b.nextDouble();
     val(ht,wt);
        System.out.println(wt/(ht*ht)+" Result");
     
    }
   
}
