import java.io.*;
import java.util.*;
class nknum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n=sc.nextInt();
        int sum=0;
        int a[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            sum=sum+a[j];
        }
        System.out.print(sum);
        
        
    }
}
