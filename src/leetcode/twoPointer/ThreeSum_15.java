package leetcode.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        //-4,-1,-1,0,1,2
        Arrays.sort(nums);

        List<List<Integer>> numList = new ArrayList<>();

        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {

                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];

                    if (sum == 0) {
                        numList.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        System.out.println(numList);
    }
}
