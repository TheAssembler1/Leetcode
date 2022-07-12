/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int currentPointer = m + n - 1;

        while(pointer2 >= 0){
            if(pointer1 >= 0 && nums1[pointer1] >= nums2[pointer2])
                nums1[currentPointer--] = nums1[pointer1--];
            else
                nums1[currentPointer--] = nums2[pointer2--];
        }
    }
}
// @lc code=end

