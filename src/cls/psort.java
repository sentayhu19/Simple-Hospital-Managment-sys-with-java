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
class psort implements Comparator<pat>{
   public int compare (pat p, pat p2)
   {
       return Integer.valueOf(p.age).compareTo(p2.age);
   }
}


