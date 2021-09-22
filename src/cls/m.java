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
interface data 
{
   ArrayList <pat> pdata=new ArrayList <pat>();   //patient info   (Pdata) patient data
     ArrayList <pdoc> ddata=new ArrayList<pdoc>();   //Doctor info      (ddata)patient data
     //-------------------------------------------
     //COLORS OF TEXT
           String R="\u001B[0m";   //reset
       String G="\u001B[32m";    
       String RED="\u001B[31m";
         String Bac="\u001b[30;46m";
               String B="\u001b[35;47m";
               String Y="\u001b[43m";
  //-------------------------------------------
         String lpsw="lab123";
         String lus="lab";
}

 class m extends pat implements data
{
     static int p;
      exception e=new exception();
     String dyk= "Did you know: \nBy eating one serving of pumkin, sweet potato or carrots per day helps: \n1. Your organs stay healthy\n2. Lower the risk of cancer\n3. Lower Blood pressure\n--------------"+ "\nYour Body Needs: LIVER=220 calories\nBRAIN=240 Calories\nHEART=440 calories\nKIDNEYS=440  Just for 4 organs 1340 calories\nYour nerve impulse move way faster than you do.\n Exerise Boosts BrainPower\nMovement Melts Away Stress";  //did you know health tips
     public void clear()  //for clearing screen
     {
         for (int i=0;i<10;i++)
         {
             System.out.println();
         }
     }
      
    int tot=0;
 public void adddoc (int tot)
  {   
int i;
int value=ddata.size();   //seting total data of records

i=ddata.size();

              System.out.println ("Enter the Record "+(i+1));
              ddata.add (new pdoc());
              ddata.get(i).setdoc();
             System.out.println (G+"Data Saved! "+R);
             m me=new m();
             me.logad ();
  }
   public void menu  ()             //Main Menu of the program
   {
       Scanner b=new Scanner (System.in); 
       //-----------------------MENU--------------------------------------
       System.out.println("\t\t"+B+"-----------------------------"+R);
       System.out.println ("\t\t\t[  "+G+"WELCOME"+R+"   ] "+"\n\t\t"+B+"-----------------------------"+R+R+"\n\n\t\t    "+Bac+" [ MENU ] "+R+"\n\t\t[ 1 ]. Patient Registeration\n\t\t[ 2 ]. LOGIN\n\t\t[ 3 ]. Did You Know?  \n\t\t[ 4 ]. BMI(Body Mass Index)\n\t\t[ 5 ]. Availablity of Doctor \n\t\t[ 6 ]. Terms and Use\n\t\t[ 7 ]. About(Developers)\n\t\t[ 8 ]. Exit");
     int c5=0;
       int c=0;  
          for (;;)
                {
                        System.out.print("Option: ");
                if (e.mism()==true)
                {
                    break;
                }
                }
                   c5=(int)e.val;
           
          switch (c5) {
              case 1:  //patient reg
                  System.out.println ("-------------------------------");
                  add();
                  break;
          //ed
              case 2:   //LOGIN
                  //st
                  System.out.println(Bac+"LOGIN"+R);
                  System.out.println ("[ 1 ]. Doctor\n[ 2 ]. Adim\n[ 3 ]. Labratory \n[ 4 ]. Return Back");
                  int c6;
                  for (;;)
                  {
                      if (e.mism()==true && e.PNval(e.val)==true)
                      {
                  c6=(int)e.val;    //choice from menu
                  break;
                      }
                  }
                  switch (c6) {
                      case 1:  //Doctor LOGIN
                          add ad=new add();
                          ad.docm();
                          break;
                      case 2:   //ADMIN LOGIN
                          adminm();
                          break;
                      case 3: 
                      lab();  //lab login
                          break;
                                  case 4:
                                      menu();
                      default:  
                          System.out.println(RED+"INVALID INPUT!"+R);
                          menu();
                          break;
                  }     
                    int n=0; //adding records
                    break;
              case 3:
                  System.out.println("\n"+G+"[ HEALTH TIPS ] "+R+"\n");
                  //did you know?
                System.out.println(dyk);
                  System.out.println("\n\n  To Return back Press Any Key: ");
                  String info=b.next();
                  menu();
                  break;
              case 4:
                  double ht;

                  System.out.println(Bac+"Calculate BODY MASS INDEX: "+R);   //just for calculating and showing result with suggestion
                  for (;;)
                  {       
                         System.out.println("Enter Your Hieght:   Mesurment in (M) ");
                  if (e.mism()==true && e.PNval(e.val)==true  && e.val<=2.30)  //if no mismatch and postive number then value is true
                  {
                      break;  //if tue then stop loop
                  }
                  if (e.val>=2.30)
                  {
                      System.out.println(RED+"Height can not be "+e.val+" Please Enter Valid Height"+R);
                  }
                  }
                       ht=e.val;
                       for (;;)
                       {
                  System.out.println("Enter Your Weight  : Mesurment in (KG)");
                  double wt;
                  if (e.mism()==true && e.PNval(e.val)==true && e.val<=300)
                  {
                      break;
                  }
                  if (e.val>300)
                  {
                      System.out.println(RED+"Weight can not be "+e.val+"Please enter valid weight"+R);
                  }
                  
                       }
                      wt=(double)e.val;
                 double bmi=wt/(ht*ht);
                 System.out.println("Your BMI is : "+bmi+" With this BMI :");
                 if (bmi<=18.5)
                 {
                   System.out.println(RED+"Your Under Weight :Suggestion  If you need, increaseing the amount of food you eat \neach day or reducing the amount of exerices can help you gain weight."+R);
                 System.out.println("To return back press any key: ");
                 String returnb=b.next();
                 clear();
                 menu();
                 }
                 else if (bmi>18.5 && bmi<24.9)
                 {
                   System.out.println(G+"Your have Normal Weight. You are within healty weight range."+R); 
                      System.out.println("To return back press any key: ");
                 String returnb=b.next();
                 clear();
                   menu();
                 }
                 else
                 {
                    System.out.println(RED+"Obesity: You are Considered overweight. You have to reduce amount of food you eat and Exerices"+R);  
                    System.out.println("To return back press any key: ");
                 String returnb=b.next();
                 clear();
                   menu();
                 }
                  break;
              case 5:
                  if (ddata.isEmpty())
                  {
                      System.out.println("There is No Registered Doctor");
                       System.out.println("\n[ Enter any key to return to main menu: ]");
               String u=b.next();
                 clear();
               menu();
                      
                  }
                     System.out.printf("%-15s %-15s %-10s\n","First Name","Last Name","(Availablity of Doctor)");
                     System.out.println("-------------------------------------");
                      for (int u=0;u<ddata.size();u++)
                  {
                      if(ddata.get(u).getav()=="ON")
                      {
                      System.out.printf("%-15s %-15s %-10s\n",ddata.get(u).getdf(),ddata.get(u).getdln(),"("+G+ddata.get(u).getav()+R+" )");
                      } 
                      else
                      {
                      System.out.printf("%-15s %-15s %-10s\n",ddata.get(u).getdf(),ddata.get(u).getdln(),"( "+RED+ddata.get(u).getav()+R+ " )");
                      } 
                  }
                      System.out.println("-------------------------------------");
                      System.out.println("[ 1 ]. Search\n[ 2 ]. Order View\n[ 3 ]. Return");
                      int sr;
                      for (;;)
                      {
                          if (e.mism()==true && e.PNval(e.val)==true)
                          {
                      sr=(int)e.val;  //search or return
                      break;
                          }
                      }
                      if(sr==3)
                      {
                          menu();
                      }
                      else if (sr==2)
                      {
                          System.out.println("Order By First Name\n [ 1 ]. Ascending \n[ 2 ]. Descending");
                         int ad;
                          for (;;)
                      {
                          if (e.mism()==true && e.PNval(e.val)==true)
                          {
                     ad=(int)e.val;  //search or return
                      break;
                          }
                      }
                          if(ad==1)   // View Record in Ascending 
                          {
                            Collections.sort(ddata,new Adnamesort());
                                     System.out.printf("%-15s %-15s\n","First Name","Last Name");
                            for(int i=0;i<ddata.size();i++)
                            {
                              
                                System.out.printf("%-15s %-15s\n",ddata.get(i).getdf(),ddata.get(i).getdln());
                            }
                                System.out.println("To return back press any key: ");
                 String returnb=b.next();
                   menu();
                            
                          }
                          else if (ad==2)
                          {
                            Collections.sort(ddata,new Ddnamesort()); 
                            System.out.printf("%-15s %-15s\n","First Name","Last Name");
                            for(int m=0;m<ddata.size();m++)
                            {          
                                System.out.printf("%-15s %-15s\n",ddata.get(m).getdf(),ddata.get(m).getdln());
                            }
                                  System.out.println("To return back press any key: ");
                 String returnb=b.next();
                   menu();
                          }
                          else
                          {
                              menu();
                          }
                      }
                      else if (sr==1)
                      {
                          System.out.println("[ 1 ]. Search by Name\n[ 2 ]. Search by Spcialization \n[ 3 ]. Return Back");
                          int search=0;
                          for (;;)
                          {
                              if(e.mism()==true && e.PNval(e.val))
                              {
                                  search=(int)e.val;
                                  break;
                              }
                                 System.out.println("[ 1 ]. Search by Name\n[ 2 ]. Search by Spcialization \n[ 3 ]. Return Back");
                              System.out.println("Enter From Menu");
                          }
                          if(search==1)
                          {
                              int u;
                  System.out.println("Search:  \nEnter Doctor First Name :");
                  String dfn=b.next();
                  int counter;
                  counter=0;
                  System.out.printf("%-15s %-15s %-10s\n ","First Name","Last Name","(Availablity of Doctor)");
                  for (u=0;u<ddata.size();u++)
                  {
                      
                      if (ddata.get(u).getdf().contains(dfn) && ddata.get(u).doc_av.contains("OFF"))
                      {
                      System.out.printf("%-15s %-15s %-10s\n",ddata.get(u).getdf(),ddata.get(u).getdln(),"( "+RED+ddata.get(u).getav()+R+" )");
                      }
                      else if (ddata.get(u).getdf().contains(dfn) && ddata.get(u).doc_av.contains("ON"))
                      {
                      System.out.printf("%-15s %-15s %-10s\n",ddata.get(u).getdf(),ddata.get(u).getdln(),"( "+G+ddata.get(u).getav()+R+" )");
                      }
                      else
                      {
                         counter++; 
                      }
                  }
                  for (int r=0;r<ddata.size();r++)
                  {
                  if (counter==pdata.size())
                      {     
                     System.out.println(RED+"Dr. Name  by the name "+dfn+" Not Found"+R);
                         System.out.println("To Return back press any key");
                              String j=b.next();
                          menu();
                          
                      }
                  }
                              System.out.println("To Return back press any key");
                              String j=b.next();
                              menu();
                      }
                          else if(search==2)
                      {
                          System.out.println("Enter Dr. Specialization: ");
                         // b.nextLine();
                          String spe=b.next();
                          int k;
                          int count;
                          count=0;
                          for (k=0;k<ddata.size();k++)
                          {
                              if(ddata.get(k).getds().contains(spe))
                              {
                                  System.out.println(G+"Showing Search Results\nDr. Found by: "+spe+R);
                                  System.out.printf("%-15s %-15s\n","First Name","Last Name");
                                  System.out.printf("%-15s %-15s\n",ddata.get(k).getdf(),ddata.get(k).getdln());
                              }
                              else
                              {
                                  count++;
                              }
                          }
                          for (int p=0;p<ddata.size();p++)
                          {
                              if(count==pdata.size())
                              {
                          System.out.println(RED+"Dr. specialization  by "+spe+" Not Found"+R);
                           System.out.println("To Return back press any key");
                              String j=b.next();
                          menu();
                              }
                          }
                             System.out.println("To Return back press any key");
                              String j=b.next();
                              menu();
                      }
                          else if (search==3)
                          {
                              menu();
                          }
                          else
                          {
                              System.out.println("Please Input Valid Number");
                          }
                      }
                      
                  break;
              case 6: 
               System.out.println("TERMS AND USE GENERAL");
               System.out.println("Patiens Register to any doctor availabel in the hospital.\nwhen Patient register they may choose simple illness followed by doctors name.\nIn simple illnes there are there illness basically but if the patien illness is not simple then they should choose other\n And they can write the case if knowen else they can write unknown  and the doctor will update there case. ");
               System.out.println("\n[ Enter any key to return to main menu: ]");
               String u=b.next();
                 clear();
               menu();
                  break;
              case 7:
                  System.out.println("DEVELOPED BY: \n "+G+"Version 1.0 Patient Record System\n\n senayhu berhanu\nFantahun belachew\nBereket Demeke\n dagmawi zewdu\n Matias mekuria\n Fuad Abdulmoin \n Meron Abrham");
                     System.out.println("\n[ Enter any key to return to main menu: ]");
               String p=b.next();
                 clear();
               menu();
               break;
              case 8:
                     System.exit(0);
              default:
                System.out.println("INVALID INPUT please Enter the numbers from menu choice ,RENTER!");
                menu();
          }
   }
   public void add ()
   {
   
          //STT
          Scanner b=new Scanner(System.in);
                 int c2=0;                            {
                 System.out.println(Bac+"Patient Registeration"+R);   
        for (;;)
          {
          System.out.println ("[ 1 ]. Paying\n[ 2 ]. Not Paying \n[ 3 ]. Return to main menu");  //patient paying or not    
             if (e.mism()==true && e.PNval(e.val)==true)
             {
                     c2=(int)e.val; //adding record
                 break;
             }
          }
          }
          int n=0;
          if (c2==1)
          { 
                   p=0;
          for (;;)
          {
              System.out.println ("How Many Records: ");
             if (e.mism()==true && e.PNval(e.val)==true)
             {
                     n=(int)e.val; //adding record
                 break;
             }
          }
      
          //st
          add (n);
          tot=tot+n;
          System.out.println (G+"Data Saved !"+R);
          menu();
          }
     
          //ed
          //st
          else if (c2==2)
          {
              p=p+1;
              System.out.println("Pn is "+p);
             
        for (;;)
          {
              System.out.println ("How Many Records: ");
             if (e.mism()==true && e.PNval(e.val)==true)
             {
                 n=(int)e.val;
                 break;
             }
          }
            add(n);
          //ed
      }
          else if (c2==3)
          {
              menu();
          }
          else 
          {
              System.out.println(RED+"Please enter valid number from menu"+R);
              menu();
          }
   
   
   }
   public void orderv (int order) 
   {
       int c4=0;
    Scanner b=new Scanner (System.in);
    System.out.println ("[ 1 ]. Order by Age\n[ 2 ]. order by First Name");
       for (;;)
                      {
                          if (e.mism()==true && e.PNval(e.val)==true)
                          {
                     c4=(int)e.val;  //order or return
                      break;
                          }
                      }
    
System.out.printf ("%-14s %-10s %-5s %-8s %-8s %-10s %-11s %-15s %-16s %-16s %-14s %-16s %-13s \n","First Name", "Last Name","Age","Gender","height","Wight","Case","Phone number","Current state","House Number","E-Mail","Ward Number","ID");
    if (c4==1)
    {
        
     Collections.sort (pdata, new psort());    //collection, sorting the record using the Comparator in psort class.
   
   for (int i=0;i<pdata.size();i++)        
         {
         pdata.get(i).data();
         }
          {
              System.out.println ("To return to main menu Enter any key?  :");
     String c5=b.next();
     add d=new add();  
   }
    }
    else if (c4==2)
    {
       Collections.sort (pdata, new namesort());    //collection ,sorting the record using the Comparator in namesort class/.     
        for (int i=0;i<pdata.size();i++)
         {
         pdata.get(i).data();
         }
          {
              System.out.println ("To return to main menu Enter any key?  :");
     String c5=b.next();
     menu();   
   }
    }
   for (int i=0;i<pdata.size();i++)
         {
         pdata.get(i).data();
         }
          {

              System.out.println ("To return to main menu Enter any key?  :");
     String c5=b.next();
     menu();   
   }
   }
   @SuppressWarnings("StringEquality")
      public void search ()
    {
        int c=0;
        Scanner b=new Scanner (System.in);
        System.out.println ("[ 1 ]. Search by ID\n[ 2 ]. Search by First Name\n[ 3 ]. Search by Phone number\n[ 4 ]. Return back");
         for (;;)
          {
             if (e.mism()==true && e.PNval(e.val)==true)
             {
                 c=(int)e.val;
                 break;
             }
          }
        
         m data=new m ();
        if (c==1)
        {
            int i;
           System.out.println ("Enter Patient ID : "); 
           int ic; 
           for (;;)
          {
             if (e.mism()==true && e.PNval(e.val)==true)
             {
                 ic=(int)e.val;
                 break;
             }
          }
          
           for ( i=0;i<pdata.size();i++)
           {
               if (ic==pdata.get(i).getpid())
               {
                   System.out.println ("Record Found: ");
                   System.out.printf ("%-14s %-10s %-5s %-8s %-8s %-10s %-11s %-15s %-16s %-16s %-14s %-16s %-13s \n","First Name", "Last Name","Age","Gender","height","Wight","Case","Phone number","Current state","House Number","E-Mail","Ward Number","ID");
                pdata.get(i).data();  
                System.out.println ("To return to main menu enter any key");
                String c1=b.next();
                logad();
               }       
           }
                   System.out.println ("Not found");
                    System.out.println ("To return to main menu enter any key");
                String c1=b.next();
                   logad();      
        }
        else if (c==2)
        {
            int i;
            System.out.println ("Enter the First Name of the patient: ");
            String fnc=b.next();
            int counter;
            counter=0;
          for ( i=0;i<pdata.size();i++)
           {
               if (pdata.get(i).getfn().contains(fnc))
               {
                   System.out.println ("Record Found: ");
                   System.out.printf ("%-14s %-10s %-5s %-8s %-8s %-10s %-11s %-15s %-16s %-16s %-14s %-16s %-13s \n","First Name", "Last Name","Age","Gender","height","Wight","Case","Phone number","Current state","House Number","E-Mail","Ward Number","ID");
                pdata.get(i).data();  
               }
                else
                {
                   counter++;     
                        }
           } 
          if (counter==pdata.size())
          {
                   System.out.println ("  Not found  ");
                      System.out.println ("To return to main menu enter any key");
                String c1=b.next();
                logad();
                   logad();
          }
            System.out.println ("To return to main menu enter any key");
                String c1=b.next();
                logad();
               
        }
        else  if (c==3)
                {
            int i;
            System.out.println ("Enter the Phone number of patient: ");
            long pnc;// phone number check
             for (;;)
          {
             if (e.mism()==true && e.PNval(e.val)==true)
             {
                 pnc=(int)e.val;
                 break;
             }
          }
             int co;
             co=0;
            for (i=0;i<pdata.size();i++)
           {
               if (pnc==pdata.get(i).getppn())
               {
                 System.out.println ("Record Found: ");
                 System.out.printf ("%-14s %-10s %-5s %-8s %-8s %-10s %-11s %-15s %-16s %-16s %-14s %-16s %-13s \n","First Name", "Last Name","Age","Gender","height","Wight","Case","Phone number","Current state","House Number","E-Mail","Ward Number","ID");
                   pdata.get(i).data();
               }
               else
               {
                 co++;  
               } 
           }
            if (co==pdata.size())
            {
                   System.out.println ("Not found");
                   System.out.println ("To return to main menu enter any key: ");
                   String c1=b.next();
                   logad(); 
            }
            
               
        }
        else
        {
            logad();
        }
                System.out.println ("To return to main menu enter any key");
                   String c1=b.next();
                   logad();  
    }
   public void add (int n)
{
int i;
i=pdata.size();
              System.out.println ("Enter the Record "+(i+1));
              pdata.add (new m());
              pdata.get(i).setpat();
          tot=tot+1;
             if (n>1)
             {
             add(n-1);
             } 
             System.out.println ("Data Saved! ");
             menu ();
             
          }
   
   public void dispdoc ()
   {
       System.out.printf("%-15s %-15s %-8s %-10s %-10s %-20s %-18s %-10s\n","First Name","Last Name","Gender","Age","Experiance","Specialization","Password","ID"); 
       for (int j=0;j<ddata.size();j++)
                            {
                                ddata.get(j).docdata();
                             }  
   }
   String psw1="admin123";
   public void adminm ()
   {
        Scanner b=new Scanner (System.in);
       System.out.println (Bac+"LOGIN"+R+"\n[ 1 ]. Admin LOGIN \n[ 2 ].Return Back ");  
        int c;
       for (;;)
                {
                if (e.mism()==true && e.PNval(e.val)==true)
                {
                    break;
                }
                }
       c=(int)e.val;
      
       if (c==2)
       {
           menu();
       }
       System.out.println ("Enter Admin Name: "); 
             String ad="admin";
            String can=b.next();  //check admin name
            System.out.println ("Enter Addmin Password: ");
            String cap=b.next();   //check admin password
            
            if (can.equals(ad)&& cap.equals(psw1))
            {
                System.out.println (Bac+"\nADMIN:\n "+R);
             logad();
            
           }
            else
            {
                System.out.println ("Pleae input correct password or Addim name! ");
                adminm();
            }
            
   }
   public void logad ()  //login of admin
            {
       int c7=0;
                int dtot=0;
                Scanner b=new Scanner (System.in);
                System.out.println(Bac+"[ Menu ]"+R);
                System.out.println ("[ 1 ]. Register Doctor\n[ 2 ] . view Doctor ("+ddata.size()+")\n[ 3 ]. view patients (Update) ("+pdata.size()+")\n[ 4 ]. Update Doctor\n[ 5 ].Change Health Tips \n[ 6 ]. Terms and Use\n[ 7 ]. Factory Reset\n[ 8 ]. Logout \nOption: "); 
                for (;;)
                {
                if (e.mism()==true && e.PNval(e.val)==true)
                {
                    break;
                }
                }
                   c7=(int)e.val;
            switch (c7) {
                case 1:  //register doctor
                    m pd=new m ();
                    pd.adddoc(ddata.size());
                    break;
                case 2:     //view doc record
                    if (ddata.isEmpty())
                    {
                        System.out.println("\nNo Registered Doctor Found :");
                        System.out.println("To Return back enter any key");
                    String key=b.next();
                    logad();
                    }
                    System.out.println("Showing Data of Doctors");
                    dispdoc();
                    System.out.println("To Return back enter any key");
                    String key=b.next();
                    logad();
                    
                    break;
                case 3:
                    if (pdata.isEmpty())
                    {
                        System.out.println("\nNo Registered Patient Found :");
                        System.out.println("To Return back enter any key");
                    String key2=b.next();
                    logad();
                    }
                    System.out.println("Showing Patient Record");
              System.out.printf ("%-14s %-10s %-5s %-8s %-8s %-10s %-11s %-15s %-16s %-16s %-14s %-16s %-13s \n","First Name", "Last Name","Age","Gender","height","Wight","Case","Phone number","Current state","House Number","E-Mail","Ward Number","ID");
                    for (int y=0;y<pdata.size();y++)
                    {
                        System.out.println(" Patient of  : Dr.[ "+pdata.get(y).getdocn()+" ]");
                        System.out.println(pdata.get(y).data());
                    
                    }
                    int y;
                    System.out.println("----------------------------------");
                    System.out.println("[ 1 ]. Search\n[ 2 ]. Update\n[ 3 ]. Sort\n[ 4 ]. Return back");
                       int choice=0;
                    for (;;)
                    {
                      if (e.mism()==true && e.PNval(e.val))
                      {
                          break;
                      }
                    }
                 choice=(int)e.val;
                    if (choice==1)
                    {
                        search();
                    }
                    else if (choice==3)
                    {
                        System.out.println("[ 1 ]. Sort By First Name\n[ 2 ]. Sort by Age\n[ 3 ]. Return back ");
                        int sort;
                         for (;;)
          {
             if (e.mism()==true && e.PNval(e.val)==true)
             {
                 sort=(int)e.val;
                 break;
             }
          }
                        if (sort==1)
                        {
                            System.out.println("Sorting by Name");
                          Collections.sort(pdata,new namesort());
                          System.out.printf ("%-14s %-10s %-5s %-8s %-8s %-10s %-11s %-15s %-16s %-16s %-14s %-16s %-13s \n","First Name", "Last Name","Age","Gender","height","Wight","Case","Phone number","Current state","House Number","E-Mail","Ward Number","ID");
                          for (int sor=0;sor<pdata.size();sor++)
                          {
                             pdata.get(sor).data();
                          }
                           System.out.println("To Return back enter any key");
                    String key2=b.next();
                    logad();
                        }
                        else if (sort==2)
                        {
                          System.out.println("Sorting by Age");
                          Collections.sort(pdata,new psort());   
                          System.out.printf ("%-14s %-10s %-5s %-8s %-8s %-10s %-11s %-15s %-16s %-16s %-14s %-16s %-13s \n","First Name", "Last Name","Age","Gender","height","Wight","Case","Phone number","Current state","House Number","E-Mail","Ward Number","ID");
                          for (int sor=0;sor<pdata.size();sor++)
                          {
                             pdata.get(sor).data();
                          }
                           System.out.println("To Return back enter any key");
                    String key2=b.next();
                    logad();
                        }
                        else if (sort==3)  
                        {
                           logad(); 
                        }   
                        else
                        {
                            System.out.println("\nINVALID INPUT!");
                            logad();
                        }
                    }
                    else if (choice==4)
                    {
                        logad();
                    }
                    else if (choice==2)
                    {
                    System.out.println("Enter Patient of ID : ");
                    int ic=0;//Enter ID for cheking
                    for (;;)
                    {
                      if (e.mism()==true && e.PNval(e.val)==true)
                      {
                          break;
                      }
                    }
                    ic=(int)e.val;
                     for (y=0;y<pdata.size();y++)
                    {
                        if (ic==pdata.get(y).getpid())
                        {
                                  System.out.println("0. Patient of  : Dr.[ "+pdata.get(y).getdocn()+" ]");
                                  System.out.printf("%-14s %-10s %-5s %-8s %-8s %-10s %-11s %-15s %-16s %-16s %-14s %-16s \n","(1)","(2)","(3)","(4)","(5)","(6)","(7)","(8)","(9)","(10)","(11)","(12)");
                           System.out.printf ("%-14s %-10s %-5s %-8s %-8s %-10s %-11s %-15s %-16s %-16s %-14s %-16s\n","First Name", "Last Name","Age","Gender","height","Wight","Case","Phone number","Current state","House Number","E-Mail","Ward Number","ID");
                        System.out.println(" Patient of  : Dr.[ "+pdata.get(y).getdocn()+" ]");
                        System.out.println(pdata.get(y).data());  
                        int c=0;   //change
                        for (;;)
                        {
                                System.out.println("Enter Number To change : ");
                            if (e.mism()==true && e.val>=0)
                            {
                                break;
                            }
                        }
                        c=(int)e.val;
                        if(c==1)
                        {
                            System.out.println("Enter Name: ");
                           pdata.get(y).setfn(b.next());
                           System.out.println("First Name Changed  Successfully");
                                logad();
                        }
                        else if (c==0)
                        {
                            if (ddata.isEmpty())
                            {
                                System.out.println("There is No Registered Doctor, please Register Doctor before assigning");
                                   logad(); 
                            }
                            System.out.println(" Name ");
                            for (int l=0;l<ddata.size();l++)
                            {
                                System.out.println("Dr.  "+ddata.get(l).doc_fname+" "+ddata.get(l).doc_lname);
                            }
                              System.out.println("Assign Doctor to Patient :\n  Enter Dr. First Name");
                              String docfn=b.next();  //doctor first name for cheking
                           
                                   for (int l=0;l<ddata.size();l++)
                            {
                                if (ddata.get(l).getdf().contains(docfn))
                                {
                                         pdata.get(y).Setpdocn(docfn);  
                                         System.out.println("Doctor Assigned to patient ");
                                            System.out.println("Doctor Assigned for patient Successfully"); 
                                logad();
                                }
                            }
                                    System.out.println("The Doctor by the given name does not exist! \n");
                                    logad();
                        
                        }
                        else if (c==2)
                        {
                               System.out.println("Enter Last: ");
                                   pdata.get(y).setln(b.next());
                           System.out.println("Last Name Changed  Successfully"); 
                                logad();
                        }
                        else if (c==3)
                        {
                               System.out.println("Enter Age: ");
                                      for (;;)
                                      {
                                          if (e.mism() && e.PNval(e.val))
                                          {
                                             break; 
                                          }
                                      }
                                   pdata.get(y).seta((int)e.val);
                           System.out.println("Age Changed  Successfully"); 
                                logad();
                        }
                        else if (c==4)
                        {
                               System.out.println("Enter Gender: ");
                               for (;;)
                               {
                                   if (e.mismg()==true)
                                   {
                                          pdata.get(y).setg(e.g);
                                       break;
                                   }
                                   System.out.println("Enter M or F");
                               }
                                
                           System.out.println("Gender Changed  Successfully"); 
                                logad();
                        }
                        else if (c==5)
                        {
                               System.out.println("Enter Hieght: ");
                               for (;;)
                               {
                                   if (e.mism()==true && e.PNval(e.val)==true)
                                   {
                                       break;
                                   }
                               }
                                   pdata.get(y).settht(e.val);
                           System.out.println("Height Changed  Successfully"); 
                                logad();
                        }
                        else if (c==6)
                        {
                               System.out.println("Enter Weight: ");
                                   pdata.get(y).setwt(b.nextDouble());
                           System.out.println("Weight Changed  Successfully"); 
                                logad();
                        }
                        else if (c==7)
                        {
                               System.out.println("Enter case: ");
                                   pdata.get(y).setcase1(b.next());
                           System.out.println("Case Changed  Successfully"); 
                                logad();
                        }
                        else if (c==8)
                        {
                               System.out.println("Enter Phone Number: ");
                                   pdata.get(y).setppn(b.nextInt());
                           System.out.println("Phone Number Changed  Successfully"); 
                                logad();
                        }
                        else if (c==9)
                        {
                               System.out.println("Enter Current Status: ");
                                   pdata.get(y).setstat(b.next());
                           System.out.println("Current Status Changed  Successfully"); 
                                logad();
                        }
                        else if (c==10)
                        {
                               System.out.println("Enter House Number: ");
                                   pdata.get(y).sethn(b.nextInt());
                           System.out.println("House Number Changed  Successfully"); 
                                logad();
                        }
                        else if (c==11)
                        {
                               System.out.println("Enter E-Mail: ");
                                   pdata.get(y).setemail(b.next());
                           System.out.println("E-mail Changed  Successfully"); 
                                logad();
                        }
                        else if (c==12)
                        {
                         int ward;
                                   //ST
                                   for (;;) 
                             {
              
                for (;;)
                {
                      System.out.println("Enter Ward No: ");
                    if (e.mism()==true && e.PNval(e.val)==true)
                    {
                        ward=(int)e.val;
                        break;
                    }
                    
                }
              
           for (int j=0;j<pdata.size();j++)
           {
               if (ward==pdata.get(j).getwn())
               {
                   System.out.println(RED+"Entered Ward NO is Bussy! or Taken"+R);
               } 
               else
               {
                   break;
               }
           }
                    }
                        }
                        }
                    }
                      System.out.println("To Return back enter any key");
                    String key3=b.next();
                    logad(); 
                    }
                    else
                    {
                        System.out.println(RED+"  INVALID INPUT");
                        logad();
                    }
                    break;
                case 4:   //update or change doctor record or delete
                    if (ddata.isEmpty())
                    {
                        System.out.println("\nNo Registered Doctor Found :");
                        System.out.println("To Return back enter any key");
                    String key3=b.next();
                    logad();
                    }
                    System.out.println ("Update \n[ 1] .Delete Doc Record\n[ 2 ].Update (change)");
                    int c1;
                    for (;;)
                    {
                      if (e.mism()==true && e.PNval(e.val)==true)
                      {
                          c1=(int)e.val;
                          break;
                      }
                    }
                    String fn;
                    if (c1==1)
                    {
                        System.out.println ("Enter the Id: ");
                        long iic; //ID check
                        for (;;)
                    {
                      if (e.mism()==true && e.PNval(e.val)==true)
                      {
                          iic=(long)e.val;
                          break;
                      }
                    }
                      
                        for (int i=0;i<ddata.size();i++)
                        {
                            fn=ddata.get(i).getdf();  //adding name of doc before deleting
                            if (ddata.get(i).getdid()==iic)
                            {
                                System.out.println("Record Found!");
                                System.out.printf("%-15s %-15s %-8s %-10s %-10s %-20s %-18s %-10s\n","First Name","Last Name","Gender","Age","Experiance","Specialization","Password","ID"); 
                                ddata.get(i).docdata();
                                
                                System.out.println ("Are you sure you want to delete record ?  [Y][N]  ");
                                String yn=b.next();  //yes no
                                if (yn.charAt(0)=='Y'|| yn.charAt(0)=='y')
                                {
                                    
                                    ddata.remove(i).docdata();
                                    System.out.println (" Record Deleted! ");
                                    for (int z=0;z<pdata.size();z++)
                                    {
                                        if (pdata.get(z).getdocn().contains(fn))
                                        {
                                          pdata.get(z).setdn("Uknowen");  //since the doctor is deleted ,changing the Doctor name of the patient
                                        }
                                    }
                                    logad();
                                }
                                else
                                {
                                    menu ();
                                }
                            }
                            else
                            {
                                System.out.println ("No Record by "+iic+ " ID \nTo Return to main menu press any key: ");
                                String c2=b.next();
                                menu();
                                
                            }
                        }
                    } 
                    else if (c1==2)
                    {
                        System.out.println("Update Doc Record");
                        System.out.println("Enter Doctor ID: ");
                        long icc;   //id check
                        for (;;)
                    {
                      if (e.mism()==true && e.PNval(e.val)==true)
                      {
                          icc=(int)e.val;
                          break;
                      }
                    }
                        for (int i=0;i<ddata.size();i++)
                        {
                        if (ddata.get(i).getdid()==icc)
                        {
                            System.out.printf("%-15s %-15s %-8s %-10s %-10s %-20s %-18s %-10s\n","[ 1 ]","[ 2 ]","[ 3 ]","[ 4 ]","[ 5 ]","[ 6 ]","[ 7 ]","");  
                            System.out.printf("%-15s %-15s %-8s %-10s %-10s %-20s %-18s %-10s\n","First Name","Last Name","Gender","Age","Experiance","Specialization","Password","ID");  
                            System.out.println(ddata.get(i).docdata());
                            int c2=b.nextInt();
                            if (c2==1)
                 {
             System.out.println("Enter First name");
             ddata.get(i).setdfn(b.next());
             System.out.println("Record Updated!");
              logad();
                 }
                 else if (c2==2)
                 {
                             System.out.println("Enter Last name");
             ddata.get(i).setdln(b.next());
             System.out.println("Record Updated!");
              logad();
                 }
                 else if (c2==3)
                 {
                          
                             for (;;)
                             {
                                    System.out.println("Enter Gender: ");
                                 if (e.mismg())
                                 {
             ddata.get(i).setdgen(b.next().charAt(0));
             break;
                                 }
                             }
             System.out.println("Record Updated!");
              logad();
                 }
                 else if (c2==4)
                 {
                for (;;)
                    {
                     System.out.println("Enter Age");
                      if (e.mism()==true && e.PNval(e.val)==true)
                      {
                           ddata.get(i).setda((int)e.val);
                          break;
                      }
                    }
             System.out.println("Record Updated!");
              logad();
                 }
                 else if (c2==4)
                 {
                   
                     for (;;)
                    {
                          System.out.println("Enter Year of Experiance: ");
                   
                      if (e.mism()==true && e.PNval(e.val)==true)
                      {
                            ddata.get(i).setdex((int)e.val);
                          break;
                      }
                    }
                     logad();
                 }
                 else if (c2==5)
                 {
                     System.out.println("Enter doctor Specialization");
                     ddata.get(i).setspe(b.nextLine());
                 }
                 else if (c2==6)
                 {
                           System.out.println("Enter New Password");
             ddata.get(i).setdp(b.next());
             System.out.println("Record Updated!");   
                logad();
                 }
                        }
                        }
                    }
                    else
                    {
                        System.out.println("INAVILD INPUT, Please Input Correct menu number");
                        logad();
                    }
                    break;
                case 5:
                    int cn;
                    System.out.println("Change Health Tips:\n "+dyk+"\n1. Change \n2. Return back");
                    for (;;)
                    {
                        if (e.mism()==true && e.PNval(e.val)==true)
                        {
                     cn=(int)e.val;  //change menu
                    break;
                        }
                    }
                    if (cn==1)
                    {
                        for (;;)
                        {
                     System.out.println("Enter the Health Tip :");
                     b.nextLine();
                        dyk=b.nextLine(); 
                        System.out.println("\nEntered (Changed) Result: \n"+dyk);
                     System.out.println("1 Confirm /n2. Cancel");
                     int cc;  //cancel or confirm the input
                     for (;;)
                     {
                         if (e.mism()==true && e.PNval(e.val))
                         {
                          cc=(int)e.val;
                          break;
                         }
                     }
                     if (cc==1)
                     {
                         System.out.println("\nTip Saved!");
                         logad();
                         break;
                     }
                     System.out.println("RENTER! ");
                        }
                    } 
                    else 
                    {
                        menu();
                    }
                break;
                case 6:
                System.out.println("TERMS AND USE : ADMIN\nADMINS can view all patients record and doctor record and futher more update.\nAdmins have the power to Delete Patient or Doctor Record, And Admis Can also Reset the Current patient and Doctor Data's");
                    System.out.println("To return back enter any key");
                    String ret=b.next();
                    logad();
                break;
                case 7:
                    System.out.println("[  RESET ]\n [ 1 ] . Reset Doctor Record\n[ 2 ]. Reset Patient Record\n[ 3 ]. Reset All (Delete All)\n[ 4 ].Return back");
                    int reset;
                    for (;;)
                     {
                         if (e.mism()==true && e.PNval(e.val))
                         {
                          reset=(int)e.val;
                          break;
                         }
                     }
                    if (reset==1)   //reset doctor
                    {
                        if (ddata.isEmpty())
                        {
                            System.out.println("There is no registered doc!");
                               System.out.println("To return back enter any key");
                   ret=b.next();
                    logad();
                        }
                        System.out.println("Enter ADMINISTER Password: ");
                        String cpsw=b.next();   //enter check password of admin
                        m del=new m();
                        if (cpsw.equals(del.psw1))
                        {
                            ddata.clear();  
                            System.out.println(" [ Reset Completed! ] ");
                     logad();
                        }
                   
                     System.out.println(" [ Password Does not match! ] ");
                     logad();
                    }
                    else if (reset==2)    //reset patient record
                    {
                         if (pdata.isEmpty())
                        {
                            System.out.println("There is no registered patient!");
                               System.out.println("To return back enter any key");
                   ret=b.next();
                    logad();
                        }
                     System.out.println("Enter ADMINISTER Password: ");
                        String cpsw=b.next();   //enter check password of admin
                        m del=new m();
                        if (cpsw.equals(del.psw1))
                        {
                            pdata.clear();  
                            System.out.println(" [ Reset Completed! ] ");
                     logad();
                        }
                   
                     System.out.println(" [ Password Does not match! ] ");
                     logad();
                    }
                    else if(reset==3) //delete all
                    {
                         if (pdata.isEmpty()  && ddata.isEmpty())
                        {
                            System.out.println("There is no registered patient or Doc!");
                               System.out.println("To return back enter any key");
                   ret=b.next();
                    logad();
                        }
                     System.out.println("Enter ADMINISTER Password: ");
                        String cpsw=b.next();   //enter to check password of admin
                        m del=new m();
                        if (cpsw.equals(del.psw1))
                        {
                            pdata.clear();  
         System.out.println("Are You Sure Delete All ?  [Y] or [N]");
                       String yn=b.next();  //yes or no
                       if (yn.charAt(0)=='Y')
                       {
                          pdata.clear();
                          ddata.clear();
                          System.out.println("[ Reset Completed! ]");
                          logad();
                     logad();
                        }   
                      
                       }
                       else
                       {
                           System.out.println("\nPassword does not Match!");
                           logad();
                       }
                       
                    }
                    else 
                    {
                        logad();
                    }
                    
                case 8:
                menu();    
                default:
                    System.out.println("Enter Valid Number from menu!");
                    logad();
                    break;
            }   
            }
   public void lab ()
   {
       Scanner b=new Scanner (System.in);
       System.out.println(Bac+"LABORATORY LOGIN"+R+"\n[ 1 ]. Login\n[ 2 ]. Return back");
       int lab=0;
       for(;;)
       {
           if(e.mism()==true && e.PNval(e.val)==true)
           {
               lab=(int)e.val;
               break;
           }
       }
       if(lab==1)
       {
           System.out.println("Enter Lab Name");
           String lu=b.next();
           System.out.println("Enter Lab Password");
           String lp=b.next();
           if (lu.equals(lus) && lp.equals(lpsw))
           {
               System.out.println("\n"+G+"WELCOME To LAB"+R);
               labmenu();
           }
           else
           {
               System.out.println(RED+"Password or User Name does not match!"+R);
               lab();
           }
       }
       else
       {
           menu();
       }
   }
   public void labmenu ()
   {
       System.out.println(Bac+"Menu"+R+"\n[ 1 ]. Patient Request \n[ 2 ]. Logout");
       int labm=0;
       Scanner b=new Scanner (System.in);
       for(;;)
       {
           if(e.mism()==true  && e.PNval(e.val)==true)
           {
               labm=(int)e.val;
               break;
           }
       }
       if(labm==1)
       {
          
           int nc=0;  //new or completed
           int cout=0;
           for (int r=0;r<pdata.size();r++)  //couter for new req
           {
             if  (pdata.get(r).getpu().contains("U") || pdata.get(r).getpcbc().contains("U") || pdata.get(r).getpliver().contains("U"))
             {
                 cout++;
             }
           }
       for(;;)
       {
             System.out.println("[ 1 ] . New Request ("+cout+")\n[ 2 ] . All patient \n[ 3 ]. Return back"); 
           if(e.mism()==true && e.PNval(e.val)==true)
           {
               nc=(int)e.val;
               break;
           } 
       }
       
       if(nc==1)  //new req
       {
           if (cout==0)
       {
           System.out.println("  There is No Lab Request!  ");
               System.out.println("To Return Back press any key...");
                                   String ret=b.next();
                                   labmenu();
       }
           if (pdata.isEmpty())
           {
               System.out.println(RED+"There is no Registered Patient"+R);
               labmenu();
           }
           System.out.printf("%-15s %-15s %-15s\n","First Name" ,"Last Name","Phone Number");
           for (int i=0;i<pdata.size();i++)
           {
               if (pdata.get(i).getpu()=="U" || pdata.get(i).getpcbc()=="U" || pdata.get(i).getpliver()=="U")
               {
                   System.out.printf("%-15s %-15s %-15s \n",pdata.get(i).getfn(),pdata.get(i).getln(),pdata.get(i).getppn());   
               }
               
           }
      System.out.println ("\nEnter the Phone number of patient: ");
           int pn;
           for (;;)
           {
               if (e.mism()==true && e.PNval(e.val)==true)
               {
                   pn=(int)e.val;
                   break;
               }
           }
          int y=0;
           for (y=0;y<pdata.size();y++)
           {
               if (pn==pdata.get(y).getppn() && pdata.get(y).getpu()=="U" || pdata.get(y).getpcbc()=="U" || pdata.get(y).getpliver()=="U")
               {
               System.out.printf("%-15s %-15s %-15s\n","First Name" ,"Last Name","Phone Number");
                System.out.printf("%-15s %-15s %-15s \n",pdata.get(y).getfn(),pdata.get(y).getln(),pdata.get(y).getppn());   
                     labmenu(y);  
               } 
           }
             y--;  //after the loop incremented the value of Y there will be INDEX OUT OF BOUND y should be red by 1 to get value
           if (pn!=pdata.get(y).getppn())
                          {
                              System.out.println(RED+"Then Phone Number You Entered does not match with any!"+R); 
                              labmenu();
                          }
           ///--ST
              
       //---ED
           }  
      
       else if(nc==2)  //logout
       {
           if (pdata.isEmpty())
           {
               System.out.println("There is Not registered patient ..");
                   System.out.println("To Return Back press any key...");
                                   String ret=b.next();
                                   labmenu();
           }
           System.out.println(Bac+" Completed Patient Lab Test "+R);
          for (int i=0;i<pdata.size();i++)
          {
             if (pdata.get(i).getpcbc().contains("NT") || pdata.get(i).getpbg().contains("NT") || pdata.get(i).getpliver().contains("NT") || pdata.get(i).getpu().contains("NT")|| pdata.get(i).getpcbc().contains("U") || pdata.get(i).getpbg().contains("U") || pdata.get(i).getpliver().contains("U") || pdata.get(i).getpu().contains("U"))
             {
                 System.out.printf("%-15s %-15s \n","First Name","Last Name");
                     System.out.printf("%-15s %-15s \n",pdata.get(i).getfn(),pdata.get(i).getln());
                 System.out.println("\nLab Result: ");
                System.out.println(G+"|---------------------------------------------|"+R);
                                     System.out.println("LAB RESUTL: \n[ NT= Not Tested and U=Unknowen ] \n CBC : "+"[ WBCs ] [ RBCs ]  [ Hb(Hemoglobin]  [ Platelets ]\n"+pdata.get(i).getpcbc()+"\nUrinanalysis : "+"[ Urine Color ] ,[ Urine Clarity ]  ,[ PH ]  ,[ Bilirubin ], [ Nitrate ]\n"+pdata.get(i).getpu()+"\nBlood Type :"+pdata.get(i).getpbg()+"\nLiver  :"+"Enter Liver Function Panel (LFP) (UA) Result: \nUse Order as: [ ALT (IU/L)] , [ AST (IU/L)]  ,[ ALP(U/L) ]  ,[ Albumin test (g/dL)], [ Bilirubin test (mg/dL)]\n"+pdata.get(i).getpliver());
                                          System.out.println(G+"|---------------------------------------------|"+R);  
             }
          }
                System.out.println("To Return Back press any key...");
                                   String ret=b.next();
                                   labmenu();
       }
       else if (nc==3)
       {
        labmenu();   
       }
       else
       {
           System.out.println(RED+"INVALID INPUT"+R);
       }
   }
       else
       {
           menu();
       }
   }
 
public void labmenu(int y)
{
    Scanner b=new Scanner (System.in);
int labtest=0;
                           String u="U";
                    
                               System.out.println(G+"-------------------------------"+R);
                               System.out.println("Requested By Dr. "+pdata.get(y).getdocn());
                               System.out.println(G+"-------------------------------"+R);
                                          System.out.println("\nRequested Tests: ");
                               if (pdata.get(y).getpcbc().contains ("U") || pdata.get(y).getpliver().contains("U") || pdata.get(y).getpu().contains("U"))
                               {
                               if (pdata.get(y).getpcbc().contains("U"))
                           {
                               System.out.println("\n-> CBC");
                           }
                             if (  pdata.get(y).getpu().contains("U"))
                             {
                               System.out.println(" -> Urinalysis");
                             }
                              if (  pdata.get(y).getpliver().contains("U"))
                              {
                               System.out.println(" -> Liver Function Panel (LFP)");   
                              }
                              System.out.println(G+"-------------------------------"+R);
                              System.out.println("[ 1 ]. Return Back");
                                   System.out.println("[ 2 ]. Continue on Entering Procedure Test Results\n");
                                   System.out.println("CBC "+pdata.get(y).getpcbc());
                                    System.out.println("Urine "+pdata.get(y).getpu());
                                     System.out.println("Liver"+pdata.get(y).getpliver());
                               }
                               else
                               {
                                   System.out.println(G+"All Requested Test have been Inserted!"+R);
                                   System.out.println("To Return back press any key");
                                   String rett=b.next();
                                   labmenu();
                               }
                              int ur;
                             for (;;)
                              {
                              if (e.mism()==true && e.PNval(e.val)==true)
                              {
                                ur=(int)e.val;
                                  break;
                                  }
                              }
                              if (ur==1)
                               {
                                   labmenu();
                               }
                              if (ur==2)
                              {
                                   String bt;
                                   if (pdata.get(y).getpbg().contains ("U"))
                                   {
                                        System.out.println("Enter Patient Blood Type: (e.g A+) else type U");
                                      for (;;)
                                      {
                                          bt=b.next();
                                      if (bt.equals("A+") || bt.equals("B+") || bt.equals("O+") ||bt.equals("A-") || bt.equals("B-") || bt.equals("O-") || bt.equals("U"))
                                      {
                                       pdata.get(y).setbg(bt);  
                                        System.out.println(" Data Saved");
                                               b.nextLine();
                                     break;
                                      }
                                      else
                                      {
                                          System.out.println(RED+"Blood Group Can not be "+R+bt+RED+" Please Enter valid blood type E.g A+"+R);
                                      }
                                      }
                                   }
                             
                               if (pdata.get(y).getpcbc().contains ("U"))
                               {
                                   System.out.println("Enter CBC Result: \nUse Order as: [ WBCs ], [ RBCs ] , [ Hb(Hemoglobin]  ,[ Platelets ] ");
                                   pdata.get(y).setcbc(b.nextLine());
                                   labmenu(y);
                               }
                               else if (pdata.get(y).getpu().contains("U"))
                               {
                                    System.out.println("Enter Urinalysis(UA) Result: \nUse Order as: [ Urine Color ] ,[ Urine Clarity ]  ,[ PH ]  ,[ Bilirubin ], [ Nitrate ]");      
                                    pdata.get(y).setpu(b.nextLine());
                                   labmenu(y);
                               }
                               else if (pdata.get(y).getpliver().contains("U"))
                               {
                                     System.out.println("Enter Liver Function Panel (LFP) (UA) Result: \nUse Order as: [ ALT (IU/L)] , [ AST (IU/L)]  ,[ ALP(U/L) ]  ,[ Albumin test (g/dL)], [ Bilirubin test (mg/dL)]"); 
                                     pdata.get(y).setpliver(b.nextLine()); 
                                     labmenu(y);
                               } 
                               else
                               {
                                   System.out.println(G+"You Have Finished Entering Test Result of Patient"+R);
                                   labmenu();
                               }
                              }
                              else
                               {
                                   System.out.println("INVALID INPUT");
                                   labmenu();
                               }
                              System.out.println("AA");
                           }
}
 
