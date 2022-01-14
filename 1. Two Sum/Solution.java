//LINK::https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(target - nums[i]))
                return new int[] {i, hashMap.get(target - nums[i])};
            hashMap.put(nums[i], i);
        }
        
        return null;
    }
}