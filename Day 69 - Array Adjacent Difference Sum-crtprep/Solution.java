


/*
Compute the sum of absolute differences between adjacent elements in the array.

Input Format

• First line: An integer n, the size of the array.
• Second line: n space-separated integers arr[i].

Constraints

• 2 ≤ n ≤ 10^5
• −10^9 ≤ arr[i] ≤ 10^9

Output Format

Output a single integer, the sum of absolute differences.

Sample Input 0

3
1 3 5

Sample Output 0

4

Sample Input 1

4
2 4 1 3

Sample Output 1

7
*/
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int difference;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            difference=Math.abs(a[i+1]-a[i]);
            sum=sum+difference;
        }
        System.out.println(sum);    
    }
}
