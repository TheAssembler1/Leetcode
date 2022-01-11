//LINK::https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < numbers.length; i++){
        	if(hashMap.containsKey(target - numbers[i]))
        		return new int[] {hashMap.get(target - numbers[i]), i + 1};
        	hashMap.put(numbers[i], i + 1);
        }

        return new int[] {0, 0};
    }
}