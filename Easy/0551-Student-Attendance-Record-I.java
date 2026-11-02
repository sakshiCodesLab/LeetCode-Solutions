// LeetCode 551: Student Attendance Record I
// https://leetcode.com/problems/student-attendance-record-I/

class Solution {
    public boolean checkRecord(String s) {
        if(s.contains("LLL") || s.indexOf('A')!=s.lastIndexOf('A'))
        {
            return false;
        }
        return true;
    }
}