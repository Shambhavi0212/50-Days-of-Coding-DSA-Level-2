/*
Different Consecutive Characters

Chef has a binary string S of length N. 
Chef can perform the following operation on S:

Insert any character (0 or 1) at any position in S.
Find the minimum number of operations Chef needs to perform so that no two consecutive characters are same in S.

Input Format
The first line contains a single integer T — the number of test cases. Then the test cases follow.
The first line of each test case contains an integer N — the length of the binary string S.
The second line of each test case contains a binary string S of length N containing 0s and 1s only.

Output Format
For each test case, output on a new line the minimum number of operations Chef needs to perform so that 
no two consecutive characters are same in S.

Constraints
1 ≤ T ≤ 100
1 ≤ N ≤ 1000

Sample 1:
Input
3
2
11
4
0101
5
00100

Output
1
0
2

Explanation:
Test case 1: We can perform the following operations: 
11 → 1 0 1

Test case 2: We do not need to perform any operations.

Test case 3: We can perform the following operations: 
00100 → 0 1 0100 → 01010 0
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
	   
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        sc.nextLine();
	    String s=sc.nextLine();
	     int c=0;
	for(int i=0;i<s.length()-1;i++)
	{ 
	    if(s.charAt(i)==s.charAt(i+1))
	    {
	        c++;
	        }
	    }
	    System.out.println(c);
	}
	

	}
}
