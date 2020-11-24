import java.util.Scanner;

 class Insufficient extends Exception {

    double amount;
    Insufficient(double amount) {
      this.amount = amount;
   }
   
   public String toString() {
    return "INSSUFFICIENT BALANCE. YOUR ACCOUNT BALANCE="+amount;
}
}

class ACCOUNT{
    Scanner s=new Scanner(System.in);
    double balance;
    int amt;
    long acc;
    ACCOUNT(double balance,long acc)
        {
          this.balance=balance;
          this.acc=acc;
        }
     double withdraw() throws Insufficient
     {
         System.out.println("ENTER THE AMOUNT TO BE WITHDRAWED");
         amt=s.nextInt();
         if(balance>=amt)
         {
             balance=balance-amt;
             return balance;
         }
         else
         throw new Insufficient(balance);
     }

   void display(){
    System.out.println("ACCOUNT BALANCE="+balance);
}
    }

    class accmain{
        public static void main(String args[])
        {
            Scanner s=new Scanner(System.in);
          System.out.println("ENTER THE INITIAL BALANCE");
         double b=s.nextDouble();
         System.out.println("ENTER THE ACCOUNT NUMBER");
         long l=s.nextLong();
         ACCOUNT acc= new ACCOUNT(b,l);
         int i=0;
         while(i !=3)
         {
         System.out.println("1-WITHDRAWAL 2-DISPLAY BALANCE 3-EXIT");
         System.out.println("ENTER THE CHOICE");
         int c=s.nextInt();
         switch(c)
         {
             case 1:
             try{
                 acc.withdraw();
             }catch(Insufficient e)
             {
                 System.out.println(e);
             }
             break;
             case 2:
             acc.display();
             break;
             case 3:
             System.exit(0);
             break;
             default:
             System.out.println("INVALID CHOICE");
         }
        }
    }
    }
    
