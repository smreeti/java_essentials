package leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/*
* Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2*/
public class SubArraySumEqualsK_560 {

    //Time	O(n)
    //Space	O(n)

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1,2,1};
        int k = 3;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);

    }

}
