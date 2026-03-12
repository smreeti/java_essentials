package leetcode.twoPointer;

public class MostWater_11 {

    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

            maxArea = Math.max(area, maxArea);

        }

        System.out.println(maxArea);
    }
}
