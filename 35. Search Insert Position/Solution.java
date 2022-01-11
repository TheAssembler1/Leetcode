//LINK::https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int beg = 0;
        int end = nums.length - 1;
        int mid = beg + (end - beg) / 2;
    
        while(beg <= end){
            mid = beg + (end - beg) / 2;
            int midNum = nums[mid];
            
            if(midNum == target)
                return mid;
            else if(midNum < target)
                beg = mid + 1;
            else
                end = mid - 1;
            
        }
        
        if(beg > end)
            return beg;
        
        return end;
    }
}