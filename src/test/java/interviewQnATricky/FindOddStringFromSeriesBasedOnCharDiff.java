package interviewQnATricky;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * WAP to find out the odd string from a series of strings based on their character difference.
 *
 * Example 1: The series is ["ABC", "BCD", "CDE", "DEG"]. The difference of characters of the string
 * "ABC" is [+1, +1]. It's calculated as B-C=+1, C-B=+1. Similarly, the other differences are [+1, +1],
 * [+1, +1], [+1, +2]. So, the last string "DEG" is odd.
 *
 * Example 2: The series is ["ACB", "BCD", "CED", "DFE"]. The odd string is BCD for being difference
 * [+1, +1] which doesn't match with other differences [+2, -1].
 *
 * Example 3: The series is ["YXZ", "QPR", "JIK", "ASI"]. The odd string is ASI for being difference
 * [+18, -10] which doesn't match with other differences [-1, +2].
 *
 * Example 4: The series is ["ZXW", "WUS", "TRP", "OMK"]. The odd string is ZXW for being difference
 * [-2, -1] which doesn't match with other differences [-2, -2].
 */

public class FindOddStringFromSeriesBasedOnCharDiff {

    public static void main(String[] args) {
        List<String> strList1 = Arrays.asList("ABC", "BCD", "CDE", "DEG");
        List<String> strList2 = Arrays.asList("ACB", "BCD", "CED", "DFE");
        List<String> strList3 = Arrays.asList("YXZ", "QPR", "JIK", "ASI");
        List<String> strList4 = Arrays.asList("ZXW", "WUS", "TRP", "OMK");

        System.out.println("The odd string is : " + findOdd(strList1));  // returns DEG
        System.out.println("The odd string is : " + findOdd(strList2));  // returns BCD
        System.out.println("The odd string is : " + findOdd(strList3));  // returns ASI
        System.out.println("The odd string is : " + findOdd(strList4));  // returns ZXW
    }

    public static String findOdd(List<String> series) {
        List<List<Integer>> outerList = new ArrayList<>();
        int oddIndex = 0;

        for (String str : series) {
            int strlen = str.length();
            List<Integer> innerList = new ArrayList<>();

            for (int i = 0; i < strlen - 1; i++) {
                int diff = (int) str.charAt(i + 1) - (int) str.charAt(i);
                innerList.add(diff);
            }

            outerList.add(innerList);
        }

        for (int i = 1; i < outerList.size(); i++) {
            if (!outerList.get(0).equals(outerList.get(i))) {
                oddIndex = i;
                break;
            }
        }

        if (oddIndex == 1) {
            if (outerList.get(0).equals(outerList.get(2)))
                oddIndex = 1;
            else
                oddIndex = 0;
        }

        return series.get(oddIndex);

    }

}
