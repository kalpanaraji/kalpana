import java.io.*;
import java.util.*;
class vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String  c=sc.next();
        if(Character.isLetter(c.charAt(0)))
        {
        if(c.contains("a")||c.contains("e")||c.contains("i")||c.contains("o")||c.contains("u"))
        {
            System.out.print("vowel");
        }
        else
        {
            System.out.print("consonant");
        }
        }
        else
        {
            System.out.print("Invalid");
        }
    }
}

