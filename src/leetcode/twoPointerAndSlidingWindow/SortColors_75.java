package leetcode.twoPointerAndSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
*
Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]
*
* */
public class SortColors_75 {
    public static void main(String[] args) {
        sortColors();
    }

    public static void sortColors() {
        int[] nums = new int[]{1,2,0};
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static class EncodeDecode_271 {

        public static void main(String[] args) {

            //might break when there are special chars in string too - USE LENGTH PREFIX METHOD
    //        String encoded = encode(Arrays.asList("Hello", "World"));
    //        List<String> decoded = decode(encoded);


            String encoded = encode1(Arrays.asList("Hello", "Worlds"));
            List<String> decoded = decode1(encoded);

            System.out.println(encoded);
            System.out.println(decoded);
        }

        public static String encode1(List<String> strs) {
            StringBuilder stringBuilder = new StringBuilder();

            for (String s : strs) {
                stringBuilder.append(s.length()).append("#").append(s);
            }

            return stringBuilder.toString();
        }

        public static List<String> decode1(String encoded) { //5#Hello5#World
            List<String> result = new ArrayList<>();

            int i = 0;

            while (i < encoded.length()) {
                int j = encoded.indexOf("#", i);
                int length = Integer.parseInt(encoded.substring(i, j));

                j++;
                result.add(encoded.substring(j, j + length));

                i = j + length;
            }

            return result;
        }


        public static String encode(List<String> strs) {
            if (strs.isEmpty()) {
                return Character.toString((char) 258);
            }

            String separator = Character.toString((char) 257);

            StringBuilder stringBuilder = new StringBuilder();

            for (String s : strs) {
                stringBuilder.append(s);
                stringBuilder.append(separator);
            }

            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            return stringBuilder.toString();
        }

        public static List<String> decode(String s) {
            String separator = Character.toString((char) 257);
            /*
            * -1 tells Java: Split as much as possible and keep all trailing empty strings. So this:

            String s = "a,b,,";
            String separator = ",";
            Arrays.asList(s.split(separator, -1));
            results in: ["a", "b", "", ""]*/

            return Arrays.asList(s.split(separator, -1));
        }


    }
}
