// LeetCode 136: Single Number
// https://leetcode.com/problems/single-number/

class Solution {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }
}
