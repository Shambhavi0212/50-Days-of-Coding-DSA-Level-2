🚀 Day7️⃣9️⃣/100 : LeetCode 121 Challenge

🧩 Problem Solved: Best Time to Buy and Sell Stock  
📊 Problem Type: Arrays | Greedy | One Pass | Optimization  

📝 Today, I:
Solved an essential and popular stock-buying problem from LeetCode that focuses on maximizing profit by buying and selling on the right days.

📥 Example Input:
prices = [7,1,5,3,6,4]

📤 Output: 5  
💡 Explanation: Buy on day 2 at price 1 and sell on day 5 at price 6.  
Profit = 6 - 1 = 5

💡 Approach:
1. Initialize `minPrice` with the first day’s stock price.
2. Iterate through the array from day 2 onward.
3. For each price:
   - Update `minPrice` if current price is lower.
   - Calculate profit = current price - `minPrice`.
   - Update `maxProfit` if current profit is greater than the previous maximum.
4. Return the maximum profit obtained.

🛠️ Concepts Used:
1. Greedy strategy
2. Minimum tracking
3. One pass linear traversal

⏳ Time Complexity: O(N)  
📦 Space Complexity: O(1)

🌱 #Day79 #LeetCode #DSA #Java #GreedyAlgorithm #CleanCode #WomenInTech #100DaysOfCode #LearningJourney 🚀
