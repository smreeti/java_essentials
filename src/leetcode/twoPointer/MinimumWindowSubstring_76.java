package leetcode.twoPointer;

import java.util.HashMap;

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
