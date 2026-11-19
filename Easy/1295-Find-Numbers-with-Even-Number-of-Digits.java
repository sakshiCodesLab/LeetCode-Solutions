// LeetCode 1295: Find Numbers with Even Number of Digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int n:nums)
        {
            if(String.valueOf(n).length()%2==0)
            {
                count++;
            }
        }
    return count;
    }
}