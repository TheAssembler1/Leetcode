class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, ArrayList<Integer>> map1 = new HashMap<>();
        HashMap<Character, ArrayList<Integer>> map2 = new HashMap<>();
        Integer currentChar = 0;
        
        if(s.length() != t.length())
            return false;
        
        for(int i = 0; i < s.length(); i++){
            ArrayList<Integer> list1;
            ArrayList<Integer> list2;
            
            if(!map1.containsKey(s.charAt(i)) && !map2.containsKey(t.charAt(i))){
                list1 = new ArrayList<Integer>(Arrays.asList(i));
                map1.put(s.charAt(i), list1);
                
                list2 = new ArrayList<Integer>(Arrays.asList(i));
                map2.put(t.charAt(i), list2);
            }else if(map1.containsKey(s.charAt(i)) && map2.containsKey(t.charAt(i))){    
                list1 = map1.get(s.charAt(i));
                list1.add(i);
                
                list2 = map2.get(t.charAt(i));
                list2.add(i);
            }else
                return false;
            
            if(!list1.equals(list2))
                return false;
        }
        
        return true;
    }
}