import java.io.*;
import java.util.*;
class check
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String  c=sc.next();
        if(Character.isLetter(c.charAt(0)))
        {
          System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}

