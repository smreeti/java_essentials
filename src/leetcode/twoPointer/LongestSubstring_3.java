package leetcode.twoPointer;

import java.util.HashSet;

public class LongestSubstring_3 {

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
