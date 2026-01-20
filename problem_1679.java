/*
1679. Max Number of K-Sum Pairs
ou are given an integer array nums and an integer k.
In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
Return the maximum number of operations you can perform on the array. */

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        int count = 0;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == k) {
                count++;
                i++;
                j--;
            } 
            else if (sum < k) {
                i++;
            } 
            else {
                j--;
            }
        }
        return count;
    }
}
