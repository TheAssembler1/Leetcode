/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        String finalString = "";

        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);

            if(currentChar > 64 && currentChar < 91)
                currentChar += 32;

            if((currentChar > 96 && currentChar < 123) || (currentChar > 47 && currentChar < 58))
                finalString += Character.toString(currentChar);
        }

        for(int i = 0; i < finalString.length() / 2; i++){
            if(finalString.charAt(i) != finalString.charAt(finalString.length() - i - 1))
                return false;
        }

        return true;
    }
}
// @lc code=end

