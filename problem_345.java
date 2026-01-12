/*
345. Reverse Vowels of a StringGiven a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once. */

class Solution {
    public String reverseVowels(String s) {
        String vow = "", vow_condition = "aeiouAEIOU", copy="";
        int x = 0;
        for(int i = 0;i<s.length();i++){
            if(vow_condition.indexOf(s.charAt(i)) > -1){
                vow = s.charAt(i) + vow;
            }
        }
        for(int i = 0;i<s.length();i++){
            if(vow_condition.indexOf(s.charAt(i)) > -1){
                copy += vow.charAt(x++);
            }
            else{
                copy += s.charAt(i);
            }
        }
        return copy;
    }
}