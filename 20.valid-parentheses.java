/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
import java.util.Stack;  
class Solution {
    public boolean isValid(String s) {
        String[] validStrings = {"()", "{}", "[]"};


        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty()){
                char currentChar = s.charAt(i);

                if(currentChar != '(' && currentChar != '{' && currentChar != '[')
                    return false;

                stack.push(currentChar);
            }else{
                char currentChar = s.charAt(i);

                if(currentChar == '(' || currentChar == '{' || currentChar == '[')
                    stack.push(currentChar);
                else{
                    String currentString = Character.toString(stack.pop()) + Character.toString(s.charAt(i));

                    if(currentString.compareTo("()") != 0 && currentString.compareTo("{}") != 0 && currentString.compareTo("[]") != 0)
                        return false;
                }
            }
        }

        if(!stack.isEmpty())
            return false;

        return true;
    }
}
// @lc code=end

