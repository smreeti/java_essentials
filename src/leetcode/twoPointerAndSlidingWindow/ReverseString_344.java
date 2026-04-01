package leetcode.twoPointerAndSlidingWindow;

import java.util.Arrays;

/*
* Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*
* */
public class ReverseString_344 {

    public static void main(String[] args) {
        String[] input = {"h", "e", "l", "l", "o"};

        int left = 0;
        int right = input.length - 1;

        while (left < right) {
            String temp = input[left];
            input[left] = input[right];
            input[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(input));
    }

}
