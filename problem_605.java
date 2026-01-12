/*
605. Can Place FlowersYou have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise. */

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int left, right, i;
        for(i=0;i<flowerbed.length && n>0;i++){
            left = (i==0)?0:flowerbed[i-1];
            right = (flowerbed.length-1>i)?flowerbed[i+1]:0;
            if(left==0 && right==0 && flowerbed[i]==0){
                flowerbed[i]=1;
                n--;
            }
        }
        return n<=0;
    }
}