import java.util.Scanner;
class Age
{
    int yr;
    int m;
    void get()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF YEARS");
        yr=s.nextInt();
        System.out.println("ENTER THE NUMBER OF MONTHS(ALWAYS LESS THAN TWELVE)");
        m=s.nextInt();
    }
    String calc(Age a){
        int t = yr*12+m;
        int t1 = a.yr*12 +a.m;
        if(t>t1)
            return "PERSON1 IS OLDER THAN PERSON2 ";
        else if(t==t1)
            return "PERSON1 AND PERSON2 ARE OF SAME AGE";
        else
           return "PERSON2 IS OLDER THAN PERSON1"; 
}
}
class agemain
{
    public static void main(String args[])
    {
        Age a1=new Age();
        Age a2=new Age();
        System.out.println("ENTER THE  AGE OF THE PERSON1");
        a1.get();
        System.out.println("ENTER THE  AGE OF THE PERSON2");
        a2.get();
        System.out.println(a1.calc(a2));
}
}
