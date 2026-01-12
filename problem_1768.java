/*
1768. Merge Strings Alternately
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string. */

class problem_1768 {
    public String mergeAlternately(String word1, String word2) {
        int max_length = word1.length()>word2.length()? word1.length() : word2.length();
        String merged="";
        for(int i = 0;i<max_length;i++){
            if(word1.length()==i){
                merged += word2.substring(i,word2.length());
                return merged;
            }
            if(word2.length()==i){
                merged += word1.substring(i,word1.length());
                return merged;
            }
            merged += String.valueOf(word1.charAt(i)) + String.valueOf(word2.charAt(i));
        }
        return merged;
    }
}