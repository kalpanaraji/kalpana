import java.io.*;
import java.util.*;
class hello1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        if(k==0)
        {
            System.out.print(" ");
            
        }
        else
        {
          for(int i=1;i<=k;i++)
           {
            System.out.println("Hello");
           }
        }
    }

}

