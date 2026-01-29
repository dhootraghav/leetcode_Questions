/*
1657. Determine if Two Strings Are Close
Two strings are considered close if you can attain one from the other using the following operations:
    Operation 1: Swap any two existing characters.
        For example, abcde -> aecdb
    Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
        For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
You can use the operations on either string as many times as necessary.
Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise. */

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for (int i = 0; i < word1.length(); i++) c1[word1.charAt(i) - 'a']++;
        for (int i = 0; i < word2.length(); i++) c2[word2.charAt(i) - 'a']++;
        for (int i = 0; i < 26; i++) {
            if ((c1[i] == 0) != (c2[i] == 0)) return false;
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
}
