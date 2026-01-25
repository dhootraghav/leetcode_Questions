/*
1732. Find the Highest Altitude
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point. */

class Solution {
    public int largestAltitude(int[] gain) {
        int max_point = 0, y = 0;
        for(int i = 0;i<gain.length;i++){
            y += gain[i];
            max_point = Math.max(max_point,y);
        }
        return max_point;
    }
}