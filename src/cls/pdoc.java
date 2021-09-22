/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cls;

import java.util.*;

/**
 *
 * @author User
 */
public class pdoc  implements data{
    exception e=new exception();
    boolean empd=ddata.isEmpty();
    String doc_fname;  //doctor name
    String doc_lname;
    int doc_age;   //doctor age
    int doc_exp;  //doctor experiance
    String doc_spe;   //doctor specialization area
   private String psw;
   long did;  //doctor ID
   char dgen;
   String doc_av;   //doctor avalabel or not if true availabe else not
   public char getdg ()
   {
       return dgen;
   }
   public void setdgen(char gen)
   {
     this.dgen=gen;  
   }
    public String getdf ()   //returns first name
    {
        return doc_fname;
    }
    public String getdln()
    {
        return doc_lname;
    }
    public int getda ()
    {
        return doc_age;
    }
    public int getde ()
    {
        return doc_exp;
    }
    public String getav()
    {
        return doc_av;
    }
    public String getds ()
    {
        return doc_spe;
    }
    public String getdp ()
    {
        return psw;
    }
    public int docdata ()  
    {
        System.out.printf("%-15s %-15s %-8s %-10s %-10s %-20s %-18s %-10s\n",getdf(),getdln(),getdg(),getda(),getde(),getds(),getdp(),getdid());
      return 0;
    }
    public long getdid()
    {
        return did;   //doctor Identification
    }
    public void setav (String av)
    {
        this.doc_av=av;
    }
    public void setdfn(String fn)   //for updating Doctor first name
    {
        this.doc_fname=fn;
    }
    public void setdln(String ln)  //for updating Doctor last name
    {
        this.doc_lname=ln;
    }
    public void setda(int da)  //for updating Doctor age
    {
        this.doc_age=da;
    }
    public void setdex(int ye)  //for updating doctor year of experiance
    {
        this.doc_exp=ye;
    }
    public void setdp(String psw)   //for updating Doctor password
    {
        this.psw=psw;
    }
    public void setspe (String spe)  //for updating Doctor specialization
    {
      this.doc_spe=spe;  
    }
    public void setdoc()       //seting all data
    {
        Scanner b=new Scanner (System.in);
        System.out.println ("Enter the Doctor first Name: ");
        this.doc_fname=b.next();
        System.out.println ("Enter Doctor Last name");
        this.doc_lname=b.next();
        for (;;)
        {
            System.out.println ("Enter Doctor Age: ");
            if (e.mism()==true && e.PNval(e.val)==true)
            {
        this.doc_age=(int)e.val;
        break;
            }
        }
        
        for(;;) 
    {
        System.out.println("Enter Doctor Gender");
        if (e.mismg()==true && e.g=='m' || e.g=='M' || e.g=='f' || e.g=='F' )
        {
             this.dgen=e.g;
          break;  
        }
        else
        {
              System.out.println (RED+"\n\nPlese Enter M or F \n Enter the Gender of Doctor: "+R);     
        }
    }
        System.out.println ("Enter Doctor year of Experiance:");
        for (;;)
        {
            if (e.mism()==true && e.val>=0 && e.val<=100)
            {
        this.doc_exp=(int)e.val;
        break;
            }
            else
            {
              System.out.println (RED+"INVALID INPUT! Enter Doctor year of Experiance:"+R); 
            }
        }
        //ST
          int Break=0;
        b.nextLine();
        String pswc="";
             for (;;)
        {
                System.out.println ("Login Password: ");     
                
        pswc=b.nextLine();
               if(empd==true)
              {
                      this.psw=pswc;
                      
                 break;
              }
        for (int j=0;j<ddata.size();j++)
        {
        if (ddata.get(j).getdp().contains(pswc))  
         {
            Break=1;
            break;
   
         }
        else
        {
            Break=0;
            break;
        }
        }
  if (Break==1)
  {
                  System.out.println("Entered Password Exists for other Doctor please Add new Password!");
  }
  else
        {
             this.psw=pswc;
            break;
        }
        }
        //ED
        System.out.println ("Enter Doctor Specialization example : General(Gen)");  
        this.doc_spe=b.next();
        this.doc_av="OFF";
        for (;;)
    {
        int q=0;
          int  k=(int)(1+Math.random()*(500-1+1));
            if (ddata.get(q).getdid()!=k)   //assign ID if different from other saved
            {
                  this.did=k;  //after the loop if availble assign and stop loop
                     break;
            }
            else   
            { 
                q++;   //moving to the other rec id
                  k=(int)(1+Math.random()*(500-200+1));   //if the ID exists assign another
            }
    }
    }
}
class add extends m  {
  
  
  public void docm ()  //doctot menu  
   {
     
    Scanner b=new Scanner (System.in);
               System.out.println (Bac+"DOC LOGIN: "+R+"\nEnter First Name: ");
               String cdn=b.next();  //check doc name
                   System.out.println (" \nEnter Password : ");
                    int i;
                    b.nextLine();
               String cdp=b.nextLine(); //check doc psw
               
               for (i=0;i<ddata.size();i++)
               {
               if (ddata.get(i).getdf().contains(cdn) && ddata.get(i).getdp().contains(cdp))
               {
                   System.out.println(G+"Welcome DOCTOR :"+R+ ddata.get(i).getdf()+" "+ddata.get(i).getdln());
                    docm(i);
               }
               }
               System.out.println(RED+"The Name or the password you inserted does not match with any! REENTER: "+R);
                 docm();
               }
  public void docm (int i)  //doctor menu plus  i for sending the index of doctor info.
  {
      Scanner b=new Scanner(System.in);
      int counter=0;
           for (int dn=0;dn<pdata.size();dn++)
           {
               if (pdata.get(dn).getdocn().contains(ddata.get(i).getdf()))
               {
                 counter++;  
               }
           }
   
         int c; //choice    
         for (;;)
                     {
                         System.out.println (Bac+"\nMENU\n"+R+"[ 1 ]. view record (s).... ("+counter+")\n[ 2 ]. update record\n[ 3 ]. Personal Data(Edit)\n[ 4 ] .Availableity \n[ 5 ].Terms and Use\n [ 6 ]. LOGOUT");  
                         if (e.mism()==true && e.PNval(e.val)==true)
                         {
                          c=(int)e.val;
                          break;
                         }
                     }
        switch (c) {
            case 1:   //view record
                if (pdata.isEmpty())
                    {
                        System.out.println(RED+"\nNo Registered Patient Found :"+R);
                        System.out.println("To Return back enter any key");
                    String key=b.next();
                    logad();
                    }
                int c1;
                 for (;;)
                     {
                         System.out.println ("[ 1 ]. Record(s) \n[ 2 ]. ordered \n[ 3 ]. Search Record (Lab Req)\n[ 4 ]. Return Back ");
                         if (e.mism()==true && e.PNval(e.val)==true)
                         {
                          c1=(int)e.val;
                          break;
                         }
                     }
                m mm=new m();
                switch (c1) {
                    case 1:  //view record
                        System.out.println ("[ Data View.. ]\n");
                       System.out.printf ("%-14s %-10s %-5s %-8s %-8s %-10s %-11s %-15s %-16s %-16s %-14s %-16s %-13s \n","First Name", "Last Name","Age","Gender","height","Wight","Case","Phone number","Current state","House Number","E-Mail","Ward Number","ID");
      for (int k=0;k<pdata.size();k++)
         {
             if (pdata.get(k).getdocn().contains(ddata.get(i).getdf()))
             {
         pdata.get(k).data();
             }
         }
         System.out.println("To Return back press any key");
             String l=b.next();
             docm(i);
                        break;
                    case 2:  //ordered view 
                       
    int c4;   //menu choice
     for (;;)
                     {
                         System.out.println ("[ 1 ]. Order by Age\n[ 2 ]. Order by First Name\n[ 3 ]. Return back");
                         if (e.mism()==true && e.PNval(e.val)==true)
                         {
                          c4=(int)e.val;
                          break;
                         }
                     }
    if (c4==1 || c4==2)
    {
     System.out.printf ("%-14s %-10s %-5s %-8s %-8s %-10s %-11s %-15s %-16s %-16s %-14s %-16s %-13s \n","First Name", "Last Name","Age","Gender","height","Wight","Case","Phone number","Current state","House Number","E-Mail","Ward Number","ID");
    }
     if (c4==1)
    {
        
     Collections.sort (pdata, new psort());    //collection, sorting the record using the Comparator in psort class.
   
   for (int x=0;x<pdata.size();x++)        
         {
             if (pdata.get(x).getdocn().contains(ddata.get(i).getdf())) //Filtering patient record only whitch are treated by the doctor.
             {
         pdata.get(x).data();
             }
         }
          {
              System.out.println ("To return to main menu Enter any key?  :");
     String c5=b.next();
    docm(i);
   }
    }
    else if (c4==2)
    {
       Collections.sort (pdata, new namesort());    //collection ,sorting the record using the Comparator in namesort class/.     
        for (int j=0;j<pdata.size();j++)
         {
                          if (pdata.get(j).getdocn().contains(ddata.get(i).getdf()))  //Filtering patient record for doctor view
                          {
         pdata.get(j).data();
                          }
         }
          {
              System.out.println ("To return to main menu Enter any key?  :");
     String c5=b.next();
   docm(i);  
   }
    }
    else
    {
        docm(i);
    }
            break;
                    case 3:
                        System.out.println(Bac+"SEARCH: "+R);
                        
        int c2;
         for (;;)
                     {
                         System.out.println ("[ 1 ]. Search by ID\n[ 2 ]. Search by First Name\n[ 3 ]. Search by Phone number (Lab Request ,Test)");
                         if (e.mism()==true && e.PNval(e.val)==true)
                         {
                          c2=(int)e.val;
                          break;
                         }
                     }
         m data=new m ();
        if (c2==1)
        {
            int ic;
            int q;
           System.out.println ("Enter ID : "); 
           for (;;)
           {
               if (e.mism()==true && e.PNval(e.val)==true)
               {
            ic=(int)e.val; 
           break;
               }
           }
          
           for ( q=0;q<pdata.size();q++)
           {
               if (ic==pdata.get(q).getpid())
               {
                   System.out.println (G+"Record Found: "+R);
                  System.out.printf ("%-14s %-10s %-5s %-8s %-8s %-10s %-11s %-15s %-16s %-16s %-14s %-16s %-13s \n","First Name", "Last Name","Age","Gender","height","Wight","Case","Phone number","Current state","House Number","E-Mail","Ward Number","ID");
                pdata.get(q).data();  
                System.out.println ("To return to main menu enter any key");
                String c5=b.next();
                docm(i);
               }
               
            
           }
                        
                   System.out.println (RED+"Record Not found"+R);
                    System.out.println ("To return to menu enter any key");
                String c5=b.next();
                docm(i);
        }
        else if (c2==2)
        {
            int w;
            System.out.println ("Enter the First Name of the patient: ");
            String fnc=b.next();
          for ( w=0;w<pdata.size();w++)
           {
               if (pdata.get(w).getfn().contains(fnc))
               {
                   System.out.println (G+"Record Found: "+R);
                   System.out.printf ("%-14s %-10s %-5s %-8s %-8s %-10s %-11s %-15s %-16s %-16s %-14s %-16s %-13s \n","First Name", "Last Name","Age","Gender","height","Wight","Case","Phone number","Current state","House Number","E-Mail","Ward Number","ID");
                pdata.get(w).data();    
                 System.out.println ("To return to menu enter any key");
                String c5=b.next();
                docm(i);
               }
           } 
                   System.out.println (RED+"Record Not found"+R);
                   docm(i);     
        }
        else {
            int y;
  
            long pnc;// phone number check
             for (;;)
                     {
                                   System.out.println ("Enter the Phone number of patient: ");
                         if (e.mism()==true && e.PNval(e.val)==true)
                         {
                          pnc=(long)e.val;
                          break;
                         }
                     }
            for (y=0;y<pdata.size();y++)
           {
               if (pnc==pdata.get(y).getppn())
               {
                 System.out.println (G+"Record Found: "+R);
                  System.out.printf ("%-14s %-10s %-5s %-8s %-8s %-10s %-11s %-15s %-16s %-16s %-14s %-16s %-13s \n","First Name", "Last Name","Age","Gender","height","Wight","Case","Phone number","Current state","House Number","E-Mail","Ward Number","ID");
                   pdata.get(y).data();
                 
                   int rr=0;
                   for (;;)
                   {
                         System.out.println("[ 1] . Request Lab Test\n[ 2 ]. View Lab Report \n[ 3 ]. Return Back");
                       if(e.mism()==true && e.PNval(e.val))
                       {
                           rr=(int)e.val;
                           break;
                       }
                   }
                   if(rr==1)
                   {
                       
                       int labtest=0;
                   
                       for(;;)
                       {
                           System.out.println("( 1 ). Urinalysis\n( 2 ). CBC\n( 3 ). Liver Function Panel (LFP)\n( 4 ). Select All\n ( 5 ). Return back");
                               for (;;)
                   {
                       if(e.mism()==true && e.PNval(e.val)==true)
                       {
                           labtest=(int)e.val;
                           break;
                       }
                   }
                           
                       if(labtest==1)   //Labe test  be Set as U as unkowen
                       {
                           pdata.get(y).setpu("U");
                              pdata.get(y).setbg("U");
                                   System.out.println("Urinalysis Test RequestSent To Lab");
                       }
                       else if (labtest==2)
                       {
                             pdata.get(y).setcbc("U"); 
                                pdata.get(y).setbg("U");
                                              System.out.println("CBC Test Request Sent To Lab");
                       }
                       else if (labtest==3)
                       {
                                 pdata.get(y).setpliver("U"); 
                                    pdata.get(y).setbg("U");
                                            System.out.println("Liver Function Panel (LFP) Test Request Sent To Lab");
                       }
                       else if (labtest==4)
                       {
                            pdata.get(y).setpu("U");  
                            pdata.get(y).setcbc("U"); 
                              pdata.get(y).setpliver("U"); 
                              pdata.get(y).setbg("U");
                              System.out.println("All Test Request Sent To Lab");
                       }
                       else if (labtest==5)
                       {
                           docm(i);
                           break;
                       }
                       else
                       {
                           System.out.println(RED+"INVALID INPUT"+R);
                           docm(i);
                       }
                   }
                   }
                   else if(rr==2)
                   {
                       if(pdata.isEmpty())
                       {
                           System.out.println(RED+"There is No registered Patient"+R);
                           System.out.println("To Return Back press any key...");
                                   String ret=b.next();
                                   docm(i);
                       }
                  
                       int p=0;
                       for (;;)
                       {
                                System.out.println("Enter Patient Phone Number: ");
                           if(e.mism()==true && e.PNval(e.val)==true)
                           {
                               p=(int)e.val;
                               break;
                           }
                       }
                       int cou;
                       cou=0;
                       for(int tr=0;tr<pdata.size();tr++)
                       {
                           if(p==pdata.get(tr).getppn())
                           {
                               if (pdata.get(tr).getpcbc().contains("U"))
                               {
                                   //if (!(pdata.get(tr).getpu().contains("U")) || !(pdata.get(tr).getpu().contains(null))|| !(pdata.get(tr).getpliver().contains("U")) || !(pdata.get(tr).getpliver().contains(null)))
                                   {  
                                   }
                                   
                               }
                               else
                               {
                                       System.out.printf ("%-14s %-10s %-5s %-8s %-8s %-10s %-11s %-15s %-16s %-16s %-14s %-16s %-13s \n","First Name", "Last Name","Age","Gender","height","Wight","Case","Phone number","Current state","House Number","E-Mail","Ward Number","ID"); 
                                     pdata.get(tr).data();
                                     System.out.println(G+"|---------------------------------------------|"+R);
                                     System.out.println("LAB RESUTL: \n[ NT= Not Tested and U=Unknowen ] \n CBC : "+"[ WBCs ] [ RBCs ]  [ Hb(Hemoglobin]  [ Platelets ]\n"+pdata.get(tr).getpcbc()+"\nUrinanalysis : "+"[ Urine Color ] ,[ Urine Clarity ]  ,[ PH ]  ,[ Bilirubin ], [ Nitrate ]\n"+pdata.get(tr).getpu()+"\nBlood Type :"+pdata.get(tr).getpbg()+"\nLiver  :"+"Enter Liver Function Panel (LFP) (UA) Result: \nUse Order as: [ ALT (IU/L)] , [ AST (IU/L)]  ,[ ALP(U/L) ]  ,[ Albumin test (g/dL)], [ Bilirubin test (mg/dL)]\n"+pdata.get(tr).getpliver());
                                          System.out.println(G+"|---------------------------------------------|"+R);
                                     System.out.println("To Return Back press any key...");
                                   String ret=b.next();
                                   docm(i);
                               }
                               
                           }
                       
                       }
                           System.out.println(RED+"Patient did not took Lab Test"+R);
                           System.out.println("To Return Back press any key...");
                                   String ret=b.next();
                                   docm(i);
                   }
                   else if(rr==3)
                   {
                     docm(i);  
                   }
                   else
                   {
                       System.out.println(RED+"INVALID INPUT!"+R);
                   }
                   System.out.println ("To return to main menu enter any key");
                   String c5=b.next();
                   docm(i);  
               }
            
           }
                   System.out.println (RED+"Record Not found! "+R);
                   System.out.println ("To return to main menu enter any key: ");
                   String c5=b.next();
                   docm(i); 
               
        }
                        break;
               case 4:                   
                  default:
                        System.out.println(RED+"Plese Enter A VALID VALUE"+R);
                          docm(i);  //return
                             break;
                                      }
                                     
            case 2:  //update record
                System.out.println("UPDATE RECORD");
                 System.out.printf ("%-14s %-10s %-5s %-8s %-8s %-10s %-11s %-15s %-16s %-16s %-14s %-16s %-13s \n","First Name", "Last Name","Age","Gender","height","Wight","Case","Phone number","Current state","House Number","E-Mail","Ward Number","ID");
      for (int k=0;k<pdata.size();k++)
         {
             if (pdata.get(k).getdocn().contains(ddata.get(i).getdf()))
             {
         pdata.get(k).data();
             }
         }
      long ic;                          //ID check
      for(;;)
       {
           System.out.println("Enter ID of patient to Change (Update) Case:  ");
           if(e.mism()==true)
           {
               ic=(long)e.val;
               break;
           } 
       }
       for (int k=0;k<pdata.size();k++)
         {
             if (pdata.get(k).getdocn().contains(ddata.get(i).getdf()) && pdata.get(k).getpid()==ic)
             {
         pdata.get(k).data();
         System.out.println("Enter Case: ");
        pdata.get(k).setcase1(b.next());
          System.out.println("Status Updated!");
               docm(i);
             }
         }
       System.out.println(RED+"Entered ID Doest not match with any! "+R);
                docm(i);
                break;
            case 3:  //doc personal data edit
                System.out.printf("%-15s %-15s %-8s %-10s %-10s %-20s %-18s %-10s\n","[ 1 ]","[ 2 ]","[ 3 ]","[ 4 ]","[ 5 ]","[ 6 ]","[ 7 ]","");  
                 System.out.printf("%-15s %-15s %-8s %-10s %-10s %-20s %-18s %-10s\n","First Name","Last Name","Gender",".Age","Experiance","Specialization","Password","ID"); 
                System.out.println(ddata.get(i).docdata());
                 System.out.println("Enter Number to change :");
                 pdoc pd=new pdoc();
                 int c2=b.nextInt();
                 if (c2==1)
                 {
             System.out.println("Enter First name");
             ddata.get(i).setdfn(b.next());
             System.out.println("Record Updated!");
              docm(i);
                 }
                 else if (c2==2)
                 {
                             System.out.println("Enter Last name");
             ddata.get(i).setdln(b.next());
             System.out.println("Record Updated!");
              docm(i);
                 }
                 else if (c2==3)
                 {
           
              for(;;)
       {
            System.out.println("Enter Age");
           if(e.mism()==true && e.PNval(e.val))
           {
                ddata.get(i).setda((int)e.val);
               break;
           } 
       }
             System.out.println(G+"Record Updated!"+R);
              docm(i);
                 }
                 else if (c2==4 || c2==5)
                 {
                     System.out.println(RED+"No Permission to change! please Contact the ADMIN"+R);
                     docm(i);
                 }
                 else if (c2==6)
                 {
                           System.out.println("Enter New Password");
             ddata.get(i).setdp(b.next());
             System.out.println(G+"Record Updated!"+R);   
                docm(i);
                 }
                break;
            case 4:
                if (ddata.get(i).getav()==null)
                {
                        ddata.get(i).setav("OFF");  
                }
                System.out.println("Current State: "+ddata.get(i).getav());
               
                int c3;
                      for(;;)
       {
            System.out.println("[ 1 ]. Change\n[ 2 ]. Return Back");
           if(e.mism()==true && e.PNval(e.val)==true)
           {
               c3=(int)e.val;
               break;
           } 
       }
                if (c3==1)
                {
                    for (;;)
                    {
                            
                         if (ddata.get(i).getav().contains("ON"))
                         {
                             
                    int cs;   //current state
                                  for(;;)
       {
              System.out.println("Enter Number of State: \n[ 1 ]. "+RED+"OFF"+R);
           if(e.mism()==true && e.PNval(e.val)==true)
           {
               cs=(int)e.val;
               break;
           } 
       }
                    if (cs==1)
                    {
                         ddata.get(i).setav("ON");
                         System.out.println(G+"State Changed"+R);
                         docm(i);
                        break;
                    }
                    else if (cs==2)
                    {
                        ddata.get(i).setav("OFF");
                            System.out.println(G+"State Changed"+R);
                            docm(i);
                        break;
                    }
                    System.out.println(RED+"\nPlease Enter ON or OFF: "+R);
                    }
                         else
                         {
                           
                    int cs;  //current state
                                              for(;;)
       {
          System.out.println("Enter Number of State: \n[ 1 ]."+RED+" ON"+R);
           if(e.mism()==true && e.PNval(e.val)==true)
           {
               cs=(int)e.val;
               break;
           } 
       }
                    if (cs==1)
                    {
                         ddata.get(i).setav("ON");
                         System.out.println(G+"State Changed"+R);
                         docm(i);
                        break;
                    }
                    else if (cs==2)
                    {
                        ddata.get(i).setav("OFF");
                            System.out.println(G+"State Changed"+R);
                            docm(i);
                        break;
                    }
                    System.out.println(RED+"\nPlease Enter ON or OFF: "+R);   
                         }
                    }
                }
                else
                {
                    docm(i);
                }
                
                break;
            case 5:
                System.out.println("DR: TERMS AND USE \n Doctors have access to patient view record followed by updating the case of the patient.\nDoctor view patiens record only which are there patients\nDoctors can change there peronal status all but the Experiance year \n and specialization to change they must communicate with the admin  ");
                System.out.println("To Return back press any key");
                String j=b.next();
                docm(i);
                break;
            case 6:
                menu();
            default:
                System.out.println (RED+"INVALID INPUT! please enter correct menu option"+R);
                docm(i);
                docm();
                break;
        }   
  }
  public void disp ()
   {
       Scanner b=new Scanner (System.in);
      
       
     for (int i=0;i<pdata.size();i++)
         {
         pdata.get(i).data();
         }
     System.out.println ("To return to main menu Enter any key?  :");
     String c=b.next();
     menu();
   }
 
   }

