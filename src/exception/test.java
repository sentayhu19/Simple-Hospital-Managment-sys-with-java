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
import java.lang.Exception.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class test {
    public static void main (String args [])
    {
       int x=12,y=0,z;
       Scanner b=new Scanner (System.in);
       try 
       {
         x=b.nextInt();  
       }
       catch (InputMismatchException e)
       {
           System.out.println(e+"  Proble...");
       }
    }
}
