// LeetCode 1732: Find the Highest Altitude
// https://leetcode.com/problems/find-the-highest-altitude/


class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int max=0;
        for(int num:gain)
        {
            sum+=num;
            max=Math.max(max,sum);
        }
        return max;
    }
}