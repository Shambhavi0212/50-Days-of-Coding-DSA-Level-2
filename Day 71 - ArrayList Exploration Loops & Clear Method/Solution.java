/*🧩 Problem Statement:
Title: Iteration and Clearing Practice with an Integer List

📥 Input:
First line: An integer n (number of elements)
Second line: n space-separated integers

🎯 Task:
Store all integers in an ArrayList<Integer>.
Print all elements using:
A regular for loop
A for-each loop
Clear the list using .clear().
Check and print whether the list is empty using .isEmpty(). */

import java.util.*;
public class Solution{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList <Integer> numbers=new ArrayList <>();
        for(int i=0;i<n;i++)
        {
            numbers.add(sc.nextInt());
        }
        //1. regular for loop
        for(int i=0;i<numbers.size();i++)
        {
            System.out.println(numbers.get(i));
        }
        //2.for-each loop
        for(int num:numbers)
        {
            System.out.println(num);
        }
        //3.clearimg the list
        numbers.clear();
        //4. Checking if the list is empty
        System.out.println(numbers.isEmpty());  
    }
}