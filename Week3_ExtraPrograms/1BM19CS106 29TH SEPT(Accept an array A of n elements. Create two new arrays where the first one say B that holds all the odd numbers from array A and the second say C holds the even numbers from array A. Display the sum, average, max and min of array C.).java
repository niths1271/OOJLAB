import java.util.Scanner;
class dis
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=s.nextInt();
		int[] arr;
		int[] even;
		int[] odd;
		int e=0;
		int o=0;
		int total=0;
		arr=new int[n];
		even=new int[n];
		odd=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
			for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
			even[e]=arr[i];
			e++;
			}
			else
			{
			  odd[o]=arr[i];
			o++;
			}
		}
		System.out.println("THE EVEN ARRAY IS");
		for(int i=0;i<e;i++)
		{
			System.out.println(even[i]);
			total=total+even[i];
			
		}
		System.out.println("THE ODD ARRAY IS");
		for(int i=0;i<o;i++)
		{
			System.out.println(odd[i]);
		}
		int min=even[0];
		int max=even[e];
		for(int i=0;i<e;i++)
		{
			if(even[i]<min)
			min=even[i];
		}
		for(int i=0;i<e;i++)
		{
			if(even[i]>min)
			max=even[i];
		}
		double avg=total/e;
		System.out.println("the maximum is="+max);
		System.out.println("the minimum is="+min);
		System.out.println("the total is="+total);
		System.out.println("the average is="+avg);
	}
}
