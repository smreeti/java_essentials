package leetcode.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenationOfAllWords_30 {

    //Time: O(N * wordCount)
    //Space: O(wordCount)
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = new String[]{"foo", "bar"};

        List<Integer> result = new ArrayList<>();

        int wordLen = words[0].length();
        int wordCount = words.length;
        int windowLen = wordLen * wordCount;

        Map<String, Integer> wordMap = new HashMap<>();

        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i <= s.length() - windowLen; i++) {

            Map<String, Integer> seen = new HashMap<>();

            int j = 0;

            while (j < wordCount) {

                int start = i + j * wordLen;
                String word = s.substring(start, start + wordLen);

                if (!wordMap.containsKey(word)) {
                    break;
                }

                seen.put(word, seen.getOrDefault(word, 0) + 1);

                if (seen.get(word) > wordMap.get(word)) {
                    break;
                }

                j++;
            }

            if (j == wordCount) {
                result.add(i);
            }
        }

        System.out.println(result);
    }
}
