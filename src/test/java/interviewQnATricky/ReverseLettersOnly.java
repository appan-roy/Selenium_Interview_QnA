package interviewQnATricky;

import java.util.*;

/**
 * <p><b>Problem Statement</b>: Write a function reverseLetters that reverses only the alphabetic characters in a string while keeping all non-alphabetic characters (digits, symbols, spaces) in their original positions.</p>
 *
 * <p><b>Input</b>: A string input containing a mix of alphabetic and non-alphabetic characters</p>
 * <p><b>Output</b>: A new string where only the alphabetic characters are reversed while non-alphabetic characters remain in place</p>
 *
 * <p><b>Examples</b>: For input string "1ab2", the function should return "1ba2"</p>
 *
 * <p><b>Constraints</b>:</p>
 * <p>1. The string may contain any character (letters, digits, special characters, spaces)</p>
 * <p>2. Only alphabetic characters (a-z, A-Z) should be reversed</p>
 * <p>3. The function should preserve the case of each letter</p>
 */
public class ReverseLettersOnly {

    public static void main(String[] args) {

        String str = "1ab2";
//        String str = "5a#1b%3c&";
//        String str = "Se %l*35e n1024i #u$m";

        System.out.println("The reverse letter string is: " + reverseLetters(str));

    }

    private static String reverseLetters(String str) {

        StringBuilder revStr = new StringBuilder();

        char[] chArr = str.toCharArray();

        Map<Integer, Character> hashMap = new HashMap<>();

        for (int i = 0; i < chArr.length; i++) {
            if ((chArr[i] >= 'A' & chArr[i] <= 'Z') | (chArr[i] >= 'a' & chArr[i] <= 'z')) {
                hashMap.put(i, chArr[i]);
            }
        }

        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(hashMap.keySet());
        Collections.sort(keyList);
        Collections.reverse(keyList);
        int keyListIndex = 0;

        for (int i = 0; i < chArr.length; i++) {
            if ((chArr[i] >= 'A' & chArr[i] <= 'Z') | (chArr[i] >= 'a' & chArr[i] <= 'z')) {
                revStr.append(hashMap.get(keyList.get(keyListIndex)));
                keyListIndex++;
            } else {
                revStr.append(chArr[i]);
            }
        }

        return revStr.toString();

    }

}
