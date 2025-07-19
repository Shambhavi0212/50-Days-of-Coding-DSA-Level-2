/* Temperature Stability Checker for Product Storage - crtprep

Problem
You are given the number of products and their corresponding storage temperatures.
Write a program that reads the input and determines whether the temperature variations among the products are relatively stable.
Temperature variation is considered stable if the difference between the highest and lowest temperature is less than 15 degrees.
If stable, print "STABLE". Otherwise, print "UNSTABLE".

Input Format
The first line consists of an integer numOfProducts, representing the number of products (N).
The second line consists of N space-separated integers representing the temperatures at which the products must be preserved in the storage units.

Constraints
• 1 ≤ N ≤ 1000 — where N is the number of products
• -100 ≤ temperature ≤ 100 — valid range for each product’s storage temperature
• Input values are integers
• The input will contain exactly N integers after the first line

Output Format
Print "STABLE" if the temperature variations are stable, otherwise print "UNSTABLE"

Sample Input 0
5
10 -5 8 -9 6

Sample Output 0
UNSTABLE

Sample Input 1
8
20 25 22 28 19 21 23 24

Sample Output 1
STABLE */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int min=a[0];
        int max=a[n-1];
        int dif=max-min;
        System.out.println((dif<15)?"STABLE":"UNSTABLE");
    }
}