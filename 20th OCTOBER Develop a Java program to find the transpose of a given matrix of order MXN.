import java.util.Scanner;
class trans{
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS");
         int m=s.nextInt();
         System.out.println("ENTER THE NUMBER OF COLUMNS");
         int n=s.nextInt();        
        int a[][]= new int[m][n];
        int i,j;
        System.out.println("ENTER THE ITEMS OF THE ARRAY ");
        for(i=0;i<m;i++)
        {
                for(j=0;j<n;j++)
                a[i][j]=s.nextInt();
        }
        System.out.println("THE ITEMS OF THE ARRAY BEFORE TRANSPOSE");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        int t[][]=new int[n][m];
        for(i=0;i<m;i++)
        {
                for(j=0;j<n;j++)
                t[j][i]=a[i][j];
        }
        System.out.println("THE ITEMS OF THE ARRAY AFTER TRANSPOSE");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(t[i][j]+"  ");
            }
            System.out.println();
        }
    }

}
