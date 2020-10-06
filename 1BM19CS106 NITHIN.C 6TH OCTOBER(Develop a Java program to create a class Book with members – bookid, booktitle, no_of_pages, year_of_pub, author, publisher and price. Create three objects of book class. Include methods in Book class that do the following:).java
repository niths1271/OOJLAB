import java.util.Scanner;
class Book
{
    private int id;
    private String title;
    private int np;
    private int yr;
    private String auth;
    private String pub;
    private double p;
    void getdetails()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER ID OF BOOK");
        id=s.nextInt();
        System.out.println("ENTER THE TITLE OF BOOK");
        title=s.next();
        System.out.println("ENTER NUMBER OF PAGES OF BOOK");
        np=s.nextInt();
        System.out.println("ENTER YEAR OF PUBLISHING OF THE BOOK");
        yr=s.nextInt();
        System.out.println("ENTER AUTHOR OF BOOK");
        auth=s.next();
        System.out.println("ENTER PUBLISHER OF BOOK");
        pub=s.next();
        System.out.println("ENTER PRICE OF BOOK");
        p=s.nextDouble();
    }
    void printdetails()
    {
        System.out.print(" ID OF BOOK: "+id);
        System.out.println("  THE TITLE OF BOOK: "+title);
        System.out.print(" NUMBER OF PAGES OF BOOK: "+np);
        System.out.println("   YEAR OF PUBLISHING OF THE BOOK: "+yr);
        System.out.print(" AUTHOR OF BOOK: "+auth);
        System.out.println("    PUBLISHER OF BOOK: "+pub);
        System.out.println(" PRICE OF BOOK: "+p);
    }
    double price()
    {
        return p;
    }
    void displaybooktitle()
    {
        System.out.println(title);
    }
    int year()
    {    
        return yr;
    }
    int pages()
    {
        return np;
    }
    String author()
{  
   return auth;
}
}
class bookmain
{
    public static void main(String args[])
    {
        int c=0;
        Book b1=new Book();
        Book b2=new Book();
        Book b3=new Book();
        b1.getdetails();
        b2.getdetails();
        b3.getdetails();
        System.out.println("ENTER THE DETAILS OF THE BOOK1");
        b1.printdetails();
        System.out.println("ENTER THE DETAILS OF THE BOOK2");
        b2.printdetails();
        System.out.println("ENTER THE DETAILS OF THE BOOK3");
        b3.printdetails();
        if(b1.price()>=b2.price() && b1.price()>=b3.price())
        {
        System.out.print("THE MOST EXPENSIVE BOOK IS WITH TITLE:  ");
        b1.displaybooktitle();
        }
        else if(b2.price()>=b1.price() && b2.price()>=b3.price())
        {
        System.out.print("THE MOST EXPENSIVE BOOK IS WITH TITLE:  ");
        b2.displaybooktitle();            
        }
        else 
        {
        System.out.print("THE MOST EXPENSIVE BOOK IS WITH TITLE:  ");
        b3.displaybooktitle(); 
        }
        if(b1.year()==2020)
        c++;
        if(b2.year()==2020)
        c++;
        if(b3.year()==2020)
        c++;    
        System.out.println("THE NUMBER OF BOOKS PUBLISHED IN THE YEAR 2020 = "+c);
        if(b1.pages()<=b2.price() && b1.price()<=b3.price())
       {
        System.out.println("THE  BOOK  WITH LEAST NUMBER OF PAGES IS BOOK 1 ");
        b1.printdetails();
        }
        else if(b2.pages()<=b1.pages() && b2.pages()<=b3.pages())
        {
        System.out.println("THE  BOOK  WITH LEAST NUMBER OF PAGES IS BOOK 2 ");
        b2.printdetails();            
        }
        else 
        {
            System.out.println("THE  BOOK  WITH LEAST NUMBER OF PAGES IS BOOK 3 ");
            b3.printdetails();
        }
    System.out.println("ENTER THE AUTHOR NAME WHOSE BOOK DETAILS NEED TO BE DISPLAYED");
    Scanner s1=new Scanner(System.in);
    String auth1=s1.next();
    if(auth1.compareToIgnoreCase(b1.author())==0)
    b1.printdetails();
   else if(auth1.compareToIgnoreCase(b2.author())==0)
    b1.printdetails();
   else if(auth1.compareToIgnoreCase(b3.author())==0)
    b1.printdetails();
    else
      System.out.println("THE GIVEN AUTHOR'S BOOK IS NOT FOUND");
}
}


    
