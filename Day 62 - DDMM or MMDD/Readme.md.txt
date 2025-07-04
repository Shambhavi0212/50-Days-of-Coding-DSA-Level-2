🚀 Day6️⃣2️⃣/100 : CodeChef Challenge  

🧩 Problem Solved: DDMM or MMDD  
📊 Problem Type: Strings | Conditional Logic | Date Parsing  

📝 Today, I:  
Solved a date format identification problem from CodeChef. Given a date string, I determined if the format is `DD/MM/YYYY`, `MM/DD/YYYY`, or if both formats are valid.  

📥 Example Input:  
4  
21/05/2001  
10/15/2069  
05/11/1999  
29/02/2024  

📤 Output:  
DD/MM/YYYY  
MM/DD/YYYY  
BOTH  
DD/MM/YYYY  

💡 Approach:  
1. Read input using `Scanner`  
2. Split the date string using `/`  
3. Convert day and month parts to integers  
4. Apply conditions:  
   - If day > 12 → `DD/MM/YYYY`  
   - Else if month > 12 → `MM/DD/YYYY`  
   - Else → `BOTH`  
5. Print the result  

🛠️ Concepts Used:  
1. String splitting  
2. Integer parsing  
3. Conditional statements  

⏳ Time Complexity: O(1) per test case  
📦 Space Complexity: O(1)  

🌱 #Day62 #CodeChef #DSA #Java #StringParsing #DateLogic #BasicProgramming #CleanCode #WomenInTech #100DaysOfCode #LearningJourney 🚀
