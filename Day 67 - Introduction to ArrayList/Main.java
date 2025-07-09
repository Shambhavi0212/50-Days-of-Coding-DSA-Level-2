/*🟩 Question:
Write a Java program that:

1. Takes an integer `n` as input.
2. Reads `n` integers and stores them in an ArrayList.
3. Adds the numbers 5 and 10 to the list.
4. Prints the complete ArrayList.
5. Prints the element at index 4.

📥 Input Format:
First line: Integer n  
Second line: n space-separated integers

📤 Output Format:
First line: The ArrayList after adding 5 and 10  
Second line: The element at index 4

🔽 Sample Input 1:
3
1 2 3

🔼 Sample Output 1:
[1, 2, 3, 5, 10]
10

🔽 Sample Input 2:
4
8 6 7 9

🔼 Sample Output 2:
[8, 6, 7, 9, 5, 10]
5

*/ 
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList <Integer> numbers=new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            numbers.add(sc.nextInt());
        }
        numbers.add(5);
        numbers.add(10);
        System.out.println(numbers); //this will increase the size of the array (dynamic size)
        int x=numbers.get(4);
        System.out.println(x);
    }
}