/*
------------------------------------------------------------
Day 70: Practicing ArrayList Methods in Java
------------------------------------------------------------

What I Practiced Today:
Today, I focused on key predefined methods of the ArrayList class in Java. 
These methods help in analyzing and manipulating data stored in lists.

Methods practiced:
- size() – Returns the total number of elements in the list
- isEmpty() – Checks whether the list is empty
- contains() – Checks if a specific element exists in the list
- indexOf() – Returns the index of the first occurrence of an element
- lastIndexOf() – Returns the index of the last occurrence of an element

------------------------------------------------------------
Problem Statement:

Title: Explore Core ArrayList Functions with Numbers

Input:  
- First line: An integer n representing the number of elements  
- Second line: n integers to be added to the ArrayList

Task:
1. Create an ArrayList<Integer> and add all numbers.
2. Replace the first element with 20.
3. Use .get() to access the element at index 2.
4. Print the following:
   - Total number of elements using .size()
   - Whether the number 2 exists using .contains()
   - Whether the list is empty using .isEmpty()
   - First index of the number 3 using .indexOf()
   - Last index of the number 5 using .lastIndexOf()

------------------------------------------------------------
Sample Input:
5
1 2 3 4 5

Sample Output:
5
true
false
2
4

Explanation:
After replacing the first element with 20, the list becomes [20, 2, 3, 4, 5].
- The size is 5
- The number 2 exists in the list
- The list is not empty
- 3 is at index 2
- 5 is at index 4 (last occurrence)
------------------------------------------------------------
*/

import java.util.*;
public class Solution {
    public static void main(String[] args)
    {    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList <Integer> numbers=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            numbers.add(sc.nextInt());
        }
        numbers.set(0,20);
        numbers.get(2);
        System.out.println(numbers.size());
         System.out.println(numbers.contains(2));
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.indexOf(3));
        System.out.println(numbers.lastIndexOf(5));

    }
}
