import java.util.Scanner;
class quad
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
			System.out.println("THE QUADRATIC EXPRESSION IS ax^2+bx+c");
		System.out.println("ENTER THE VALUE OF a");
		int a=s.nextInt();
		System.out.println("ENTER THE VALUE OF b");
		int b=s.nextInt();
		System.out.println("ENTER THE VALUE OF c");
		int c=s.nextInt();
		double d=Math.pow(b,2)-(4*a*c);
		int deno=2*a;
		double r1,r2;
		if(d>0)
		{
				System.out.println("THE ROOTS ARE REAL AND UNEQUAL");
				r1=(-b+Math.sqrt(d))/(deno);
		         r2=(-b-Math.sqrt(d))/(deno);
				 System.out.println("the roots are "+r1+"and"+r2);
		}
		else if(d==0)
		{
				System.out.println("THE ROOTS ARE REAL AND EQUAL");
				r1=(-b)/(deno);
				r2=(-b)/(deno);
				 System.out.println("the roots are "+r1+"and"+r2);
		}
		else
		{
			 System.out.println("THERE ARE NO REAL SOLUTIONS FOR THE EQUATION");
		}
	}
}
