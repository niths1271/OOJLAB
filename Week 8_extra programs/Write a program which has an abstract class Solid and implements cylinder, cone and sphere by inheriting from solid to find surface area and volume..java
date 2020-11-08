import java.util.Scanner;
abstract class Solid
{
double d1,d2,d3;
Solid()
{
}
abstract void surface_area();
abstract void volume();
}
class Cylinder extends Solid
{
Cylinder(double a,double b)
{
d1=a;
d2=b;
}
void surface_area()
{
System.out.println("Surface Area OF CYLINDER is:"+((2*3.14*d1*d1)+(2*3.14*d1*d2)));
}
void volume()
{
System.out.println("Volume OF CYLINDER is:"+(3.14*d1*d1*d2));
}
}
class Cone extends Solid
{
Cone(double a,double b,double c)
{
d1=a;
d2=b;
d3=c;
}
void surface_area()
{
System.out.println("Surface Area OF CONE is:"+((3.14*d1*d1)+(3.14*d1*d2)));
}
void volume()
{
System.out.println("Volume OF CONE is:"+((3.14*d1*d1*d3)/3.0));
}

}
class Sphere extends Solid
{
Sphere(double a)
{
d1=a;
}
void surface_area()
{
System.out.println("Surface Area OF SPHERE is:"+(4*3.14*d1*d1));
}
void volume()
{
System.out.println("Volume OF SPHERE is:"+((4*3.14*d1*d1*d1)/3));
}
}
class Solid_test
{
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
      System.out.println("ENTER THE HEIGTH AND RADIUS OF CYLINDER");
      double d1=s.nextDouble();
      double d2=s.nextDouble();
Cylinder c=new Cylinder(d1,d2);
System.out.println("ENTER THE THREE DIMENSIONS OF CONE");
double a=s.nextDouble();
double b=s.nextDouble();
double d=s.nextDouble();
Cone c1=new Cone(a,b,d);
System.out.println("ENTER THE RADIUS OF SPHERE");
double r=s.nextDouble();
Sphere s1=new Sphere(r);
Solid so;
so=c;
so.surface_area();
so.volume();
so=c1;
so.surface_area();
so.volume();
so=s1;
so.surface_area();
so.volume();
}
}
