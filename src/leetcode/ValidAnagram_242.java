package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

/*
* Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

 */
public class ValidAnagram_242 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first string: ");
        String s = bufferedReader.readLine();

        System.out.print("Enter second string: ");
        String t = bufferedReader.readLine();

        // Remove spaces & normalize case
        s = s.replaceAll("\\s+", "").toLowerCase();
        t = t.replaceAll("\\s+", "").toLowerCase();

        if (s.length() != t.length()) {
            System.out.println("Not an anagram");
            return;
        }

        //Option 1
//        char[] sArr = s.toCharArray();
//        char[] tArr = t.toCharArray();
//
//        Arrays.sort(sArr);
//        Arrays.sort(tArr);
//
//        boolean isAnagram = Arrays.equals(sArr, tArr);
//
//        System.out.println(isAnagram ? "Anagram" : "Not an anagram");


        //Time: O(n) and Space: O(1)
        //Option 2 This will throw ArrayIndexOutOfBoundsException if input contains anything outside a–z.
        int[] charCounts = new int[26];
        boolean isAnagram = true;

        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a'] ++;
            charCounts[t.charAt(i) - 'a'] --;
        }

        for (int count : charCounts) {
            if (count != 0) {
                isAnagram = false;
                break;
            }
        }

        System.out.println(isAnagram ? "Anagram" : "Not an anagram");

    }
}
