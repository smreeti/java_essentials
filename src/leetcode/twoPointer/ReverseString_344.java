package leetcode.twoPointer;

import java.util.Arrays;

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
