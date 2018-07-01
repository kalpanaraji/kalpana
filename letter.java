import java.io.*;
import java.util.*;
class letter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String  d=sc.next();
        if(Character.isLetter(d.charAt(0)))
        {
          System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}

