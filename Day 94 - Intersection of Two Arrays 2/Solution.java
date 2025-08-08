/*
350. Intersection of Two Arrays II

Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must appear as many times as it shows in both arrays 
and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.

Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
*/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int r = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[r++] = nums1[i];
                    nums2[j] = Integer.MIN_VALUE; 
                    break;
                }
            }
        }
        int[] ans = new int[r];
        for (int i = 0; i < r; i++) {
            ans[i] = result[i];
        }
        return ans;
    }
}
