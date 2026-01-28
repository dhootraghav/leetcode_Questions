/*
1207. Unique Number of Occurrences
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise. */

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int item : arr){
            freq.put(item, freq.getOrDefault(item,0)+1);
        }
        Set<Integer> unique = new HashSet<>();
        for(int count : freq.values()){
            if(!unique.add(count)) return false;
        }
        return true;
    }
}