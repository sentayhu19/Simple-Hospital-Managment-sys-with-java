/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cls;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class exception {  //Exception Handeling Class
          String R="\u001B[0m";   //reset
       String G="\u001B[32m";
         String Bac="\u001b[30;46m";
        String RED="\u001B[31m";
    public boolean PNval (double x)  //postive negative validate
    {
  
        if (x<=0)  //checking the number 
        {
            System.out.println("\n"+RED+"INVALID INPUT, Please Input Postive number!"+R);
            return false;   //return INVALID ,false
        }
        else
        {
            return true;  //else valid, true
        }
    }
       double val;
    public boolean mism ()
    {
        Scanner b=new Scanner (System.in);
                try         
                {
              val=b.nextDouble();
               return true;
                }
                catch (InputMismatchException e2)   
                {
                     String RED="\u001B[31m";
            System.out.println(RED+"INVALID INPUT Please Enter Number!"+R);   
                   return false;
                }
    }
    char g;
    public boolean mismg ()
    {    
        Scanner b=new Scanner (System.in); 
     try           
                {
              g=b.next().charAt(0);
               return true;
                }
                catch (InputMismatchException e3)   
                {
                    System.out.println(RED+"\nINVALID INPUT Please Enter F or M !"+R);  
                   return false;
                }   
    }
}
