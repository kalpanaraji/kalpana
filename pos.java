import java.io.*;
import java.util.*;
class pos
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.print("positive number");
        }
        else if(n==0)
        {
            System.out.print("zero");
        }
        else
        {
            System.out.print("negative number");
        }
        
    }
}
