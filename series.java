import java.util.Scanner;
class series
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the number n (rows)");
		int n=ss.nextInt();
		int count=1;
		int i,j;
		for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
	      System.out.print(count++);
		}
	System.out.print("\n");
}
	}
}
