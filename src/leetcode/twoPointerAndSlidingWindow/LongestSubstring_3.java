package leetcode.twoPointerAndSlidingWindow;

import java.util.HashSet;

/*
* Given a string s, find the length of the longest substring without duplicate characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*
* */
public class LongestSubstring_3 {

    //So the formula for inclusive range length is always: end - start + 1
    //Sliding Window + 2 pointer
    public static void main(String[] args) {

        String input = "abcabcbb";

        int left = 0;
        int longestSub = 0;

        HashSet<Character> hashSet = new HashSet<>();

        for (int right = 0; right < input.length(); right++) {
            while (hashSet.contains(input.charAt(right))) {
                hashSet.remove(input.charAt(left));
                left++;
            }

            hashSet.add(input.charAt(right));
            longestSub = Math.max(longestSub, right - left + 1);
        }

        System.out.println(longestSub);
    }

}
