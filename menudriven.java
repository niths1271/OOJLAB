import java.util.Scanner;
class menu
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		int c;
		int i=0;
	double r,h;
	double area=0.0;
	double volume=0.0;
	final double pi=3.14;
	while(i!=4)
	{
		System.out.println("enter the height");
		h=ss.nextDouble();
		System.out.println("enter the radius");
		r=ss.nextDouble();
		System.out.println("select the shape");
		System.out.println("1-cylinder 2-cone 3-sphere 4-exit");
		System.out.println("enter the choice");
	    c=ss.nextInt();
		switch(c)
		{
			case 1:
			area=(2*r*h*pi)+(2*pi*Math.pow(r,2));
			volume=pi*Math.pow(r,2)*h;
			System.out.println("the area of cylinder is "+area);
			System.out.println("the volume of cylinder is "+volume);
		     break;
		     
			case 2:
             area=(r*r*pi)+(r*pi*Math.sqrt((Math.pow(h,2)+Math.pow(r,2))));
			volume=(pi*Math.pow(r,2)*h)/3;
			System.out.println("the area of cone is "+area);
			System.out.println("the volume of cone is "+volume);
		     break;
		     case 3:
			area=4*pi*Math.pow(r,2);
			volume=pi*Math.pow(r,2)*(4/3);
			System.out.println("the area of sphere is "+area);
			System.out.println("the volume of sphere is "+volume);
		     break;
		     case 4:
		     System.out.println("THANK YOU");
		 System.exit(0);
		     break;
		     default:
		     System.out.println("invalid option");
		}
	}
	}
}
