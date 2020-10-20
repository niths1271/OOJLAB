import java.util.Scanner;
class Actor
{
    String name;
    int id;
     int mov;
     int yr;
     void accept()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME");
        name=s.next();      
        System.out.println("ENTER THE ACTORID");
        id=s.nextInt();
        System.out.println("ENTER THE NUMBER OF MOVIES ACTED");
        mov=s.nextInt();
        System.out.println("ENTER THE NUMBER OF YEARS WORKED");
        yr=s.nextInt();
    }
    double calc()
    {
        double avg=(mov/(yr+0.0));
        return avg;
    }
    String nam()
    {
        return name;
    }
}
class actormain
{
    public static void main(String args[])
    {
        String na=" ";
        Scanner ss=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ACTORS");
        int n=ss.nextInt();
        Actor a[]=new Actor[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("ENTER THE DETAILS OF ACTOR"+(i+1));
            a[i]=new Actor();
            a[i].accept();
        }
        double max=a[0].calc();
        for(int i=0;i<n;i++)
        {
            if((a[i].calc()) > max)
            {
            max=a[i].calc();
            na=a[i].nam();
            }
        }
        System.out.println("THE HIGHEST AVERAGE IS"+max);
        System.out.println("THE ACTOR'S NAME WITH HIGHEST AVERAGE IS"+na);
    }
}

