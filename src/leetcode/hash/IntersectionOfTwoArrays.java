package leetcode.hash;

import java.util.Arrays;
import java.util.HashSet;

/*
* Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
* */
public class IntersectionOfTwoArrays {

    //Time	O(n + m)
    //Space	O(n)
    public static void main(String[] args) {

        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};

        HashSet<Integer> numSet = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int num : nums1) {
            numSet.add(num);
        }

        for (int num : nums2) {
            if (numSet.contains(num)) {
                result.add(num);
            }
        }

        int[] ans = new int[result.size()];
        int i = 0;

        for (int n : result) {
            ans[i++] = n;
        }

        System.out.println(Arrays.toString(ans));
    }
}
