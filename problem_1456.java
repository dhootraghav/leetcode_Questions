/*
1456. Maximum Number of Vowels in a Substring of Given Length
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k. */

class Solution {
    public int maxVowels(String s, int k) {
        String sub_string, vow = "aeiouAEIOU";
        int max = 0, count = 0;
        for(int i = 0;i<k;i++){
            if(vow.indexOf(s.charAt(i))>-1){
                max++;
            }
        }
        count = max;
        for(int i = k;i<s.length();i++){
            if(vow.indexOf(s.charAt(i)) > -1){
                count++;
            }
            if(vow.indexOf(s.charAt(i-k))> -1){
                count--;
            }
            max = max<count? count:max;
            if(max == k){
                return max;
            }
        }
        return max;
    }
}