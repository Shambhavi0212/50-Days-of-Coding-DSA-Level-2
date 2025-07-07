/*You are given an array of integers. For every even number in the array, compute the product of its digits and print them in order.

If no even numbers exist, print "No Even Elements".

Input Format

The first line contains an integer n — the number of elements in the array.

The second line contains n space-separated integers a[i] — the elements of the array.

Constraints

1 ≤ n ≤ 1000

-10⁶ ≤ a[i] ≤ 10⁶

Output Format

For each even number, print the product of its digits, separated by a space.

If there are no even elements, print "No Even Elements".

Sample Input 0
5
122 91 174 99 1204

Sample Output 0
4 28 0

Sample Input 1
3
19 11 21

Sample Output 1
No Even Elements*/

import java.util.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int even[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
               even[index++]=a[i];
            }
        }
        if(index!=0)
        {
         
         for(int i=0;i<index;i++)
         {
          int num=even[i];
              int pro=1;
          while(num!=0)
          {  
              int d=num%10;
              pro=pro*d;
              num=num/10;    
          }
            System.out.print(pro+" ");  
             
         }}
        else
        {
            System.out.print("No Even Elements");  
        }   
        sc.close();
    }
}