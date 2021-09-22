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
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class guie  implements ActionListener{
    JButton reg;
    JTextField tf,tf2;
    JLabel name,age;
    int aged;
    String named;
    JPanel p;
   JFrame f;
   public void g ()
           {
               f=new JFrame();
               reg=new JButton("Register");
               tf=new JTextField(7);
               tf2=new JTextField(4);
               name=new JLabel("Name");
               age=new JLabel("Age");
               f.setLayout(new BorderLayout());
               p=new JPanel();
               //p.setLayout(new BorderLayout());
               p.add(name);
                p.add(tf);
                 p.add(age);
                  p.add(tf2);
                   p.add(reg);
                   f.add(p);
       
                   f.setVisible(true);
                   f.setSize(300,400);
               reg.addActionListener(this);
             
           }
             // ArrayList<guie> list=new ArrayList<guie>();
              JLabel reg1;
              String n;
              int a;
              JLabel res;
   public void actionPerformed (ActionEvent e)
   {
       reg1=new JLabel("REGISTERATION COMPLETED");
      
       if (e.getSource()==reg)
       {
     
       // list.add(new guie());
        //list.get(i).set();
    
       p.add(reg1);
         n=tf.getText();
         a=Integer.parseInt(tf2.getText());
          res=new JLabel(n+"  "+a);
          p.add(res);
          
          
          
       }
       
   }
   public void setn (String n)
    {
           this.named=n;
    }
    public void seta (int a)
    {
   
         this.aged=a;
    }
   public static void main (String args [])
   {
       guie ca=new guie();
      ca.g();
   }
}
