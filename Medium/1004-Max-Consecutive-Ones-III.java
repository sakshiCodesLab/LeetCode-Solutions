// LeetCode 1004: Max Consecutive Ones III
// https://leetcode.com/problems/max-consecutive-ones-III/

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int zeroes=0;
        int maxLength=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==0)
            {
                zeroes++;
            }
            while(zeroes>k)
            {
                if(nums[left]==0)
                {
                    zeroes--;
                }
                left++;
            }
            int length=right-left+1;
            maxLength=Math.max(maxLength,length);

        }
        return maxLength;
    }
}