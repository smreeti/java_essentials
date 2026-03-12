package leetcode.twoPointer;

import java.util.Arrays;

public class TwoSum_167 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return null;
    }
}
