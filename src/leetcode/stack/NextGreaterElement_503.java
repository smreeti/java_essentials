package leetcode.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
* Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.
The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.

Example 1:
Input: nums = [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2;
The number 2 can't find next greater number.
The second 1's next greater number needs to search circularly, which is also 2.

* Example 2:
Input: nums = [1,2,3,4,3]
Output: [2,3,4,-1,4]
* */
public class NextGreaterElement_503 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1};
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];

            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                int idx = stack.pop();
                res[idx] = num;
            }

            // Only push indices in first pass
            if (i < n) {
                stack.push(i);
            }
        }

        System.out.println(Arrays.toString(res));
    }
}
