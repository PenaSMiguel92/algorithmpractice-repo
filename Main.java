import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PracticeQuestion_1 pq1 = new PracticeQuestion_1();
        System.out.println(pq1.findMissingNumber(new int[] { 3, 7, 1, 2, 8, 4, 5 }));
        System.out.println(pq1.findMissingNumber(new int[] { 13, 3, 7, 11, 4, 6, 2, 10, 9, 5, 8, 1 }));
        
        PracticeQuestion_2 pq2 = new PracticeQuestion_2();
        System.out.println(Arrays.toString(pq2.rotateArray(new int[] { 1, 2, 3, 4, 5 }, 2)));
        System.out.println(Arrays.toString(pq2.rotateArray(new int[] { 4, 5, 6, 7 }, 4)));
        
        PracticeQuestion_3 pq3 = new PracticeQuestion_3();
        System.out.println(pq3.findLength("abcabcbb"));
        System.out.println(pq3.findLength("acccabdefcaebcafcbdad"));
        
        PracticeQuestion_4 pq4 = new PracticeQuestion_4();
        System.out.println(Arrays.toString(pq4.findUniqueSum(new int[] { 2, 7, 11, 5 }, 9)));
        System.out.println(Arrays.toString(pq4.findUniqueSum(new int[] { 2, 11, 15, 5, 7 }, 9)));

        PracticeQuestion_5 pq5 = new PracticeQuestion_5();
        char[] arr1 = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        char[] arr2 = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        char[] arr3 = { 'a' };
        System.out.print(pq5.compressString(arr1));
        System.out.println(Arrays.toString(arr1));
        System.out.print(pq5.compressString(arr2));
        System.out.println(Arrays.toString(arr2));
        System.out.print(pq5.compressString(arr3));
        System.out.println(Arrays.toString(arr3));
        PracticeQuestion_6 pq6 = new PracticeQuestion_6();
        System.out.println(pq6.decodeString("3[a]2[bc]"));
        System.out.println(pq6.decodeString("3[a2[c]]"));
        System.out.println(pq6.decodeString("2[abc]3[cd]ef"));

        PracticeQuestion_7 pq7 = new PracticeQuestion_7();
        System.out.println(pq7.closeStrings("abc", "bca"));
        System.out.println(pq7.closeStrings("a", "aa"));
        System.out.println(pq7.closeStrings("cabbba", "abbccc"));
        
        PracticeQuestion_8 pq8 = new PracticeQuestion_8();
        System.out.println(pq8.predictPartyVictory("RD"));
        System.out.println(pq8.predictPartyVictory("RDD"));
        System.out.println(pq8.predictPartyVictory("DRRDRDRDRDDRDRDR"));
        System.out.println(pq8.predictPartyVictory("DDRRR"));
        
        PracticeQuestion_9 pq9 = new PracticeQuestion_9();
        System.out.println(pq9.findPeakElement(new int[] { 1, 2, 3, 1 }));
        System.out.println(pq9.findPeakElement(new int[] { 1, 2, 1, 3, 5, 6, 4 }));
        System.out.println(pq9.findPeakElement(new int[] { 1, 1, 1, 1 }));
        System.out.println(pq9.findPeakElement(new int[] { 2, 1 }));
        
        PracticeQuestion_10 pq10 = new PracticeQuestion_10();
        System.out.println(pq10.letterCombinations("23"));
    }
}
