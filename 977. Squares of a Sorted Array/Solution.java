//LINK::https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {
    public int[] sortedSquares(int[] nums) {
    	int left = 0;
    	int right = nums.length - 1;

    	int[] newNums = new int[nums.length];

    	while(left <= right){
    		if(Math.abs(nums[left]) > Math.abs(nums[right])){
    			newNums[right - left] = nums[left] * nums[left];
    			left++;
    		}else{
    			newNums[right - left] = nums[right] * nums[right];
    			right--;
    		}
    	}

    	return newNums;
    }
}