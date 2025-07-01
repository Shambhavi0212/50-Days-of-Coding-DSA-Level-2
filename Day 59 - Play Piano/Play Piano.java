/*
Play Piano

Two sisters, A and B, play the piano every day. 
During the day, they can play in any order. 
That is, A might play first and then B, or it could be B first and then A. 
But each one of them plays the piano exactly once per day. 
They maintain a common log, in which they write their name whenever they play.

You are given the entries of the log, but you're not sure if it has been tampered with or not. 
Your task is to figure out whether these entries could be valid or not.

Input
The first line of the input contains an integer 
T 
denoting the number of test cases. The description of the test cases follows.
The first line of each test case contains a string 
s 
denoting the entries of the log.

Output
For each test case, output yes or no according to the answer to the problem.

Constraints
1 ≤ T ≤ 500
2 ≤ |s| ≤ 100
|s| is even
Each character of 
s 
is either 'A' or 'B'

Sample 1:

Input
4
AB
ABBA
ABAABB
AA

Output
yes
yes
no
no

Explanation:
Testcase 1: There is only one day, and both A and B have played exactly once. So this is a valid log. Hence 'yes'.

Testcase 2: On the first day, A has played before B, and on the second day, B has played first. Hence, this is also a valid log.

Testcase 3: On the first day, A played before B, but on the second day, A seems to have played twice. This cannot happen, and hence this is 'no'.

Testcase 4: Both plays were by A, so this is invalid. Hence 'no'.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{ String ans="yes";
		    String s=sc.next();
		    for(int i=0;i<s.length()-1;i+=2)
		    {
		        if(s.charAt(i)==s.charAt(i+1))
		        {
		            ans="no";
		        }
		    }
		     System.out.println(new String(ans));
		}

	}
}