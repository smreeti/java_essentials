package leetcode.twoPointerAndSlidingWindow;

/*
*
* You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.

Example 1:
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
Example 2:

Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
* */
//todo
public class LongestRepeatingCharReplacement_424 {

    /*
    * Time: O(n)
      Space: O(1) (26 characters)*/
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;

        int[] count = new int[26];   // frequency of each uppercase letter
        int left = 0;
        int maxFreq = 0;             // highest frequency in current window
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'A';
            count[index]++;

            maxFreq = Math.max(maxFreq, count[index]);

            // If more than k replacements are needed, shrink window
            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
    }
}