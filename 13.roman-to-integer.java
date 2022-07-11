/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>(){{
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }};

        int finalNumber = 0;
        for(int i = 0; i < s.length(); i++){
            int value = map.get(Character.toString(s.charAt(i)));

            if(i + 1 < s.length() && value < map.get(Character.toString(s.charAt(i + 1))) )
                finalNumber -= value;
            else 
                finalNumber += value;
        }

        return finalNumber;
    }
}
// @lc code=end

