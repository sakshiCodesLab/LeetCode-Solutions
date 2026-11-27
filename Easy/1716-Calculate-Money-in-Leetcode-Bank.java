// LeetCode 1716: Calculate Money in Leetcode Bank
// https://leetcode.com/problems/calculate-money-in-leetcode-bank/

class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int monday=1;
        for(int i=0;i<n;i++)
        {
            sum+=monday+(i%7);
            if(i%7==6)
            {
                monday++;
            }
        }
        return sum;
    }
}