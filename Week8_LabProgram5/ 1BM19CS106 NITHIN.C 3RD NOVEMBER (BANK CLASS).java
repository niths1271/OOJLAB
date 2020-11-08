import java.util.Scanner;
 abstract class Account
{
    Scanner s=new Scanner(System.in);
    String name;
    long num;
    String type;
    double bal;
    Account(){}
Account(String name,long num,String type,double bal)
{
    this.name=name;
    this.num=num;
    this.type=type;
    this.bal=bal;
}
String acc()
{
    return type;
}
double min=2000.00;
abstract void deposit();
abstract void withdrawal();
abstract void display();
}
class Curact extends Account
{
    Curact(String name,long num,String type,double bal)
    {
        super( name ,num, type, bal);
    }
    void withdrawal()
{
    System.out.println("ENTER THE AMOUNT TO BE WITHDRAWED");
    int amt=s.nextInt();
    if(bal==0 || amt>bal )
    {
        System.out.println("WITHDRAWAL NOT POSSIBLE");
    }
    else
    {
        bal=bal-amt;
        System.out.println("AMOUNT OF"+amt+"IS WITHDRAWED FROM THE ACCOUNT");
        System.out.println("REMAINING BALANCE IS="+bal);
    }
}
    void deposit()
    {
        System.out.println("ENTER THE AMOUNT TO BE DEPOSITED");
        int amt1=s.nextInt();
        bal=bal+amt1;
        System.out.println("THE REMAINING BALANCE OF THE ACOOUNT= "+bal);
    }
    void display()
    {
        if (bal<min)
        {
            System.out.println("AMOUNT OF 145/- IS DEDUCTED FROM UR ACCOUNT DUE TO LESS BALANCE");
            bal=bal-145;
            System.out.println("BALANCE="+bal);
        }
        else
            System.out.println("BALANCE="+bal);
    }
}
class Savact extends Account
{
   Savact (String name,long num,String type,double bal)
    {
        super( name ,num, type, bal);
    }
    void withdrawal()
    {
    System.out.println("ENTER THE AMOUNT TO BE WITHDRAWED");
    int amt=s.nextInt();
    if(bal==0 || amt>bal)
    {
        System.out.println("WITHDRAWAL NOT POSSIBLE");
    }
    else
    {
        bal=bal-amt;
        System.out.println("AMOUNT OF"+amt+"IS WITHDRAWED FROM THE ACCOUNT");
        System.out.println("REMAINING BALANCE IS="+bal);
    }
}
    void deposit()
    {
        System.out.println("ENTER THE AMOUNT TO BE DEPOSITED");
        int amt1=s.nextInt();
        System.out.println("THE RATE OF INTEREST IS 5%");
        double ci=amt1*(1+0.05);
        bal=bal+ci;
        System.out.println("THE BALANCE OF THE ACCOUNT= "+bal);
    }
    void display()
    {
            System.out.println("BALANCE="+bal);
    }
}
 
class bank
{
    public static void main(String args[])
    {  
    Scanner s=new Scanner(System.in);
    System.out.println("1-CURRENT ACCOUNT \n 2-SAVINGS ACCOUNT");
     int c=s.nextInt();
     String nam;
     long n;
     double openbal;
     if(c==1)
    {      
  System.out.println("ENTER NAME,ACCOUNT NUMBER AND OPENING BALANCE");
      nam=s.next();
      n=s.nextLong();
     openbal=s.nextDouble();
     System.out.println("ACCOUNT DETAILS \n ********");
     System.out.println("NAME-"+ nam +" ACC NUMBER-"+n +"OPENING BALANCE-"+openbal+"TYPE-Current");
     Curact cu=new Curact(nam,n,"current",openbal);
        int i=0;
        while( i != 4) 
        {
            System.out.println("1:DEPOSIT \n2:DISPLAY BALANCE\n 3:WITHDRAWAL \n 4-exit");
            System.out.println("ENTER THE CHOICE");
            int ch = s.nextInt();
            switch (ch) {
                case 1:
                    cu.deposit();
                    break;

                case 2:
                    cu.display();
                    break;

                case 3:
                    cu.withdrawal();
                    break;
                    case 4:
                     System.exit(0);
                     break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }
    }
    else if(c==2){
        System.out.println("ENTER NAME,ACCOUNT NUMBER AND OPENING BALANCE");
      nam=s.next();
      n=s.nextLong();
     openbal=s.nextDouble();
     System.out.println("ACCOUNT DETAILS \n ********");
     System.out.println("NAME-"+ nam +" ACC NUMBER-"+n +"OPENING BALANCE-"+openbal+"TYPE-Savings");
     Savact sa=new Savact(nam,n,"savings",openbal);
        int j=0;
        while( j != 4) 
        {
            System.out.println("1:DEPOSIT \n2:DISPLAY BALANCE\n 3:WITHDRAWAL\n 4-exit");
            System.out.println("ENTER THE CHOICE");
            int ch1 = s.nextInt();
            switch (ch1) {
                case 1:
                    sa.deposit();
                    break;

                case 2:
                    sa.display();
                    break;

                case 3:
                    sa.withdrawal();
                    break;
                    case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }
    }
    else
    {
        System.out.println("INVALID CHOICE");
    }
}
}

