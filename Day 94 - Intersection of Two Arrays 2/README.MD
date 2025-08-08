🚀 Day9️⃣4️⃣/100 : LeetCode 350 Challenge  

🧩 Problem Solved: Intersection of Two Arrays II  
📊 Problem Type: Array | Two Pointers | Brute Force  

📝 Today, I:  
Solved a problem where I had to find the intersection of two integer arrays, ensuring that each common element appears in the result as many times as it appears in both arrays.  

📥 Example Input:  
nums1 = [4, 9, 5]  
nums2 = [9, 4, 9, 8, 4]  

📤 Output:  
[4, 9]  

💡 Approach:  
1. Create a result array of minimum possible size (min length of nums1, nums2).  
2. Use nested loops to compare each element of nums1 with nums2.  
3. If a match is found, store it in the result array and mark the matched element in nums2 with a placeholder value (Integer.MIN_VALUE) to avoid reusing it.  
4. Copy the valid part of the result array into a final array and return it.  

🛠️ Concepts Used:  
1. Arrays  
2. Nested loops for comparison  
3. Array copying and size adjustment  

⏳ Time Complexity: O(N × M)  
📦 Space Complexity: O(min(N, M))  

🌱 #Day94 #LeetCode #DSA #Java #ArrayProblem #BruteForce #CleanCode #WomenInTech #100DaysOfCode #LearningJourney 🚀  
