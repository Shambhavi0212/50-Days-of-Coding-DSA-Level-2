🚀 Day9️⃣7️⃣/100 : LeetCode 153 Challenge  

🧩 Problem Solved: Find Minimum in Rotated Sorted Array  
📊 Problem Type: Binary Search | Array | Rotated Sorted Array  

📝 Today, I:  
Solved an efficient binary search problem from LeetCode, where I had to find the smallest element in a rotated sorted array of unique elements in O(log n) time.  

📥 Example Input:  
[4,5,6,7,0,1,2]  
📤 Output: 0  

💡 Approach:  
1. Initialize two pointers `l` and `r` at the start and end of the array  
2. Use binary search to find the unsorted half containing the minimum element  
3. If `nums[mid] > nums[r]`, move `l` to `mid + 1`  
4. Otherwise, move `r` to `mid`  
5. Return `nums[l]` when pointers meet  

🛠️ Concepts Used:  
1. Binary Search  
2. Array Indexing  
3. Pointer Manipulation  

⏳ Time Complexity: O(log n)  
📦 Space Complexity: O(1)  

🌱 #Day97 #LeetCode #DSA #Java #BinarySearch #Array #CleanCode #WomenInTech #100DaysOfCode #LearningJourney 🚀
