/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int currentString = 0;
        int currentChar = 0;

        String finalString = "";

        if(strs.length <= 1)
            return strs[0];

        while(currentChar < strs[currentString].length() && currentChar < strs[currentString + 1].length() &&
              strs[currentString].charAt(currentChar) == strs[currentString + 1].charAt(currentChar)){

            currentString++;

            if(currentString == strs.length - 1){
                currentString = 0;
                currentChar++;
            }
        }

        for(int i = 0; i < currentChar; i++){
            finalString += strs[0].charAt(i);
        }

        return finalString;
    }
}
// @lc code=end

