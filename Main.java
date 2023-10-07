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
        PracticeQuestion_6 pq6 = new PracticeQuestion_6();
        PracticeQuestion_7 pq7 = new PracticeQuestion_7();
        

    }
}
