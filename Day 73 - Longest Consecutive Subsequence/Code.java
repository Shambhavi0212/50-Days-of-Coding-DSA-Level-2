 /*
Longest Consecutive Subsequence-crtprep

Problem
Given an unsorted array of integers nums, find the length of the longest consecutive elements sequence.

Input Format
The first line contains an integer n (0 ≤ n ≤ 10^5), the size of the array.
The second line contains n space-separated integers, where each integer nums[i] satisfies −10^9 ≤ nums[i] ≤ 10^9.

Constraints
0 ≤ n ≤ 10^5
−10^9 ≤ nums[i] ≤ 10^9

Output Format
Return a single integer representing the length of the longest consecutive sequence.

Sample Input 0
6
100 4 200 1 3 2

Sample Output 0
4

Sample Input 1
10
0 3 7 2 5 8 4 6 0 1

Sample Output 1
9
*/


import java.util.*;

public class Code {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        if(n==0)
        {
            System.out.println(0);
            return;
        }
        int count=1,longest=1;
        Arrays.sort(a);
        for(int i=0;i<n-1;i++)
        {
            if(a[i]==a[i+1])
            {
                continue;
            }
            else if(a[i]+1==a[i+1])
            {
                count++;
            }
            longest=Math.max(count,longest);
        }
        System.out.println(longest);
    }
}