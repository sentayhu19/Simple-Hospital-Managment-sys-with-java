/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cls;

/**
 *
 * @author User
 */
import java.math.*;
import java.util.*;
 class  pat   extends pdoc implements data{ 
  //patient personal data
  String fname;       //patient first name
  String lname;     //patient last name
   int age;         //patient age
   char gen;      //patient gender
   String email;  //patient email
   int hn;  //patient house number
   long pid; //patient ID
   String city;   //patient city
   int ppn; //patient phone number
   String status;
   double ht;  //patient height
   double wt;  //patient weight
   double paying; //amount 
   int wn;  //ward number if needed
   String case1;  //case of patient
   String docname;   //Patient assigned doctor name
   //-------Patient Lab Test 
   String pu;  //Urinalysis
   String pcbc;  //patient CBC (complete Blood Count)
   String pbg;    //patient blood group
   String  pliver;   //patient Liver Function panel(LFT)
   //-----------
   public String getpu ()  //get patient urineanalyisis
   {
       return pu;
   }
   public String getpcbc ()  //get patient CBC
   {
       return pcbc;
   }
   public String getpbg ()  //get patient blood group
   {
       return pbg;
   }
   public String getpliver ()  //get patient liver
   {
       return pliver;
   }
   public void setpu (String pn)
   {
       this.pu=pn;
   }
     public void setcbc (String cbc)
   {
       this.pcbc=cbc;
   }
       public void setbg (String bg)
   {
       this.pbg=bg;
   }
         public void setpliver (String liver)
   {
       this.pliver=liver;
   }
   public void Setpdocn (String pdn)   //set specifically the patient doctor name
   {
     this.docname=pdn;
   }
 public String getdocn ()   //get the doctor name assigned for the patient
 {
     return docname;
 }
   public String getfn ()   //get first name
   {
       return fname;
   }
   public String getc ()    //get the case of the patient
   {
       return case1;
   }
    public String getln ()   //get last name
   {
       return lname;
   }
     public int geta ()   //get age of patient
   {
       return age;
   }
      public String getemail ()    //get email
   {
       return email;
   }
       public int gethn ()   //get house number
   {
       return hn;
   }
        public long getpid ()   //getID
   {
       return pid;
   }
         public String getct ()   //get  city
   {
       return city;
   }
         public int getppn()  //get patient phone number
         {
             return ppn;
         }
          public String getstat ()  //get current state
   {
       return status;
   }
           public double getht ()  //get height
   {
       return ht;
   }
            public double  getwt ()  //get weight
   {
       return wt;
   }
             public double  getpay ()  //get payment of the patient if paying
   {
       return paying;
   }
             public char getg ()   //get gender of patient
             {
                 return gen;
             }
             public int getwn ()   //patient ward if needed
             {
                 return wn;
             }
             public String getcase1 ()    //patient case
             {
                 return case1;
             }
             public void setdn(String n)   //for updating the patient doctor name
             {
                 this.docname=n;
             }
             
             //START SET  ,SPECIFIC SET FOR UPDATE PURPOSE
              public void settfn (String fn)   //get first name
   {
       this.fname=fn;
   }
   public void setc (String c)    //set the case of the patient
   {
       this.case1=c;
   }
   public void setfn (String fn)
   {
       this.fname=fn;
   }
    public void setln (String ln)   //set last name
   {
       this.lname=ln;
   }
     public void seta (int a)   //set age of patient
   {
       this.age=a;
   }
      public void setemail (String e)    //set email
   {
       this.email=e;
   }
       public void sethn (int h)   //set house number
   {
        this.hn=h;
   }
         public void setct (String c)   //set  city
   {
       this.city=c;
   }
         public void setppn(int pp)  //set patient phone number
         {
             this.ppn=pp;
         }
          public void setstat (String st)  //set current state
   {
       this.status=st;
   }
           public void settht (double h)  //set height
   {
       this.ht=ht;
   }
            public void  setwt (double w)  //set weight
   {
       this.wt=w;
   }
             public void  setpay (double p)  //set payment of the patient if paying
   {
       this.paying=p;
   }
             public void setg (char g)   //set gender of patient
             {
                 this.gen=g;
             }
             public void setwn (int w)   //patient ward if needed
             {
                 this.wn=w;
             }
             public void setcase1 (String c)    //patient case
             {
              this.case1=c;
             }
             //END SET
             
        public void setpat ( )   //seting the patient data
  {
      Scanner b=new Scanner (System.in);
      System.out.println ("Enter Name of patient: "); 
    this.fname=b.nextLine();  
    System.out.println ("Enter Last Name of Patient:  ");
    this.lname=b.nextLine();
    //------ Lab Test
       this.pbg="NT";
     this.pcbc="NT";
     this.pliver="NT"; 
      this.pu="NT";
      //-----
       exception e=new exception();
    for (;;)
    {
         System.out.println ("Enter Age of patient");
        if (e.mism()==true && e.PNval(e.val)==true)
        {   
    this.age=(int)e.val;
         break;   
        }
    }
    
    for(;;) 
    {
        System.out.println ("Enter the Gender of patient: ");
        if (e.mismg()==true && e.g=='m' || e.g=='M' || e.g=='f' || e.g=='F')
        {
                 this.gen=e.g;
          break;  
        }
        else
        {
              System.out.println ("\n"+RED+"Plese Enter M or F \n "+R);
             
        }
    }
     System.out.println ("Enter E-Mail of patient");
    this.email=b.next();
    for (;;)
    {
    System.out.println ("Enter House Number of patient");
        if (e.mism()==true && e.PNval(e.val)==true)
        {   
      this.hn=(int)e.val;
         break;   
        }
    }
    System.out.println ("Enter City of patient: ");
    this.city=b.nextLine();
    for (;;)
    {
       System.out.println ("Enter Patient phone number");
        if (e.mism()==true && e.PNval(e.val)==true)
        {   
     this.ppn=(int)e.val;
         break;   
        }
    }
    System.out.println ("Enter Current Status of patient:  (Well)(good)(bad)");
    this.status=b.next();
    
    for (;;)
    {
       System.out.println ("Enter Height of the Patient");
        if (e.mism()==true && e.PNval(e.val)==true && e.val<2.30)
        {   
     this.ht=e.val;
         break;   
        }
        if (e.val>=2.30)
        {
            System.out.println(RED+"Heigth can not be "+R+e.val);
        }
    }
    for (;;)
    {
     
    System.out.println ("Enter weight of patient: ");
        if (e.mism()==true && e.PNval(e.val)==true && e.val<350)
        {   
       this.wt=e.val;
         break;   
        }
        if (e.val>=350)
        {
            System.out.println(RED+"Weight can not be: "+R);
        }
    }
    //ID
    for (;;)
    {
        int q=0;
          int  k=(int)(1+Math.random()*(500-200+1));
            if (pdata.get(q).getpid()!=k)   //if the assigned room is not busy the stop the loop
            {
                  this.pid=k;  //after the loop if availble assign and stop loop
                     break;
            }
            else   
            { 
                q++;   //moving to the other rec id
                  k=(int)(1+Math.random()*(500-200+1));   //if the ID exists assign another
            }

        
    }
    System.out.println ("Ward Needed ?  [Y][N]: ");
    String c=b.next();
    if (c.charAt(0)=='y' || c.charAt(0)=='Y')
    {
           int k=(int)(1+Math.random()*(500-200+1));  //Assigning random room number
           int counter=0;  //a counter to count the number of rooms which are busy
      for (;;) 
      {
          int q=0;
            if (pdata.get(q).getwn()!=k)   //if the assigned room is not busy the stop the loop
            {
                  this.wn=k;  //after the loop if availble assign one else 0 will be assigned
              break;
            }
            else   //if the assigned room is bussy then assign another
            {
                q++;
                counter++; 
                if (counter==500)
                {
                  System.out.println("\nALL wars (Rooms) are Busy! , The Hospital Will Assign one when Available, Please wait...");  
                }
                else
                {
                  k=(int)(1+Math.random()*(500-200+1));   //assigning random room 
                }
            }
      }
           
    }
   
  System.out.println ("Ward Number: : "+wn);     
    System.out.println ("[ Case ]\nSimple Illness\n1. Headace\n2. Commoncold and flu\n3. Upset stomach\n4. other  ");
    int c3;
    for (;;)
    {
        if (e.mism()==true && e.PNval(e.val)==true)
        {
            c3=(int)e.val;
            break;
        }
    }
    if (c3==1)
    {
        System.out.println ("1. Headaches are one of most common and easily trated, health complaints. Most aren't serious\n and can be treated effectively using over-the counter medication/n Primmary- not caused by an underlying health problem  \n (e.g Tension headaces and Migraines\nSecondary- caused by illness, injurryor as a side-effect of medication\n  How to treat \nTrating. \n1.Advil (best)\n2. panadol\n3. Zoming ");
    this.case1="Headaches";
int input;
    for (;;)
    {
    System.out.println ("---\n[ 1 ]. To continue\n[ 2 ]. Abort Registeration  ");
    if (e.mism()==true && e.PNval(e.val)==true)
    {
      input=(int)e.val;
              break;
    }
    }
    int c1=0;
    int p;
         if (input==1)
    {
        System.out.println("Doctors Curently Available : "+ddata.size());
        System.out.println("General Doctors Available: Best For your case: ");
        if (ddata.isEmpty()==false)  //cheking whether the ddata or the doctor data conains record or not
        {
            System.out.println("Name");
        for (p=0;p<ddata.size();p++)
        {
         
        if (ddata.get(p).getds().contains("Gen") || ddata.get(p).getds().contains("General") || ddata.get(p).getds().contains("general") || ddata.get(p).getds().contains("GENERAL")|| ddata.get(p).getds().contains("gen"))     //give the patient a general doctor since it is simple illness
        {
            System.out.println (p+1+". Dr. "+ddata.get(p).getdf()+" "+ddata.get(p).getdln());
        }
        
        }
  
        for (;;)
        {
        System.out.println("Enter Number of Doc.");
           c1=b.nextInt();
           if (c1>0 && c1<=ddata.size())
           {
               System.out.println("Doctor Assigned: ");
               this.docname=ddata.get(c1-1).getdf(); 
               break;
           }
           System.out.println("\nINVALID INPUT! Plese Enter the Doctor Number From Given!");  
        }
        add mm=new add();
     mm.menu();
        }
        else
        {
            System.out.println("\n\n[ There are No Doctors Currently Availbbel! The Hospital will Add Later on! wait please... ]\n");
        this.docname="UNKNOWEN";
        }
    }
    else
    {
            pdata.remove(pdata.size()-1);
        m mm=new m();
       mm.menu();  
   
    }
    }
    else if (c3==2)
    {
         System.out.println ("Cold: A cold is a mild viral infection of the nose, throat, sinuses and upper airways. ic cuses: \n * a sore or irritated throat\n* a blocked or runny nose\n* coughing and sneezing\n Treatment \n 1. Drink Hot liquids\n2. Rest\n3. Stay hydrated");
    this.case1="Cold";
    int input;
    for (;;)
    {
    System.out.println ("---\n[ 1 ]. To continue\n[ 2 ]. Abort Registeration  ");
    if (e.mism()==true && e.PNval(e.val)==true)
    {
      input=(int)e.val;
              break;
    }
    }
  
    int c1=0;
    int p;
    boolean en;  //empty or not
    if (input==1)
    {
        en=ddata.isEmpty();
        System.out.println("Doctors Curently Available : "+ddata.size());
        System.out.println("General Doctors: Best For the Case: ");
        if (en==false)
        {
            System.out.println("Name");
        for (int j=0;j<ddata.size();j++)
        {
        if (ddata.get(j).getds().contains("Gen") || ddata.get(j).getds().contains("General") || ddata.get(j).getds().contains("general") || ddata.get(j).getds().contains("GENERAL") || ddata.get(j).getds().contains("gen"))     //give the patient a general doctor since it is simple illness
        {
            System.out.println (j+1+". Dr. "+ddata.get(j).getdf());
        }
        }
        for (;;)
        {
        System.out.println("Enter Number of Doc.");
           c1=b.nextInt();
           System.out.println("Ddata size is"+ddata.size());
           if (c1>0 && c1<=ddata.size())
           {
               System.out.println("Doctor Assigned: ");
               this.docname=ddata.get(c1-1).getdf(); 
               break;
           }
           System.out.println("\nINVALID INPUT! Plese Enter the Doctor Number From Given!");  
        }
        }
        else
        {
            System.out.println("\n[ There are No Doctors Currently Availbbel! The Hospital will Add Later on! wait please... ]\n");
           this.docname="UNKNOWEN";
        }
    }
    else
    {
              pdata.remove(pdata.size()-1);
        m mm=new m();
       mm.menu();   
    }
    
    }
    else if (c3==3)
    {
        System.out.println ("An upset stomac (Gastroenteritis) is common condtion where the stomac and intestines become inflamed.\n It usually caused by viral or bacterial infecion such as norovirus or food poisoining.\n Symptom : * nausea and vomiting\n* loss of appetite\n* stomac cramps\n Treatments: Natural remedys \n1. Ginger is common natural remedy for an upset stoach and indigestion.\n2. Lime or lemon juice\n3. cinnamon : conatins several antioxidant that may help ease digestion and reduce\n the risk of irritation and dammage in the digestive tract.");
    this.case1="upset stomac";
    int input;
    for (;;)
    {
    System.out.println ("---\n[ 1 ]. To continue\n[ 2 ]. Abort Registeration  ");
    if (e.mism()==true && e.PNval(e.val)==true)
    {
      input=(int)e.val;
              break;
    }
    }
    int c1=0;
    int p;
    if (input==1)
    {
        System.out.println("Doctors Curently Available : "+ddata.size());
           System.out.println("General Doctors: Best For the Case: ");
        if (ddata.isEmpty()==false)
        {
            System.out.println("Name");
        for (int g=0;g<ddata.size();g++)
        {
        if (ddata.get(g).getds().contains("Gen") || ddata.get(g).getds().contains("General") || ddata.get(g).getds().contains("general") || ddata.get(g).getds().contains("GENERAL") || ddata.get(g).getds().contains("gen") )    //give the patient a general doctor since it is simple illness
        {
            System.out.println (g+1+". Dr. "+ddata.get(g).getdf());
        }
        }
         for (;;)
        {
        System.out.println("Enter Number of Doc.");
           c1=b.nextInt();
           System.out.println("Ddata size is"+ddata.size());
           if (c1>0 && c1<=ddata.size())
           {
               System.out.println("Doctor Assigned: ");
               this.docname=ddata.get(c1-1).getdf(); 
               break;
           }
           System.out.println("\nINVALID INPUT! Plese Enter the Doctor Number From Given!");  
        }
        }
        else
        {
            System.out.println("There are No Doctors Currently Availbbel! The Hospital will Add Later on! wait please... ");
            this.docname="UNKNOWEN";
        }
    }
    else
    {
              pdata.remove(pdata.size()-1);
        m mm=new m();
       mm.menu();   
    }
    }
    else
    {
        int u;
        System.out.println ("Other.. case ");
   this.case1="Unknown";    
    if (ddata.isEmpty()==false)
    {
    System.out.println("Curently Available doctors");
    for (u=0;u<ddata.size();u++)
    {
        System.out.println(u+1+". [ Dr. ]"+ddata.get(u).getdf()+"  "+ddata.get(u).getdln()+"     [  Specialization: ]"+ddata.get(u).getds());
    }
     int c1=0;
   for (;;)
        {
        System.out.println("Enter Number of Doc.");
        for (;;)
        {
            if (e.mism()==true && e.PNval(e.val)==true)
            {
               c1=(int)e.val;
               break;
            }
        }
           if (c1>0 && c1<=ddata.size())
           {
               System.out.println("Doctor Assigned: ");
               this.docname=ddata.get(c1-1).getdf(); 
               break;
           }
           System.out.println("\nINVALID INPUT! Plese Enter the Doctor Number From Given!");  
        }
    this.docname=ddata.get(c1-1).getdf();
    }
    else
    {
        System.out.println("\n\tThere are No Doctors Currently Availbbel! The Hospital will Add Later on! wait please... ");
        this.docname="UNKNOWEN";
    }
    }
    m menu=new m();
    if (menu.p==0)
    {
    this.paying=200;  //amount of money required to create card  
  System.out.println ("paying amout: (fee)"+this.paying);
    }
    else
    {
        System.out.println("Not paying.");
        this.paying=0;  //amount of money required to create card  
  System.out.println ("paying amout: (fee)"+this.paying);
    }
  } 
       
        public String data () 
    {
   System.out.printf ("%-14s %-10s %-5s %-8s %-8s %-10s %-11s %-15s %-16s %-16s %-14s %-16s %-13s \n", getfn(),getln(),geta(),getg(),getht(),getwt(),getcase1(),getppn(),getstat(),gethn(),getemail(),getwn(),getpid());
return "";
    }
 }



 

