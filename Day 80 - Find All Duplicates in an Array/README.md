🚀 Day8️⃣0️⃣/100 : LeetCode 442 Challenge 

🧩 Problem Solved: Find All Duplicates in an Array  
📊 Problem Type: Array | In-place Modification | Frequency Count

📝 Today, I:  
Solved a clever in-place array manipulation problem where I had to find all numbers that appear twice in a given array. The catch was to do it in **O(n)** time with **O(1)** extra space (excluding output).

📥 Example Input:  
[4, 3, 2, 7, 8, 2, 3, 1]  
📤 Output:  
[2, 3]

💡 Approach:  
1. Traverse the array.  
2. Use the absolute value of the current number to access an index.  
3. If the number at that index is already negative, it means we've seen this number before → it's a duplicate.  
4. If not, negate the number at that index to mark it as seen.  
5. Collect duplicates during traversal.

🛠️ Concepts Used:  
1. Index mapping  
2. In-place marking (negating values)  
3. Constant space tracking

⏳ Time Complexity: O(n)  
📦 Space Complexity: O(1) (excluding result list)

🌱 #Day80 #LeetCode #DSA #Java #Array #InPlaceAlgorithm #EfficientCode #CleanCode #100DaysOfCode #WomenInTech #LearningNeverStops 🚀
