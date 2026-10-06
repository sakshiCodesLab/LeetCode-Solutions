// LeetCode 557: Reverse Words in a String III
// https://leetcode.com/problems/reverse-words-in-a-string III/

class Solution {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            result.append(reversed.reverse().append(" "));
        }
        return result.toString().trim();
    }
}
