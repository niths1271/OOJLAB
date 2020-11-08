import java.util.Scanner;
class circle
{
   static double a;
   static double peri;
    static double r;
    static final double pi=3.14;
   static void accept()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE RADIUS");
        r=s.nextDouble();
    }
    static void calculate()
    {
        a=pi*Math.pow(r,2);
        peri=2*pi*r;
    }
    static void display()
        {
            System.out.println("THE AREA IS="+a);
            System.out.println("THE PERIMETER IS="+peri);
        }
        public static void main(String args[])
        {
            accept();
            calculate();
            display();
        }
}
