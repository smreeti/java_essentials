package leetcode.hash;

import java.util.*;

/*
* Given an array of strings strs, group the anagrams together. You can return the answer in any order.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:
There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:

Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]

 */
public class GroupAnagrams_49 {

    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        Map<String, List> ansMap = new HashMap<>();

        /*Time: O(n * k), Space: O(n * k)*/
        for (String s: strs) {
            int[] count = new int[26];

            for (char c: s.toCharArray()) {
                count[c - 'a'] ++;
            }

            // build a unique key from counts
            StringBuilder keyBuilder = new StringBuilder();
            for (int num : count) {
                keyBuilder.append(num).append('#');
            }
            String key = keyBuilder.toString();

            if(!ansMap.containsKey(key)) {
                ansMap.put(key, new ArrayList<>());
            }

            ansMap.get(key).add(s);

            //ansMap.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        System.out.println(new ArrayList<>(ansMap.values()));

    }
}
