package leetcode.hash;

//Time Complexity O(n)
//Space Complexity O(1)
public class FirstUniqueCharacter_387 {

    public static void main(String[] args) {
        String input = "loveleetcode";

        int[] charCounts = new int[26];

        for (char c : input.toCharArray()) {
            charCounts[c - 'a']++;
        }

        int result = -1;
        for (int i = 0; i < input.length(); i++) {
            if (charCounts[input.charAt(i) - 'a'] == 1) {
                result = i;
                break;
            }
        }
        System.out.println(result);

//
//        Map<Character, Integer> map = new LinkedHashMap<>();
//
//        // Count frequency
//        for (char c : s.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        // Find first unique character
//        for (char c : map.keySet()) {
//            if (map.get(c) == 1) {
//                return s.indexOf(c);
//            }
//        }
//
    }
}
