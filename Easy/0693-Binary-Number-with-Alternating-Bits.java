// LeetCode 693: Binary Number with Alternating Bits
// https://leetcode.com/problems/binary-number-with-alternating-bits/

class Solution {
    public boolean hasAlternatingBits(int n) {
          while (n > 0) {
            int bit = n % 2;
            n = n / 2;

            if (n > 0 && bit == n % 2) {
                return false;
            }
        }

        return true;
    }
}