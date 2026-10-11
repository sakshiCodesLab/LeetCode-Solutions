// LeetCode 434: Number of Segments in a String
// https://leetcode.com/problems/number-of-segments-in-a-string/

class Solution {
    public int countSegments(String s) {
        String[] words=s.trim().split("\\s+");
        if(s.trim().isEmpty())
        {
            return 0;
        }
        return words.length;
    }
}