package leetcode.twoPointer;

import java.util.Arrays;

public class ThreeSumClosest_16 {

    public static void main(String[] args) {

        int threeSumClosest = threeSumClosest();
        System.out.println(threeSumClosest);
    }

    public static int threeSumClosest() {
        int[] nums = new int[]{-1, 2, 1, -4};
        int target = 1;

        Arrays.sort(nums);

        int closestSum = nums[0] + nums[1] + nums[2];;

        //-4,-1,1,2
        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // Check if currentSum is closer to target
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    return currentSum;
                }
            }
        }
        return closestSum;
    }


}
