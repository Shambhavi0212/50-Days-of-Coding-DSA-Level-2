🚀 Day5️⃣5️⃣/100 : CodeChef Challenge 

🧩 Problem Solved: World Chess Championship Prize Money
📊 Problem Type: Strings | Counting | Conditional Logic | Basic Math 

📝 Today, I:
Solved an interesting string and math-based problem from CodeChef. The task was to calculate Carlsen's prize money based on the outcomes of 14 classical chess games against Chef. Depending on who scored higher or if it was a tie, the prize amount was determined as per the given conditions.

📥 Example Input:
4  
100  
CCCCCCCCCCCCCC  
400  
CDCDCDCDCDCDCD  
30  
DDCCNNDDDCCNND  
1  
NNDNNDDDNNDNDN  

📤 Output:
6000  
24000  
1650  
40  

💡 Approach:
1. Read input using Scanner.
2. For each test case, count the number of games Carlsen won (C), Chef won (N), and draws (D).
3. Compute Carlsen’s and Chef’s total points.
4. Determine the prize money based on the comparison of points:
   - If Carlsen > Chef → 60 * X
   - If Carlsen < Chef → 40 * X
   - If tie → 55 * X (Carlsen wins as defending champion)

🛠️ Concepts Used:
1. String traversal
2. Conditional statements
3. Simple arithmetic
4. Input/Output handling

⏳ Time Complexity: O(T * 14)
📦 Space Complexity: O(1)

🌱 #Day55 #CodeChef #DSA #Java #StringProblem #BasicProgramming #CleanCode #WomenInTech #50DaysOfCode #LearningJourney 🚀
