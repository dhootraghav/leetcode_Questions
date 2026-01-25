/*
1493. Longest Subarray of 1's After Deleting One Element
Given a binary array nums, you should delete one element from it.
Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray. */

class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0, zeros = 0, best = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) zeros++;

            while (zeros > 1) {
                if (nums[l] == 0) zeros--;
                l++;
            }
            best = Math.max(best, i - l);
        }
        return best;
    }
}
