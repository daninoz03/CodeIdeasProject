package CodeExercisesWebsite.Challenging;

import java.util.HashSet;
import java.util.Set;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class LongestCommonSequence {

    public String findLongestCommonSequence(String s1, String s2) {

        Set<String> allCommonSequences = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    int iterator1 = i;
                    int iterator2 = j;
                    String sequence = "";
                    while (s1.charAt(iterator1) == s2.charAt(iterator2)) {
                        sequence = sequence.concat(String.valueOf(s1.charAt(iterator1)));

                        iterator1++;
                        iterator2++;

                        if (iterator1 > s1.length() - 1 || iterator2 > s2.length() - 1) {
                            break;
                        }
                    }
                    allCommonSequences.add(sequence);
                }
            }
        }
        return getLongestCommonSequenceFromSet(allCommonSequences);
    }

    private String getLongestCommonSequenceFromSet(Set<String> allCommonSequences) {
        String longestSequence = "";
        for (String sequence : allCommonSequences) {
            if (sequence.length() > longestSequence.length()) {
                longestSequence = sequence;
            }
        }
        return longestSequence;
    }

    public static void main(String[] args) {
        LongestCommonSequence longestCommonSequence = new LongestCommonSequence();


        String sample1 = "abattd";
        String sample2 = "gdgeaba";

        System.out.println(longestCommonSequence.findLongestCommonSequence(sample1, sample2));

    }
}
