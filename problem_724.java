/*
724. Find Pivot Index
Given an array of integers nums, calculate the pivot index of this array.
The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
Return the leftmost pivot index. If no such index exists, return -1. */

class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int x : nums){
            total += x;
        } 
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            int right = total - left - nums[i];
            if (left == right){
                return i;
            } 
            left += nums[i];
        }
        return -1;
    }
}
