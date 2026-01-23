/*151. Reverse Words in a String
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space. */

class Solution {
    public String reverseWords(String s) {
        s = s.strip().replaceAll("\\s+", " ");
        String rev ="", rev_sen="";
        int i = s.length()-1;
        while(i>-1){
            while(i>-1 && s.charAt(i) != ' ' ){
                rev = String.valueOf(s.charAt(i--)) + rev;
            }
            if(i>-1){
                rev_sen += rev + " ";
            }
            else{
                rev_sen += rev;
            }
            rev = "";
            i--;
        }
        return rev_sen;
    }
}