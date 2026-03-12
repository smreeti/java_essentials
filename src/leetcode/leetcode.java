package leetcode;

import java.util.*;

public class leetcode {

    public static void main(String[] args) {

        System.out.println(isValidPalindrome());

//        System.out.println(Arrays.toString(productExceptSelf()));

//        System.out.println(Arrays.toString(topKFrequent()));

//        HashMap<String, List<String>> ansMap = groupAnagram();
//        System.out.println("Group Anagram::" + ansMap.values());

        //System.out.println("TwoSum:::" + Arrays.toString(twoSum()));

//        boolean isAnagram = isAnagram();
//        System.out.println("IsAnagram::: " + isAnagram);
    }

    public static boolean isValidPalindrome() {
        String s = "A man, a plan, a canal: Pansama";

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toUpperCase(s.charAt(left)) != Character.toUpperCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private static int[] productExceptSelf() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] answer = new int[nums.length];

        int left = 1;
        int right = 1;

        for (int i = 0; i < nums.length; i++) {
            answer[i] = left;
            left *= nums[i];
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            answer[j] *= right;
            right *= nums[j];
        }

        return answer;
    }

    private static int[] topKFrequent() {
        int[] nums = new int[]{1, 2, 4, 3, 4, 2, 3, 4, 2, 5, 4, 5, 5};
        int k = 3;

        HashMap<Integer, Integer> ansMap = new HashMap<>();
        for (int num : nums) {
            ansMap.put(num, ansMap.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(ansMap::get));

        for (int n : ansMap.keySet()) {
            queue.add(n);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = queue.poll();
        }
        return ans;
    }


    private static HashMap<String, List<String>> groupAnagram() {
        String[] strings = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

        HashMap<String, List<String>> ansMap = new HashMap<>();

        for (String s : strings) {
            int[] charCount = new int[26];

            for (char c : s.toCharArray()) {
                charCount[c - 'a']++;
            }

            StringBuilder stringBuilder = new StringBuilder();
            for (int num : charCount) {
                stringBuilder.append(num).append("#");
            }

            String key = stringBuilder.toString();

            if (ansMap.containsKey(key)) {
                ansMap.get(key).add(s);
            } else {
                ansMap.put(key, new ArrayList<>(List.of(s)));

            }
        }

        return ansMap;
    }

    private static int[] twoSum() {
        int[] nums = new int[]{15, 7, 2, 11};
        int target = 9;


        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (hashMap.containsKey(diff)) {
                return new int[]{hashMap.get(diff), i};
            }

            hashMap.put(nums[i], i);
        }

        return null;
    }

    public static boolean isAnagram() {
        String s = "cat";
        String t = "tac";

        if (s.length() != t.length()) {
            return false;
        }

        int[] charCounts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
