// LeetCode 258: Add Digits
// https://leetcode.com/problems/add-digits/

class Solution {
    public int addDigits(int num) {
        while(num>=10)
        {
            int sum=0;
            while(num>0)
            {
                sum=sum+num%10;
                num=num/10;
            }
            num=sum;
        }
        return num;
    }
}