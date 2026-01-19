/*
283. Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array. */

class Solution {
    public void moveZeroes(int[] nums) {
        int write = 0;
        for(int read = 0;read < nums.length;read++){
            if(nums[read] != 0){
                nums[write++] = nums[read];
            }
        }
        while(write < nums.length){
            nums[write++] = 0;
        }
    }
}
