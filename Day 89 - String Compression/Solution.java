/*
📝 Problem: Compress the String

Given a lowercase string `s` consisting of repeated characters, compress the string such that 
each group of the same character is replaced by the character followed by the number of times it appears consecutively.

📥 Input Format:
- A single line containing the input string `s`.

📤 Output Format:
- A single line containing the compressed string.

🔒 Constraints:
- 1 ≤ s.length() ≤ 1000
- String contains only lowercase English letters

🧪 Example 1:
Input:  aaabb
Output: a3b2

🧪 Example 2:
Input:  aabbccc
Output: a2b2c3

🧪 Example 3:
Input:  abc
Output: a1b1c1
*/



import java.util.*;
class Solution{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
         
        String result="";
        int count =1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else
            {
                result=result+s.charAt(i-1)+count;
                count=1;
            }
        }
        result=result+s.charAt(s.length()-1)+count;
        System.out.println(result);
    }
}