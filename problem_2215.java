/*
2215. Find the Difference of Two Arrays
Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
    answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
    answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order. */

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int item : nums1) s1.add(item);
        for(int item : nums2) s2.add(item);
        
        List<Integer> onlyin1 = new ArrayList<>();
        for(int item : s1){
            if(!s2.contains(item)) onlyin1.add(item);
        }
        List<Integer> onlyin2 = new ArrayList<>();
        for(int item : s2){
            if(!s1.contains(item)) onlyin2.add(item);
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(onlyin1);
        result.add(onlyin2);
        return result;
    }
}