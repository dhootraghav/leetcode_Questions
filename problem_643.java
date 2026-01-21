/*
643. Maximum Average Subarray I
You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
 */

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long windowSum = 0; 
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        long maxSum = windowSum;
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }
        return (double) maxSum / k;
    }
}
