package interviewQnATricky;

import java.util.Arrays;

/**
 * <p><b>Problem Statement</b>: Write a function subArray that finds the maximum sum of a contiguous subarray within an array of integers. If the array contains only negative numbers, return the highest value (least negative) element.</p>
 *
 * <p><b>Input</b>: An array of integers arr</p>
 * <p><b>Output</b>: The maximum sum of any contiguous subarray in the given array</p>
 *
 * <p><b>Examples</b>:</p>
 * <p>1. For input array {2,3,-8,7,-1,2,3}, the maximum subarray sum is 11 (elements 7,-1,2,3).</p>
 * <p>2. For input array {-2,-4}, the maximum subarray sum is -2 (the single element -2)</p>
 *
 * <p><b>Constraints</b>:</p>
 * <p>1. The array may contain both positive and negative integers</p>
 * <p>2. The array will have at least one element</p>
 */
public class MaxSubArraySum {

    public static void main(String[] args) {

        int[] arr = {2, 3, -8, 7, -1, 2, 3};
//        int[] arr = {-2, -4};
//        int[] arr = {-2, 7, 3, -5, 4, -1, 0};

        System.out.println("The max sub-array is: " + Arrays.toString(subArray(arr)));

    }

    private static int[] subArray(int[] arr) {

        int arrLen = arr.length, negCounter = 0, negMax = arr[0];
        int[] negMaxArr = new int[1];

        for (int i = 0; i < arrLen; i++) {
            if (arr[i] < 0) negCounter++;
        }

        if (negCounter == arrLen) {
            for (int i = 0; i < arrLen; i++) {
                if (arr[i] > negMax) negMax = arr[i];
            }
            negMaxArr[0] = negMax;
            return negMaxArr;
        } else {
            if (arrLen % 2 == 0) {
                int[] leftArr = new int[arrLen / 2];
                int[] rightArr = new int[arrLen / 2];

                int leftArrSum = 0, rightArrSum = 0;

                for (int i = 0; i < arrLen / 2; i++) {
                    leftArr[i] = arr[i];
                }

                for (int i = 0; i < arrLen / 2; i++) {
                    rightArr[i] = arr[arrLen / 2 + i];
                }

                for (int i = 0; i < leftArr.length; i++) {
                    leftArrSum += leftArr[i];
                }

                for (int i = 0; i < rightArr.length; i++) {
                    rightArrSum += rightArr[i];
                }

                if (leftArrSum > rightArrSum) return leftArr;
                else if (leftArrSum < rightArrSum) return rightArr;
                else throw new RuntimeException("No max subarray found !!");
            } else {
                int[] leftArr = new int[arrLen / 2 + 1];
                int[] rightArr = new int[arrLen / 2 + 1];

                int leftArrSum = 0, rightArrSum = 0;

                for (int i = 0; i <= arrLen / 2; i++) {
                    leftArr[i] = arr[i];
                }

                for (int i = 0; i <= arrLen / 2; i++) {
                    rightArr[i] = arr[arrLen / 2 + i];
                }

                for (int i = 0; i < leftArr.length; i++) {
                    leftArrSum += leftArr[i];
                }

                for (int i = 0; i < rightArr.length; i++) {
                    rightArrSum += rightArr[i];
                }

                if (leftArrSum > rightArrSum) return leftArr;
                else if (leftArrSum < rightArrSum) return rightArr;
                else throw new RuntimeException("No max subarray found !!");
            }
        }

    }

}
