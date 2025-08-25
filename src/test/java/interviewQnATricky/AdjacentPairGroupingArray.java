package interviewQnATricky;

/**
 * <p><b>Problem Statement</b>: Write a function evenSum that processes an array of integers by examining adjacent pairs of elements. The function should count how many non-overlapping pairs with an even sum can be formed while traversing the array from left to right.</p>
 *
 * <p><b>Input</b>:</p>
 * <p>An array of integers arr</p>
 *
 * <p><b>Output</b>:</p>
 * <p>The count of non-overlapping adjacent pairs whose sum is even</p>
 *
 * <p><b>Algorithm Details</b>:</p>
 * <p>1. The function traverses the array from left to right</p>
 * <p>2. When it finds a pair of adjacent elements whose sum is even, it:</p>
 * <ul>
 *   <li>Increments the counter</li>
 *   <li>Skips the next pair (moves the index by 2)</li>
 * </ul>
 * <p>3. If the adjacent pair doesn't have an even sum, it simply moves to the next position</p>
 *
 * <p><b>Example</b>:</p>
 * <p>For input array {4,2,5,8,7,3,7}:</p>
 * <ul>
 *   <li>Pair (4,2): Sum is 6 (even), increment counter to 1, move to index 2</li>
 *   <li>Pair (5,8): Sum is 13 (odd), move to index 4</li>
 *   <li>Pair (7,3): Sum is 10 (even), increment counter to 2, move to index 6</li>
 *   <li>Index 6 is the last element, so there are no more pairs to check</li>
 *   <li>The function returns 2</li>
 * </ul>
 *
 * <p><b>Constraints</b>:</p>
 * <p>1. The array will contain at least one element</p>
 * <p>2. The function only considers adjacent pairs (elements at positions i and i+1)</p>
 * <p>3. The function manages index traversal to ensure non-overlapping pairs</p>
 */
public class AdjacentPairGroupingArray {

    public static void main(String[] args) {

        int[] arr = {4, 2, 5, 8, 7, 3, 7};
//        int[] arr = {3, 2, 7, 9, 6, 1, 0, 4, 5};
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println("The count of non-overlapping adjacent pairs whose sum is even is: " + evenSum(arr));

    }

    private static int evenSum(int[] arr) {

        int index = 0, counter = 0;

        while (index < arr.length - 1) {
            if ((arr[index] + arr[index + 1]) % 2 == 0)
                counter++;
            index += 2;
        }

        return counter;

    }

}
