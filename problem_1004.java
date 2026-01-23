/*
1004. Max Consecutive Ones III
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's. */

class Solution {
    public int longestOnes(int[] nums, int k) {
        int count_zero = 0, max = 0, count_max = 0, remaining_length = nums.length;
        for(int i = 0;i<nums.length;i++,remaining_length--){
            for(int j = i;j<nums.length;j++){
                if(nums[j] == 0 && count_zero<k){
                    count_max++;
                    count_zero++;
                }
                else if(nums[j] == 1){
                    count_max++;
                }
                else{
                    if(max < count_max){
                        max = count_max;
                    }
                    count_zero = 0;
                    count_max = 0;
                    break;
                }
                if(max < count_max){
                        max = count_max;
                }
            }
            if(max >= remaining_length){
                break;
            }
        }
        return max;
    }
}