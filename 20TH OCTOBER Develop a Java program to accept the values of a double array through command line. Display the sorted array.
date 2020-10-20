class sort
{
    public static void main(String xx[])
    {
        int l=xx.length;
        int i,j;
        double temp;
        double a[]=new double[l];
        for(i=0;i<l;i++)
        {
           a[i]=Double.parseDouble(xx[i]);
        }
        System.out.println("THE ITEMS OF THE ARRAY IS");
        for(i=0;i<l;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(i=0;i<l-1;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(a[i]>a[j])
                {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
                }
            }
        }
        System.out.println("THE ITEMS OF THE ARRAY AFTER SORTING IS");
        for(i=0;i<l;i++)
        {
            System.out.print(a[i]+" ");
        }
}
}
