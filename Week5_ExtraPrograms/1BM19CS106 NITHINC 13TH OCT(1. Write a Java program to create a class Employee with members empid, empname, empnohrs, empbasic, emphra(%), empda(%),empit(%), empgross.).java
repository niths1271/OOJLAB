import java.util.Scanner;
class Employee
{
    Employee()
    {
        empgross=0.0;
    }
    int eid;
    String ename;
    int hrs;
    double ebasic;
    double emphra;
    double empda;
    double empit;
    double empgross;
    void get()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE ID OF EMPLOYEE");
        eid=s.nextInt();
        System.out.println("ENTER NAME OF EMPLOYEE");
        ename=s.next();
        System.out.println("ENTER THE NUMBER OF HOURS WORKED");
        hrs=s.nextInt();
        System.out.println("ENTER BASIC AMT OF EMPLOYEE");
        ebasic=s.nextDouble();
        System.out.println("ENTER THE PERCENTAGE OF HRA");
        emphra=s.nextDouble();
        System.out.println("ENTER THE PERCENTAGE OF DA");
        empda=s.nextDouble();
        System.out.println("ENTER THE PERCENTAGE OF IT");
        empgross=s.nextDouble();
    }
    double calculategross()
    {
        empgross=ebasic+ebasic*(emphra/100)+ebasic*(empda/100)-ebasic*(empit/100);
        return empgross;
    }
    double finalgross()
    {
        if(hrs>200)
            empgross=empgross+100*(hrs-200);
        else 
            empgross=empgross-100*(200-hrs);
            return empgross;
}
}
class employeemain
{
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF EMPLOYEES");
        int n=ss.nextInt();
        Employee emp[]=new Employee[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("ENTER THE DETAILS OF EMPLOYEE"+(i+1));
            emp[i]=new Employee();
            emp[i].get();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("THE INITIAL GROSS SALARY OF EMPLOYEE="+emp[i].calculategross());
            System.out.println("THE FINAL GROSS SALARY OF EMPLOYEE="+emp[i].finalgross());
    }
}
}
