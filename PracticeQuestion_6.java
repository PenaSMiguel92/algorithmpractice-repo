import java.util.ArrayDeque;
import java.util.Deque;

public class PracticeQuestion_6 {
    /*
     * Given an encoded string, return its decoded string. The encoding rule is: k[encoded_string], 
     * where the encoded_string inside the square brackets is being repeated exactly k times. 
     * Note that k is guaranteed to be a positive integer. You may assume that the input string is always valid; 
     * there are no extra white spaces, square brackets are well-formed, etc. 
     * Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. 
     * For example, there will not be input like 3a or 2[4]. The test cases are generated so that the length of the output will never exceed 105.
     * 
     * Example: 
     * Input: s = "3[a]2[bc]"
     * Output: "aaabcbc"
     * 
     * Input: s = "3[a2[c]]"
     * Output: "accaccacc"
     * 
     * Input: s = "2[abc]3[cd]ef"
     * Output: "abcabccdcdcdef"
     */

    public String decodeString(String encodedString) {
        Deque<Character> charDeque = new ArrayDeque<>();
        char[] charArr = encodedString.toCharArray();
        int n = charArr.length;
        for (int i = 0; i < n; i++) {
            if (charArr[i] != ']') {
                charDeque.push(charArr[i]);
            } else {
                StringBuilder temp = new StringBuilder();
                while (charDeque.peek() != '[') {
                    temp.append(charDeque.pop());
                }
                charDeque.pop();
                StringBuilder num = new StringBuilder();
                while (charDeque.size() > 0 && Character.isDigit(charDeque.peek())) {
                    num.append(charDeque.pop());
                }
                temp = temp.reverse();
                int val = Integer.parseInt(num.reverse().toString());
                while (val-- > 0) {
                    for (int j = 0; j < temp.length(); j++) {
                        charDeque.push(temp.charAt(j));
                    }
                }
            }
        }
        char[] result = new char[charDeque.size()];
        for (int i = charDeque.size() - 1; i >= 0; i--) {
            result[i] = charDeque.pop();
        }
        return new String(result);
    }
    

}
