/*
Check if a string is anagram of another

Given two strings, your task is to check if they are anagrams of each other.
Two strings are considered anagrams if by rearranging the letters of one string,
we can get the other string. Your program should be able to read two strings
from the input and output "YES" if they are anagrams of each other, and "NO" otherwise.

Input Format
The first line of input contains a single integer T, the number of test cases.
Each test case consists of two lines.
The first line of each test case contains the first string, A.
The second line of each test case contains the second string, B.

Output Format
For each test case, print "YES" if the two strings are anagrams of each other;
otherwise, print "NO". Each output should be in a new line.

Constraints
1 ≤ T ≤ 100
1 ≤ |A|, |B| ≤ 10^5
The strings consist only of lowercase English letters.

Sample 1:
Input
3
listen
silent
programming
margorpign
cat
tac

Output
YES
NO
YES

Explanation:
In the first test case, "listen" and "silent" are anagrams of each other as rearranging
the letters of "silent" can form "listen".
In the second test case, "programming" and "margorpign" are not anagrams since
"programming" has two 'm's while "margorpign" has only one.
In the third test case, "cat" and "tac" are anagrams of each other as rearranging
the letters of "tac" can form "cat".
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-- >0)
	 {
	   String s1=sc.next();
	   String s2=sc.next();
	   char words1[]=s1.toCharArray();
	   char words2[]=s2.toCharArray();
	   Arrays.sort(words1);
	   Arrays.sort(words2);
	   if(s1.length()!=s2.length())
	   {
	       System.out.println("NO");
	   }
	   else{
	       if(Arrays.equals(words1, words2))
	       {
	           System.out.println("YES");
	       }
	       else{
	            System.out.println("NO");
	       }
	}
}}}
