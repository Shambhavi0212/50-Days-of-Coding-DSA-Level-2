/*
Given n disks, print the steps to move all disks from source to destination using the Tower of Hanoi strategy.

Input Format:
An integer n

Constraints:
1 <= n <= 10

Output Format:
Each step as: "Move disk X from source to destination"

Sample Input 0:
1

Sample Output 0:
Move disk 1 from A to C

Sample Input 1:
2

Sample Output 1:
Move disk 1 from A to B
Move disk 2 from A to C
Move disk 1 from B to C
*/


import java.io.*;
import java.util.*;

public class Solution {
    public static void toh(int n, char s, char a, char d) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + s + " to " + d);
            return;
        }
        toh(n - 1, s, d, a);
        System.out.println("Move disk " + n + " from " + s + " to " + d);
        toh(n - 1, a, s, d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toh(n, 'A', 'B', 'C');
    }
}
