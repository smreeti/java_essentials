package leetcode.twoPointerAndSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum_18 {

    public static void main(String[] args) {

        List<List<Integer>> result = new ArrayList<>();

        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;

//        if (nums == null || nums.length < 4) return result;

        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {

            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < n - 2; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {

                        int left = i + 1;
                        int right = n - 1;

                        while (left < right) {
                            int sum = nums[i] + nums[j] + nums[left] + nums[right];

                            if (sum > target) {
                                right--;
                            } else if (sum < target) {
                                left++;
                            } else {

                                result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right])));

                                while (left < right && nums[left] == nums[left + 1]) {
                                    left++;
                                }

                                while (left < right && nums[right] == nums[right - 1]) {
                                    right--;
                                }

                                left++;
                                right--;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }
}
