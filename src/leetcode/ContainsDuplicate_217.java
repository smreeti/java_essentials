package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/*
* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
* */
public class ContainsDuplicate_217 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the total number of inputs: ");
        int numLength = Integer.parseInt(bufferedReader.readLine());
        System.out.println("\n");

        int[] numbers = new int[numLength];

        for (int i = 0; i < numLength; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = Integer.parseInt(bufferedReader.readLine());
        }

        //Time: O(n) and Space: O(n)
        HashSet<Integer> numList = new HashSet<>();
        boolean hasDuplicates = false;

        for (int i= 0; i < numbers.length; i++) {
            if(numList.contains(numbers[i])) {
              hasDuplicates = true;
              break;
            }

            numList.add(numbers[i]);
        }

        System.out.println("Has duplicates : " + hasDuplicates);
    }

}
