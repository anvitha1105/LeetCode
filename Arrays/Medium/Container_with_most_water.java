/**
 * LeetCode #11 - Container With Most Water
 * Optimal Solution: Two Pointer Approach
 * 
 * Time Complexity: O(n) - Single pass with two pointers
 * Space Complexity: O(1) - Constant extra space
 */
class Solution {
    public int maxArea(int[] height) {
        
    int left = 0, right = height.length - 1;
    int maxArea = 0;
    while (left < right) {
        int area = Math.min(height[left], height[right]) * (right - left);
        maxArea = Math.max(maxArea, area);
        if (height[left] < height[right]) left++;
        else right--;
    }
    return maxArea;
}
    }

