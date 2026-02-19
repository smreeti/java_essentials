package leetcode;

/*
* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
* */
public class ValidPalindrome_125 {

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
//        String input = "race a car";

        //Time: O(n), Space: O(n)
        System.out.println("Palindrome:: " + isPalindrome_1(input));

        //Two-pointer concept -> Time: O(n), Space: O(1)
        System.out.println("Palindrome:: " + isPalindrome_2(input));
    }

    private static boolean isPalindrome_1(String input) {
        input = input.toLowerCase();
        String filtered = input.replaceAll("[^a-z0-9]", "");

        char[] charArray = filtered.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int j = charArray.length - 1; j >= 0; j--) {
            stringBuilder.append(charArray[j]);
        }

        String reverse = stringBuilder.toString();
        return filtered.equals(reverse);
    }

    private static boolean isPalindrome_2(String input) {
//        String input = "A man, a plan, a canal: Panama";

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(input.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(input.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

}
