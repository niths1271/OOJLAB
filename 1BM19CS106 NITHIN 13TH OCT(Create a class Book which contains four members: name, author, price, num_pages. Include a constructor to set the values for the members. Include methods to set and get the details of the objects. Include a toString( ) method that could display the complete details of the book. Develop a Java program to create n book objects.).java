import java.util.Scanner;
class Book
{
    private String name;
    private String auth;
    private double p;
    private int np;
    Book()
    {
        name=null;
        auth=null;
         p=0.0;
         np=0;
    }
    void getdetails()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE TITLE OF BOOK");
        name=s.next();      
        System.out.println("ENTER AUTHOR OF BOOK");
        auth=s.next();
        System.out.println("ENTER PRICE OF BOOK");
        p=s.nextDouble();
        System.out.println("ENTER NUMBER OF PAGES OF BOOK");
        np=s.nextInt();
    }
     public String toString()
    {
        return("THE TITLE OF BOOK:"+name+"   "+"AUTHOR OF BOOK:"+auth+"   "+" PRICE OF BOOK: "+p+"    "+" NUMBER OF PAGES OF BOOK:"+np);
}
}
class Bookmain
{
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF BOOKS");
        int n=ss.nextInt();
        Book b[]=new Book[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("ENTER THE DETAILS OF BOOK"+(i+1));
            b[i]=new Book();
            b[i].getdetails();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("THE DETAILS OF BOOK"+(i+1));
            System.out.println(b[i]);         /*SOP(b[i].toString()) will also work*/ 
        }
}
}





