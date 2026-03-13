package leetcode.hash;

import java.util.Arrays;
import java.util.HashSet;


/*
* Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.


Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
*
Example 3:
Input: nums = [1,0,1,2]
Output: 3*/
public class LongestConsecutiveSequence_128 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 5, 3, -1, 200, -1, 0, 2, 7, 4};


        //Time: O(n log n)
//        Arrays.sort(nums);
//        int startNum = nums[0];
//        int length = 1;
//
//        for (int i = 1; i < nums.length; i++) {
//            int nextNum = startNum + 1;
//            if (nextNum == nums[i]) {
//                length++;
//                startNum++;
//            }
//        }
//
//        System.out.println("length:: " + length);

        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }

        int longestSub = 1;

        for (int num : hashSet) {
            if (hashSet.contains(num - 1)) {
                continue;
            } else {
                int currentNum = num;
                int currentSub = 1;
                while (hashSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSub++;
                }

                longestSub = Math.max(longestSub, currentSub);
            }
        }

        System.out.println(longestSub);

    }
}
