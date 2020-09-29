import java.util.Scanner;
class bill
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of different item purchased");
		int n=s.nextInt();
		int[] item;
		double[] rate;
		item=new int[n];
		rate= new double[n];
		double total=0.0;
		double disc=0.0;
		double finalamt=0.0;
		for(int i=1;i<n;i++)
		{
			System.out.println("Enter the number of  item"+i+" purchased");
			item[i]=s.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			System.out.println("Enter the price of  item"+i+" purchased");
			rate[i]=s.nextDouble();
		}
		for(int i=1;i<n;i++)
		{
			total=total+(item[i]*rate[i]);
		}
		if(total>=10000)
		{
			disc=(0.05*total);
			finalamt=total-disc;
		}
		else if(total>=7500 && total <10000)
		{
			disc=(0.03*total);
			finalamt=total-disc;
		}
	else if(total>=5000 && total <7500)
		{
			disc=(0.02*total);
			finalamt=total-disc;
		}
		else
		{
			disc=0.0;
			finalamt=total;
		}
		System.out.println("THE TOTAL BILL IS ="+total);
		System.out.println("THE DISCOUNT IS ="+disc);
		System.out.println("THE FINAL BILL IS ="+finalamt);
	}
}
