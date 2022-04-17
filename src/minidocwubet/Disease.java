package minidocwubet;
public class Disease {
   public String name;
   public int symptom1=-1;
   public int symptom2=-1;
   public int symptom3=-1;
   public int symptom4=-1;
   public int symptom5=-1;
   public int symptom6=-1;
   public int symptom7=-1;
   public int symptom8=-1;
   public int symptom9=-1;
   public int symptom10=-1;
   public int symptom11=-1;
   public int symptom12=-1;
   public int symptom13=-1;
   public Disease(String name,int symptom1)
   {
   this.name=name;
   this.symptom1=symptom1; 
   }
   public Disease(String name,int symptom1,int symptom2)
   {
   this(name,symptom1);
   this.symptom2=symptom2; 
   }
   public Disease(String name,int symptom1,int symptom2,int symptom3)
   {
   this(name,symptom1,symptom2);
   this.symptom3=symptom3;
   }
   public Disease(String name,int symptom1,int symptom2,int symptom3,int symptom4)
   {
   this(name,symptom1,symptom2,symptom3);
   this.symptom4=symptom4;  
   }
public Disease(String name,int symptom1,int symptom2,int symptom3,int symptom4,int symptom5)
   {
   this(name,symptom1,symptom2,symptom3,symptom4);
   this.symptom5=symptom5;  
   }

public Disease(String name,int symptom1,int symptom2,int symptom3,int symptom4,int symptom5,int symptom6)
   {
   this(name,symptom1,symptom2,symptom3,symptom4,symptom5);
   this.symptom6=symptom6;  
   }

public Disease(String name,int symptom1,int symptom2,int symptom3,int symptom4,int symptom5,int symptom6,int symptom7)
   {
   this(name,symptom1,symptom2,symptom3,symptom4,symptom5,symptom6);
   this.symptom7=symptom7;  
   }

public Disease(String name,int symptom1,int symptom2,int symptom3,int symptom4,int symptom5,int symptom6,int symptom7,int symptom8)
   {
   this(name,symptom1,symptom2,symptom3,symptom4,symptom5,symptom6,symptom7);
   this.symptom8=symptom8;  
   }
public Disease(String name,int symptom1,int symptom2,int symptom3,int symptom4,int symptom5,int symptom6,int symptom7,int symptom8,int symptom9)
   {
   this(name,symptom1,symptom2,symptom3,symptom4,symptom5,symptom6,symptom7,symptom8);
   this.symptom9=symptom9;  
   }

public Disease(String name,int symptom1,int symptom2,int symptom3,int symptom4,int symptom5,int symptom6,int symptom7,int symptom8,int symptom9,int symptom10)
   {
   this(name,symptom1,symptom2,symptom3,symptom4,symptom5,symptom6,symptom7,symptom8,symptom9);
   this.symptom10=symptom10;  
   }
public Disease(String name,int symptom1,int symptom2,int symptom3,int symptom4,int symptom5,int symptom6,int symptom7,int symptom8,int symptom9,int symptom10,int symptom11)
   {
   this(name,symptom1,symptom2,symptom3,symptom4,symptom5,symptom6,symptom7,symptom8,symptom9,symptom10);
   this.symptom11=symptom11;  
   }
public Disease(String name,int symptom1,int symptom2,int symptom3,int symptom4,int symptom5,int symptom6,int symptom7,int symptom8,int symptom9,int symptom10,int symptom11,int symptom12)
   {
   this(name,symptom1,symptom2,symptom3,symptom4,symptom5,symptom6,symptom7,symptom8,symptom9,symptom10,symptom11);
   this.symptom12=symptom12;  
   }

public Disease(String name,int symptom1,int symptom2,int symptom3,int symptom4,int symptom5,int symptom6,int symptom7,int symptom8,int symptom9,int symptom10,int symptom11,int symptom12,int symptom13)
   {
   this(name,symptom1,symptom2,symptom3,symptom4,symptom5,symptom6,symptom7,symptom8,symptom9,symptom10,symptom11,symptom12);
   this.symptom13=symptom13;  
   }


 public static void show(Disease d)
{         System.out.println("Disease name :  "+d.name);
            System.out.println("Disease symptom1 :  "+d.symptom1);
            System.out.println("Disease symptom2 :  "+d.symptom2);
            System.out.println("Disease symptom3 :  "+d.symptom3);
            System.out.println("Disease symptom4 :  "+d.symptom4);
            System.out.println("Disease symptom5 :  "+d.symptom5);
}
 public static void findTheDisease(int ans,int d11,int d22,int d33,Disease d1,Disease d2,Disease d3)
 {
    if (ans==d11)
        {
            double persentage =(d11/4.0)*100;
           System.out.println("this result is accurate only by "+persentage+"%");
            show(d1);
        }
         if (ans==d22)
        {
            double persentage =(d22/2.0)*100;
            System.out.println("this result is accurate only by "+persentage+"%");
            show(d2);
        }
          if (ans==d33)
        {
            double persentage =(d33/3.0)*100;
            System.out.println("this result is accurate only by "+persentage+"%\n the symptoms are:\n");
            show(d3);
        } 
 }
}