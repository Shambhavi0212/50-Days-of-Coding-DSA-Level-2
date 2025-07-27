/*
Given a string S, count the frequency of each character present in the string. 
You are not allowed to use any Java collection classes like HashMap. 
Instead, use an integer array of size 255, assuming the input string contains only standard ASCII characters.

Input Format:
A single line of input containing the string S.

Constraints:
1 <= S.length() <= 1000 
String may contain lowercase, uppercase letters, digits, spaces, and symbols. 
Treat characters as case-sensitive ('A' and 'a' are different).

Output Format:
Print each character and its frequency in the format: character frequency 
Output each character that appears at least once, in the order of their first appearance in the string.

Sample Input 0:
banana

Sample Output 0:
b 1  
a 3  
n 2

Sample Input 1:
Hello123

Sample Output 1:
H 1  
e 1  
l 2  
o 1  
1 1  
2 1  
3 1
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count[] = new int[255];
        boolean printed[] = new boolean[255];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch]++;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!printed[ch]) {
                System.out.println(ch + " " + count[ch]);
                printed[ch] = true;
            }
        }
    }
}
