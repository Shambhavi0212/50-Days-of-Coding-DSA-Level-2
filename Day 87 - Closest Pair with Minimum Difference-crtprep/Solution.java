/*
Given an array of integers, find the closest pair with the smallest difference.
If there are multiple answers, print the smallest one.

Input Format:
• First line contains an integer N — the number of elements in the array.
• Second line contains N space-separated integers — the elements of the array

Constraints:
• 2 ≤ N ≤ 10⁴
• -10⁶ ≤ arr[i] ≤ 10⁶
• All elements may not be distinct.

Output Format:
• Print two space-separated integers representing the pair with the smallest absolute difference, in ascending order.

Sample Input 0:
5
1 9 5 6 4

Sample Output 0:
4 5

Sample Input 1:
6
1 2 9 6 4 7

Sample Output 1:
1 2
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        int a = 0, b = 0;

        for(int i = 1; i < n; i++) {
            int diff = Math.abs(arr[i] - arr[i - 1]);

            if(diff < minDiff) {
                minDiff = diff;
                a = arr[i - 1];
                b = arr[i];
            }
        }

        System.out.println(a + " " + b);
    }
}
