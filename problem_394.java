/*394. Decode String
Given an encoded string, return its decoded string.
The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4]. */

class Solution {
    public String decodeString(String s) {
        Deque<Integer> numStack = new ArrayDeque<>();
        Deque<StringBuilder> strStack = new ArrayDeque<>();
        StringBuilder curr = new StringBuilder();
        int k = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');       
            } else if (ch == '[') {
                numStack.push(k);
                strStack.push(curr);
                k = 0;
                curr = new StringBuilder();
            } else if (ch == ']') {
                int repeat = numStack.pop();
                StringBuilder prev = strStack.pop();
                for (int i = 0; i < repeat; i++) {
                    prev.append(curr);
                }
                curr = prev;
            } else {
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}
