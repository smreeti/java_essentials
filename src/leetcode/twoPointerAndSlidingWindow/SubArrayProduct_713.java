package leetcode.twoPointerAndSlidingWindow;

import java.util.Arrays;

/*
* Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.

Example 1:

Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
Example 2:

Input: nums = [1,2,3], k = 0
Output: 0

* */
public class SubArrayProduct_713 {

    public static void main(String[] args) {

        int[] nums = new int[]{10, 5, 2, 6};
        int k = 100;

//        if (k <= 1) return 0;

        int left = 0;
        int prod = 1;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];

            while (prod >= k) {
                prod /= nums[left];
                left++;
            }

            count += right - left + 1; // all subarrays ending at right
        }

        System.out.println(count);


    }

    /*
        Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
        The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
        You must write an algorithm that runs in O(n) time and without using the division operation.

        Example 1:
        Input: nums = [1,2,3,4]
        Output: [24,12,8,6]
        Example 2:

        Input: nums = [-1,1,0,-3,3]
        Output: [0,0,9,0,0]
        * */
    public static class ProductOfArrayExceptSelf_238 {


        public static void main(String[] args) {
            int[] nums = new int[]{1,2,3,4};
            int[] answer = new int[nums.length];

            //Time: O(n2)
    //        for (int i = 0; i< nums.length; i++) {
    //            int product = 1;
    //            for (int j = 0; j < nums.length; j++) {
    //                if (i!=j) {
    //                     product *=  nums[j];
    //                    answer[i] = product;
    //                }
    //
    //            }
    //        }

            //Time: O(2n), Space: O(1)
            Arrays.fill(answer, 1);
            int pre = 1;
            int post = 1;

            for (int i = 0; i < nums.length; i++) {
                answer[i] = pre;
                pre *= nums[i];
            }

            for (int j= nums.length -1; j >= 0; j--) {
                answer[j] = answer[j] * post;
                post *= nums[j];
            }

            System.out.println(Arrays.toString(answer));
        }
    }
}
