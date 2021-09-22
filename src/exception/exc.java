/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class exc {
    public static void val (int a)
    {
        try 
        {
            if (a==0)
            {
                throw new Exception("Age INVALID Can not be zero");
            }
            else if (a<0)
            {
                throw new Exception ("Number is Negative");
            }
        }
        catch (Exception e)
                {
                    System.out.println("this is e -> "+e+" So");
                }
    }
  public static void main (String args [])
  {
      Scanner b=new Scanner(System.in);
    System.out.println("Enter Emp Name: ");
    String n=b.next();
     System.out.println("Enter Emp Age: ");
    int a=b.nextInt();
    val(a);
  }
}
