/*
DNA Storage
For encoding an even-length binary string into a sequence of A, T, C, and G, we iterate from left to right and replace the characters as follows:

00 is replaced with A
01 is replaced with T
10 is replaced with C
11 is replaced with G
Given a binary string S of length N (N is even), find the encoded sequence.

Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case contains two lines of input.
First line contains a single integer N, the length of the sequence.
Second line contains binary string S of length N.

Output Format
For each test case, output in a single line the encoded sequence.

Note: Output is case-sensitive.

Constraints
1 ≤ T ≤ 100
2 ≤ N ≤ 10^3
N is even.
Sum of N over all test cases is at most 10^3.
S contains only characters 0 and 1.

Sample 1:
Input
4
2
00
4
0011
6
101010
4
1001

Output
A
AG
CCC
CT

Explanation:
Test case 1: Based on the rules 00 is replaced with A.
Test case 2: Based on the rules 00 is replaced with A. Similarly, 11 is replaced with G. Thus, the encoded sequence is AG.
Test case 3: The first two characters are 10 which is encoded as C. Similarly, the next two characters 10 are encoded as C and the last two characters 10 are encoded as C. Thus, the encoded string is CCC.
Test case 4: The first two characters are 10 which is encoded as C. Similarly, the next two characters 01 are encoded as T. Thus, the encoded string is CT.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
       

        while (t-- > 0) {
             String result="";
            int n = scanner.nextInt();
            String s = scanner.next();
            for(int i=0;i<n;i=i+2)
            {
                if(s.charAt(i)=='0'&&s.charAt(i+1)=='0')
                {
                    result=result+'A';
                }
                else if(s.charAt(i)=='0'&&s.charAt(i+1)=='1')
                {
                     result=result+'T'; 
                }
                else if(s.charAt(i)=='1'&&s.charAt(i+1)=='0')
                {
                    result=result+'C';
                }
                else
                {
                    result=result+'G'; 
                }
            }

               System.out.println(result+" ");
        }
     
    }
}
