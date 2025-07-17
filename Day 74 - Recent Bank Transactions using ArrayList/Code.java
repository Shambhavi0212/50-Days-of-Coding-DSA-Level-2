/*Real-Time Problem: Recent Transactions
Scenario:
A bank application stores the last N transaction amounts in an ArrayList.
You want to:

Show the transactions as entered (original order).

Show the most recent transactions first (reversed).

Allow the user to view transactions from a specific range, like "Show me transaction 2 to 4".

 Input Format:

Enter number of recent transactions:
6
Enter transaction amounts:
1200
500
750
230
640
890
Enter start index to view range:
1
Enter end index:
4
 Output Format:

 
Original Transactions: [1200, 500, 750, 230, 640, 890]
Most Recent First: [890, 640, 230, 750, 500, 1200]
Transactions from index 1 to 4: [640, 230, 750, 500]
*/
import java.util.*;
public class Code{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print(" Enter number of transactions : ");
int n=sc.nextInt();
ArrayList <Integer> list= new ArrayList<>();
System.out.println("Enter transaction amounts: ");
for(int i=0;i<n;i++)
{
  list.add(sc.nextInt());
}
System.out.println("Original Transactions: "+list);

Collections.reverse(list);
System.out.println("Most Recent First: "+list);

System.out.println("Enter start index to view range:");
int firstindex=sc.nextInt();
System.out.println("Enter end index:");
int secondindex=sc.nextInt();

ArrayList <Integer> sublist =new ArrayList<>(list.subList(firstindex,secondindex));
System.out.println("Transactions from index "+ firstindex+" to "+(secondindex-1)+" : "+sublist);
}}


