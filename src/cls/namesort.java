/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cls;
import java.util.Comparator;
/**
 *
 * @author User
 */
class namesort implements Comparator <pat>
{
   public int compare (pat p, pat p2)
   {
       return String.valueOf(p.fname).compareTo(p2.fname);  //sorting the patient data by name
   } 
}
class Adnamesort implements Comparator <pdoc>  
{
   public int compare (pdoc p, pdoc p2)
   {
       return String.valueOf(p.doc_fname).compareTo(p2.doc_fname);  //sorting the patient data by name Ac
   } 
}
class Ddnamesort implements Comparator <pdoc>  
{
   public int compare (pdoc p, pdoc p2)
   {
       return String.valueOf(p2.doc_fname).compareTo(p.doc_fname);  //sorting the patient data by name Dc
   } 
}

