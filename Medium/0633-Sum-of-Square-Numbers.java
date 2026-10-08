// LeetCode 633: Sum of Square Numbers
// https://leetcode.com/problems/sum-of-square-numbers/

class Solution {
    public boolean judgeSquareSum(int c) {
        long a=0;
        long b=(long)Math.sqrt(c);
        while(a<=b)
        {
            long sum=a*a+b*b;
            if(sum==c)
            {
                return true;
            }
            else if(sum<c)
            {
                a++;
            }
            else{
                b--;
            }
        }
        return false;
    }
}