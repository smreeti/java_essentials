package leetcode.twoPointerAndSlidingWindow;

/*
* Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
*
Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

* Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9
* */
public class TrappingRainWater_42 {
    public static void main(String[] args) {
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int left = 0;
        int right = heights.length - 1;

        int total = 0;
        int leftMax = heights[0];
        int rightMax = heights[right];

        while (left < right) {
            if (heights[left] < heights[right]) {
                leftMax = Math.max(leftMax, heights[left]);

                if (leftMax - heights[left] > 0) {
                    total = total + leftMax - heights[left];
                }
                left++;
            } else {
                rightMax = Math.max(rightMax, heights[right]);
                if (rightMax - heights[right] > 0) {
                    total = total + rightMax - heights[right];
                }
                right--;
            }
        }

        System.out.println(total);

    }
}
