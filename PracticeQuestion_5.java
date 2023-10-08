import java.util.HashSet;
import java.util.Set;

public class PracticeQuestion_5 {
    /*
     * Given an array of characters chars, compress it using the following algorithm:
     * Begin with an empty string s. For each group of consecutive repeating characters in chars:
     * If the group's length is 1, append the character to s.
     * Otherwise, append the character followed by the group's length.
     * The compressed string s should not be returned separately, but instead, be stored in the input character array chars. 
     * Note that group lengths that are 10 or longer will be split into multiple characters in chars.
     * After you are done modifying the input array, return the new length of the array.
     * You must write an algorithm that uses only constant extra space.
     * 
     * Example: 
     * Input: chars = ["a","a","b","b","c","c","c"]
     * Output: ["a","2","b","2","c","3"]
     * 
     * Input: ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
     * Output: ["a","b","1","2"]
     * 
     * Input: ["a"]
     * Output: ["a"]
     */

    public int compressString(char[] chars) {
        if (chars.length == 1)
            return chars.length;

        Set<Character> uniqueChars = new HashSet<>();
        uniqueChars.add(chars[0]);
        char prevChar = chars[0];
        int count = 1;
        int ans = 0;
        for (int i = 1; i < chars.length; i++) {
            if (!uniqueChars.add(chars[i]))
                count++;
            else {
                prevChar = i - 1 < 0 ? chars[0] : chars[i - 1];
                chars[ans++] = prevChar;
                if (count > 1) {
                    String value = Integer.toString(count);
                    int at = 0;
                    while (at < value.length())
                        chars[ans++] = value.charAt(at++);
                }
                count = 1;
            }
        }
        if (count > 0) {
            chars[ans++] = chars[chars.length-1];
            if (count > 1) {
                    String value = Integer.toString(count);
                    int at = 0;
                    while (at < value.length())
                        chars[ans++] = value.charAt(at++);
                }
        }
        return ans;    
    }
}
