package leetcode.geeksforgeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
* */
public class MajorityElement_229 {

    public static void main(String[] args) {
        int[] input = {3, 4, 2, 2, 1, 2, 3, 3};
        int k = 4;

        int target = input.length / k;

        List<Integer> ansList = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            hashMap.put(input[i], hashMap.getOrDefault(input[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            if (map.getValue() > target) {
                ansList.add(map.getKey());
            }
        }

        System.out.println(ansList);

    }
}
