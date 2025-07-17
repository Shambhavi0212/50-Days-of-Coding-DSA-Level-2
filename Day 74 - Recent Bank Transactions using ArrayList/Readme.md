🚀 Day7️⃣4️⃣/100 : Real-Time Banking Problem

🧩 Problem Solved: Recent Transactions Tracker  
📊 Problem Type: ArrayList | Input/Output | SubList | Real-Time Simulation  

📝 Today, I:
Created a Java program to simulate a banking system that:
- Accepts transaction amounts from the user,
- Displays them in original and reversed (most recent first) order,
- Allows viewing a sub-range of transactions using indices.

📥 Example Input:
Enter number of transactions : 6  
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
5  

📤 Output:  
Original Transactions: [1200, 500, 750, 230, 640, 890]  
Most Recent First: [890, 640, 230, 750, 500, 1200]  
Transactions from index 1 to 4 : [640, 230, 750, 500]  

💡 Approach:
1. Use `ArrayList<Integer>` to store transaction amounts dynamically.
2. Use `Collections.reverse()` to reverse the list.
3. Use `subList(start, end)` to extract the desired range of transactions.
4. Display the sublist with meaningful index-based messaging.

🧠 Syntax & Concepts Learned Today:
✅ `import java.util.*;` – to use Scanner, ArrayList, and Collections  
✅ `Scanner sc = new Scanner(System.in);` – for user input  
✅ `ArrayList<Integer> list = new ArrayList<>();` – to create a dynamic list  
✅ `list.add(sc.nextInt());` – to add input elements to the list  
✅ `Collections.reverse(list);` – to reverse the ArrayList  
✅ `list.subList(start, end);` – to get a subrange from the list  
✅ `System.out.println()` – to display output  
✅ `int x = sc.nextInt();` – for reading integer inputs  

🛠️ Concepts Used:
📌 ArrayList (Dynamic arrays in Java)  
📌 Scanner for input handling  
📌 Collections utility methods  
📌 Sublist for slicing a list  
📌 Index-based access  

⏳ Time Complexity: O(N)  
📦 Space Complexity: O(N)  

🌱 #Day74 #Java #ArrayList #Collections #SubList #Scanner #InputOutput #BankingSimulation #100DaysOfCode #DSA #CodeWithClarity #LearningByDoing 🚀
