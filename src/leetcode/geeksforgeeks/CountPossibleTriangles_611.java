package leetcode.geeksforgeeks;

import java.util.Arrays;

/*
* Given an array of positive integers arr[], count the number of triangles that can be formed with three different array elements as three sides of triangles.

Note: The sum of any two sides of a triangle must be greater than the third side.

Examples:

Input: arr[] = [4, 6, 3, 7]
Output: 3
Explanation: There are three triangles possible [3, 4, 6], [4, 6, 7] and [3, 6, 7].
Note that [3, 4, 7] is not a possible triangle.

Input: arr[] = [10, 21, 22, 100, 101, 200, 300]
Output: 6
Explanation: There can be 6 possible triangles:
[10, 21, 22], [21, 100, 101], [22, 100, 101], [10, 100, 101], [100, 101, 200] and [101, 200, 300]

Input: arr[] = [1, 2, 3]
Output: 0
Examples: No triangles are possible.
* */
public class CountPossibleTriangles_611 {

    public static int countTriangles(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int count = 0;

        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;

            while (left < right) {
                if (arr[left] + arr[right] > arr[i]) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = {10, 21, 22, 100, 101, 200, 300};
        System.out.println(countTriangles(arr)); // Output: 3
    }
}
