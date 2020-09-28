import java.util.Scanner;
class scannerprogram
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter integer,string,float,double,character,character");
		int x=ss.nextInt();
		String s=ss.next();
		float f=ss.nextFloat();
		double d=ss.nextDouble();
		char c=s.charAt(0);
		char c1=ss.next().charAt(0);
		System.out.println("x:"+x);
		System.out.println("s:"+s);
		System.out.println("f:"+f);
		System.out.println("d:"+d);
		System.out.println("c:"+x);
		System.out.println("c1:"+x);
		System.out.println("the sum of different data types="+(x+f+d));
	}
}
