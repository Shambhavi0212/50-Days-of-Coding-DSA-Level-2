/*
N Buttons 1 Bulb

Kulyash stays in room that has a single bulb and N buttons. 
The bulb is initially on.

The initial states of the buttons are stored in a binary string S of length N — 
if S_i is 0, the i-th button is off, and if S_i is 1, the i-th button is on. 
If Kulyash toggles any single button then the state of the bulb reverses 
i.e. the bulb lights up if it was off and vice versa.

Kulyash has toggled some buttons and the final states of the buttons are stored 
in another binary string R of length N. 
He asks you to determine the final state of the bulb.

Input Format:
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of three lines of input:
- The first line of each test case contains an integer N — the number of buttons.
- The second line of each test case contains a binary string S — the initial states of the buttons.
- The third line of each test case contains a binary string R — the final states of the buttons.

Output Format:
For each test case, output on a new line the final state of the bulb (0 for off and 1 for on).

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 100
S and R are binary strings, i.e., contain only the characters 0 and 1.

Sample 1:
Input:
2
3
000
001
2
00
11

Output:
0
1

Explanation:
Test case 1: All the buttons are initially off and finally the state of only one button 
has changed so the state of the bulb reverses once i.e. it turns off.

Test case 2: All the buttons are initially off and finally the states of two buttons 
have changed so the state of the bulb reverses twice i.e. it remains on.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int c=0;
            int n = scanner.nextInt();
            String s = scanner.next();
            String r = scanner.next();
            for(int i=0;i<s.length();i++)
            {
            if(s.charAt(i)!=r.charAt(i))
            c++;
            }
            System.out.println((c%2==0)?"1":"0");
        }
    }
}