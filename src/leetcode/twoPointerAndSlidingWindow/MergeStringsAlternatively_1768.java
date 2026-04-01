package leetcode.twoPointerAndSlidingWindow;

/*
* You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q
merged: a p b q c   d
* */
public class MergeStringsAlternatively_1768 {

    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";

        int n = Math.max(word1.length(), word2.length());
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i < word1.length()) {
                stringBuilder.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                stringBuilder.append(word2.charAt(i));
            }
        }

        System.out.println( stringBuilder);

//        StringBuilder sb = new StringBuilder();
//        int i = 0, j = 0;
//
//        while (i < word1.length() || j < word2.length()) {
//            if (i < word1.length()) sb.append(word1.charAt(i++));
//            if (j < word2.length()) sb.append(word2.charAt(j++));
//        }
//
//        return sb.toString();

    }
}
