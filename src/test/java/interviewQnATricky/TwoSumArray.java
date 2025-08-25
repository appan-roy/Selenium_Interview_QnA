package interviewQnATricky;

/**
 * <p><b>Problem Statement</b>: Write a function sum that finds a pair of elements in an array that add up to a specified target sum. If such a pair exists, print the indexes and the values of these elements.</p>
 *
 * <p><b>Input</b>:</p>
 * <p>1. An array of integers arr</p>
 * <p>2. A target sum expectedSum</p>
 *
 * <p><b>Output</b>:</p>
 * <p>1. The indexes of the two elements that add up to the target sum</p>
 * <p>2. The values of these two elements</p>
 *
 * <p><b>Example</b>: For input array {1, 2, 3, 5} and target sum 4, the function should print:</p>
 * <p>"Indexes are: 0, 2"</p>
 * <p>"Values are: 1, 3"</p>
 *
 * <p><b>Constraints</b>:</p>
 * <p>1. Assume there is exactly one solution</p>
 * <p>2. You cannot use the same element twice</p>
 */
public class TwoSumArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};
        int expectedSum = 4;

//        int[] arr = {5, 8, 9, 7};
//        int expectedSum = 16;

        sum(arr, expectedSum);

    }

    private static void sum(int[] arr, int expSum) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == expSum){
                    System.out.println("Indexes are: " + i + ", " + j);
                    System.out.println("Values are: " + arr[i] + ", " + arr[j]);
                }
            }
        }

    }

}
