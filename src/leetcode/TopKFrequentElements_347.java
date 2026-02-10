package leetcode;

import java.util.*;

/*
* Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]

Example 3:
Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
Output: [1,2]*/
public class TopKFrequentElements_347 {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 3, 2, 2, 3};
        int k = 2;

        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(count::get));

        for (int n: count.keySet()) {
            queue.add(n);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        int[] ans = new int[k];

        for (int i =0; i< k; i++) {
            ans[i] = queue.poll();
        }

        System.out.println("ans::" + Arrays.toString(ans));
    }
}
