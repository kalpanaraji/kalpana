import java.io.*;
import java.util.*;
class leap
{
    public static void main(String args[])
    {
        Scanner  sc=new Scanner(System.in);
        int year=sc.nextInt();
        boolean leap1=false;
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    leap1=true;
                }
                else
                {
                    leap1=false;
                }
                
            
            }
            else
            {
                leap1=true;
            }
        }
        else
        {
            leap1=false;
        }
        if(leap1==true)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}

