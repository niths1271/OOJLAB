import java.util.Scanner;
abstract class Shape {
 double a;
 double b;
 Shape(double a, double b)
{
 this.a = a;
 this.b = b;
 }
 abstract double area();
}

class Rectangle extends Shape
 {
 Rectangle(double a, double b) 
 {
 super(a, b);
 }
 double area() 
 {
 System.out.println("Area of Rectangle.");
 return a*b;
 }
}
class Triangle extends Shape {
 Triangle(double a, double b) {
 super(a, b);
 }
 double area() {
 System.out.println(" Area of Triangle.");
 return (a*b)/ 2;
 }
}

class Circle extends Shape {
    final double pi=3.14;
    Circle(double a,double b) {
    super(a, b);
    }
    double area() {
    System.out.println(" Area of  Circle.");
    return pi*Math.pow(a,2);
    }
}
class shapemain
{
 public static void main (String args[])
  {
      Scanner s=new Scanner(System.in);
      System.out.println("ENTER LENGTH AND BREADTH OF RECTANGLE");
      double l=s.nextDouble();
      double b=s.nextDouble();
 Rectangle rec = new Rectangle(l,b);
 System.out.println("ENTER HEIGTH AND BASE LENGTH OF TRIANGLE");
 double h=s.nextDouble();
 double ba=s.nextDouble();
 Triangle tri = new Triangle(h,ba);
 System.out.println("ENTER RADIUS OF CIRCLE");
 double r=s.nextDouble();
 Circle c=new Circle(r,2*r);
 Shape sh; 
 sh=rec;
 System.out.println( sh.area());
 sh=tri;
 System.out.println( sh.area());
 sh=c;
 System.out.println( sh.area());
}
}



