import java.util.Scanner;
class grade
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number of subjects");
		int n=ss.nextInt();
		int[] cie;
         int[] see;
          int[] sub;
          int to=0;
		  int i,j;
		  System.out.println("enter the cie marks");
		  cie=new int[n];
		    see=new int[n];
			  sub=new int[n];
		  for(i=0;i<n;i++)
		  {
			  cie[i]=ss.nextInt();
		  }
		  System.out.println("enter the see marks");
		  for(i=0;i<n;i++)
		  {
			  see[i]=ss.nextInt();
		  }
		   System.out.println(" the total marks of subjects");
for(i=0;i<n;i++)
{
	sub[i]=cie[i]+see[i];
	 System.out.println(sub[i]);
}
for(i=0;i<n;i++)
{
	to=to+sub[i];
}
for(i=0;i<n;i++)
{
if(sub[i] >=90)
	System.out.println("a grade in subject"+(i+1));
	else if (sub[i]<90 && sub[i]>=75)
		System.out.println("b grade in subject"+(i+1));
		else if (sub[i]<75 && sub[i]>=60)
			System.out.println("c grade in subject"+(i+1));
			else if (sub[i]<60 && sub[i]>=50)
			System.out.println("d grade in subject"+(i+1));
			else 
				System.out.println("f grade in subject "+(i+1));
			}
			System.out.println("the total marks is="+to);
	}
}
