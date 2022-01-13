//LINK::https://leetcode.com/problems/reverse-string/

class Solution {
    public void reverseString(char[] s) {
        int mid = (s.length / 2);
        if(s.length % 2 == 0) mid--;

        for(int i = 0; i <= mid; i++){
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }       
    }
}