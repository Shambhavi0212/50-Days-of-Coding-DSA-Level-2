
/*
You are given an array of integers. Your task is to separate the odd and even numbers 
into two different arrays and print them.

Print all the odd numbers in the order they appear in the array.

Then, print all the even numbers in the order they appear in the array.

If there are no odd numbers, print "No odd elements".

If there are no even numbers, print "No even elements".

Input Format:
The first line contains an integer n — the number of elements in the array.
The second line contains n space-separated integers a[i] — the elements of the array.

Constraints:
1 ≤ n ≤ 1000
-10⁶ ≤ a[i] ≤ 10⁶

Output Format:
First line: All odd elements, space-separated. If none, print "No odd elements".
Second line: All even elements, space-separated. If none, print "No even elements".

Sample Input 0:
6
1 2 3 4 5 6

Sample Output 0:
1 3 5
2 4 6

Sample Input 1:
4
2 4 6 8

Sample Output 1:
No odd elements
2 4 6 8

Sample Input 2:
5
1 3 5 7 9

Sample Output 2:
1 3 5 7 9
No even elements

Sample Input 3:
3
0 2 4

Sample Output 3:
No odd elements
0 2 4
*/

import java.io.*;
import java.util.*;

 class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int even[]=new int[n];
        int odd[]=new int[n];
        int ev=0;
        int od=0;
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                even[ev++]=a[i];
            }
            else
            {
                odd[od++]=a[i];
            }
        }
        if(od==0)
        {
            System.out.println("No odd elements");
        }
        else
        {
            for(int i=0;i<od;i++)
            {
                System.out.print(odd[i]+" ");
            }
            System.out.println();
        }
         if(ev==0)
        {
            System.out.println("No even elements");
        }
        else
        {
            for(int i=0;i<ev;i++)
            {
                System.out.print(even[i]+" ");
            }
        }
      
        
       
        
    }
}