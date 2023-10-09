import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PracticeQuestion_10 {
    /*
     * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. 
     * Return the answer in any order. A mapping of digits to letters (just like on the telephone buttons) is given below. 
     * Note that 1 does not map to any letters.
     * 
     * keyboard = {
     * 2: "abc",
     * 3: "def", 
     * 4: "ghi",
     * 5: "jkl",
     * 6: "mno",
     * 7: "pqrs",
     * 8: "tuv",
     * 9: "wxyz"
     * }
     * 
     * Example: 
     * Input: digits = "23"
     * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
     * 
     * Input: digits = ""
     * Output: []
     * 
     * Input: digits = "2"
     * Output: ["a","b","c"]
     */
    private List<String> output = new LinkedList<>();
    private Map<Character, String> digitMap = new HashMap<>();
    {
        digitMap.put('2', "abc");
        digitMap.put('3', "def");
        digitMap.put('4', "ghi");
        digitMap.put('5', "jkl");
        digitMap.put('6', "mno");
        digitMap.put('7', "pqrs");
        digitMap.put('8', "tuv");
        digitMap.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        output.clear();
        if (digits.isBlank())
            return output;
        backtrack("", digits);
        return output;
    }

    public void backtrack(String combination, String next_digits) {
        if (next_digits.length() == 0)
            output.add(combination);
        else {
            for (char curChar : digitMap.get(next_digits.charAt(0)).toCharArray()) {
                backtrack(combination + curChar, next_digits.substring(1));
            }
        }
    }
}
