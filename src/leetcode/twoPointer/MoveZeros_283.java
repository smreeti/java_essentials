package leetcode.twoPointer;

import java.util.Arrays;

public class MoveZeros_283 {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        int lastNonZeroFoundAt  = 0;

        // Step 1: Move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i];
                lastNonZeroFoundAt ++;
            }
        }

        // Step 2: Fill the remaining positions with zeros
        for (int i = lastNonZeroFoundAt ; i < nums.length; i++) {
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));

    }
}
