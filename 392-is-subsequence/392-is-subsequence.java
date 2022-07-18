class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length() < s.length())
            return false;
        for(int i = 0, stringPointer = 0; 
            i < s.length(); 
            i++, stringPointer++){
            
            while(s.charAt(i) != t.charAt(stringPointer)){
                stringPointer++;
                
                if(stringPointer >= t.length())
                    return false;
            }
            
            if(stringPointer + 1 >= t.length() && i + 1 < s.length())
                return false;
        }
        
        return true;
    }
}