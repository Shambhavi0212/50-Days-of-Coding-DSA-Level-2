/*
Problem: Reverse the Words in a Sentence

Description:
Given a sentence, print the words in reverse order.
Only the order of the words should be reversed, not the characters within each word.

Constraints:
- The sentence contains only alphabetic characters and spaces.
- No leading or trailing spaces.
- Words are separated by single spaces.
- 1 <= Number of words <= 100

Sample Input:
I love Java programming

Sample Output:
programming Java love I
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
