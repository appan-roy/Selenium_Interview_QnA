package interviewQnATricky;

/**
 * <p><b>Problem Statement</b>: Write a function divisor_pair that counts the number of pairs in an array whose sum is divisible by a given number.</p>
 *
 * <p><b>Input</b>:</p>
 * <p>1. An array of integers arr</p>
 * <p>2. A divisor divisor</p>
 *
 * <p><b>Output</b>:</p>
 * <p>The count of pairs (i, j) where i < j and (arr[i] + arr[j]) is divisible by the divisor</p>
 *
 * <p><b>Example</b>:</p>
 * <p>For input array {5,9,36,74,52,31,42} and divisor 3, the function should return 7</p>
 *
 * <p><b>Constraints</b>:</p>
 * <p>1. The array will contain only positive integers</p>
 * <p>2. The divisor will be a positive integer</p>
 * <p>3. Each pair should be counted exactly once (i.e., order matters)</p>
 */
public class DivisiblePairCountArray {

    public static void main(String[] args) {

        int[] arr = {5, 9, 36, 74, 52, 31, 42};
        int divisor = 3;

//        int[] arr = {4, 9, 36, 72, 44, 80};
//        int divisor = 5;

        System.out.println("Total number of pairs which are divisible by the divisor " + divisor + " are: " + divisor_pair(arr, divisor));

    }

    private static int divisor_pair(int[] arr, int divisor) {

        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) % divisor == 0)
                    counter++;
            }
        }

        return counter;

    }

}
