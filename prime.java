import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER N GREATER THAN M");
		System.out.println("enter the number n ");
		int n=ss.nextInt();
		System.out.println("enter the number n ");
		int m=ss.nextInt();
		int i,j;
		int c=0;
		System.out.println("the prime numbers of");
		for(i=n;i<=m;i++)
	{
		for(j=2;j<=(i/2);j++)
		{
			if(i%j==0)
			{
			 c++;
			}
		}
			if(c < 1)
			System.out.println(i);
			c=0;
		}
		}
		}