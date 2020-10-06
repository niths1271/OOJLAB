import java.util.Scanner;
class Student
{
    private String usn;
    private String name;
    private int[] credit;
    private int[]marks;
    void getdetails()
    {
        System.out.println("ENTER THE DETAILS OF THE STUDENTS");
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER NAME OF STUDENT");
        name=s.next();
        System.out.println("ENTER THE USN OF STUDENT");
        usn=s.next();
       credit=new int[4];
       marks=new int[4];
       for(int i =0;i<4;i++)
       {
        System.out.println("ENTER THE CREDIT OF  SUBJECT"+(i+1));
           credit[i]=s.nextInt();
       }  
       for(int i =0;i<4;i++)
       {
        System.out.println("ENTER THE MARK OF  SUBJECT"+(i+1));
           marks[i]=s.nextInt();
       }  
    }
    void printdetails()
    {
        System.out.println("THE USN OF STUDENT IS="+usn);
        System.out.println("THE NAME OF STUDENT IS "+name);
        for(int i =0;i<4;i++)
       {
        System.out.println(" THE MARK OF  SUBJECT"+(i+1)+"="+marks[i]);
       }
       for(int i =0;i<4;i++)
       {
        System.out.println(" THE CREDITS OF  SUBJECT"+(i+1)+"="+credit[i]);     
       }    
    }
    void calculate()
    {
        int[] total=new int[4];
        double tc=0.0;
        double t=0.0;
        double sgpa=0.0;
        for(int i=0;i<4;i++)
        {
            if(marks[i]>=85 && marks[i]<=100)
               total[i]=credit[i]*10;
               else if(marks[i]>=70 && marks[i]<85)
               total[i]=credit[i]*9;
               else if(marks[i]>=60 && marks[i]<70)
               total[i]=credit[i]*8;
               else if(marks[i]>=50 && marks[i]<60)
               total[i]=credit[i]*7;
               else
                total[i] =credit[i]*6;
        }
        for(int i=0;i<4;i++)
        {
            tc=tc+credit[i];
        }
        for(int i=0;i<4;i++)
        {
            t=t+total[i];
        }
        sgpa=(t/(tc+0.0));
        System.out.println("THE SGPA OF STUDENT IS="+sgpa);
    }
}
class studentmain
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.getdetails();
        s1.printdetails();
        s1.calculate();
    }
}


     

    


