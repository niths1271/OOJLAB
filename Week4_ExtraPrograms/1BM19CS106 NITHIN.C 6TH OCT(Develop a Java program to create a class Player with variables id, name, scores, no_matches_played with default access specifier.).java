import java.util.Scanner;
class Player
{
     int id;
     String name;
     int[] scores;
     int n;
     Player()
     {
      id=0;
      n=0;
     }
   Player(int id1,String name1,int n1,int[] scores1)
    {
      id=id1;
      name=name1;
      n=n1;
     scores=scores1;    
    }
    void getdetails()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER NAME OF PLAYER");
        name=s.next();
        System.out.println("ENTER THE ID OF PLAYER");
        id=s.nextInt();
        System.out.println("ENTER THE NUMBER OF MATCHES PLAYED BY THE PLAYER");
        n=s.nextInt();
       scores=new int[n];
       for(int i =0;i<n;i++)
       {
        System.out.println("ENTER THE SCORE OF THE PLAYER IN MATCH"+(i+1));
           scores[i]=s.nextInt();
       }  
    }
    void printdetails()
    {
        System.out.println("THE ID OF PLAYER IS="+id);
        System.out.println("THE NAME OF PLAYER  IS "+name);
        System.out.println("THE NUMBER OF MATCHES PLAYED IS"+n);
        for(int i=0;i<n;i++)
       {
        System.out.println(" THE SCORE IN  MATCH"+(i+1)+"="+scores[i]);
       }
    }
    double check()
    {
        int t=0;
        for(int i=0;i<n;i++)
       {
           t=t+scores[i];
    }
     double avg=(t/(n+0.0));
       return avg;
}
}
class playermain
{
    public static void main(String args[])
    {
      int[] array={2,3,4};
      Player p2=new Player(12,"ronaldo",3,array);/*paranthesized constructor*/
      Player p1=new Player();
      p1.getdetails();
      System.out.println("THE DETAILS OF PLAYER WITH GREATER AVERAGE IS");
      if(p1.check()>p2.check())
      {
      p1.printdetails();
      System.out.println("THE AVERAGE OF PLAYER 1="+p1.check());
      }
      else if(p1.check()==p2.check())
      {
      p1.printdetails();
      System.out.println("THE AVERAGE OF PLAYER 1="+p1.check());
      p2.printdetails();
      System.out.println("THE AVERAGE OF PLAYER 2="+p2.check());
      }
      else
    {
      p2.printdetails();
      System.out.println("THE AVERAGE OF PLAYER 2="+p2.check());                    
    }
}
}
