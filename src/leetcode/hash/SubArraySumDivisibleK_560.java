package leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/*
*Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.
A subarray is a contiguous part of an array.

Example 1:

Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
Example 2:

Input: nums = [5], k = 9
Output: 0
 */
public class SubArraySumDivisibleK_560 {

    //Time	O(n)
    //Space	O(n)

    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 0, -2, -3, 1};
        int k = 5;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            int remainder = prefixSum % k;

            if (remainder < 0) {
                remainder += k;
            }

//            if (map.containsKey(remainder)) {
//                count += map.get(remainder);
//            }
//
            count += map.getOrDefault(remainder, 0);

            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        System.out.println(count);

    }

}
