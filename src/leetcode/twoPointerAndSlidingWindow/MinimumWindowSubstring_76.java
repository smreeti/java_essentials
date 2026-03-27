package leetcode.twoPointerAndSlidingWindow;

import java.util.HashMap;

/*
* Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

Example 1:
Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
Example 3:

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string
*
* */
public class MinimumWindowSubstring_76 {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

//        if (s.length() < t.length()) return "";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int matched = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char rChar = s.charAt(right);

            if (map.containsKey(rChar)) {
                map.put(rChar, map.get(rChar) - 1);

                if (map.get(rChar) >= 0) {
                    matched++;
                }
            }

            while (matched == t.length()) {

                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char lChar = s.charAt(left);

                if (map.containsKey(lChar)) {
                    map.put(lChar, map.get(lChar) + 1);

                    if (map.get(lChar) > 0) {
                        matched--;
                    }
                }

                left++;
            }
        }

        String result = minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);

        System.out.println(result);


    }
}
