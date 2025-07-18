import java.io.*;
import java.util.*;

public class Code {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.length()==s2.length())
        {
            System.out.println("No Missing Character");
            return;
        }
        int sum1=0;
        int sum2=0;
        for(int i=0;i<s1.length();i++)
        {
            sum1=sum1+(int)s1.charAt(i);
        }
         for(int i=0;i<s2.length();i++)
        {
            sum2=sum2+(int)s2.charAt(i);
        }
        int dif=sum1-sum2;
        char r=(char)dif;
        System.out.println(r);
    }
}