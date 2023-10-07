import java.util.HashSet;
import java.util.Set;

public class PracticeQuestion_3 {
	/*
	 * Prompt: Write an algorithm that takes a string and returns 
	 * 		the length of the longest substring without repeating characters.
	 * 
	 * Example:
	 * 		Input: "abcabcbb"
	 * 		Output: 3 (The answer is "abc", with the length of 3.)
	 * 
	 * 		Input: "acccabdefcaebcafcbdad"
	 * 		Output: 6 (The answer is "cabdef", with the length of 6.)
	 */
	public int findLength(String word) {
		Set<Character> uniqueChars = new HashSet<>();
		char[] charArr = word.toCharArray();
		int maxLength = Integer.MIN_VALUE;
		for (int i = 0; i < charArr.length; i++) {
			if (!uniqueChars.add(charArr[i])) {
				if (uniqueChars.size() > maxLength)
					maxLength = uniqueChars.size();
				uniqueChars.clear();
			}
				
		}

		return maxLength;
	}
}
