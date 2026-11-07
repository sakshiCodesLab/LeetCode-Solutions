// LeetCode 771: Jewels and Stones
// https://leetcode.com/problems/jewels-and-stones/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char ch: stones.toCharArray())
        {
            if(jewels.indexOf(ch)!=-1)
            {
                count++;
            }
        }
        return count;
    }
}


