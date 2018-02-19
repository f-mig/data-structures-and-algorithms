package com.linkedin.training.intro.ds.algo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
class SortingAlgorithms {

    void bubbleSort(int[] nums) {

        int upperIdx = nums.length;

        for (int i = 0; i < upperIdx; i++){
            for (int j = 0; j < upperIdx - i - 1; j++){
                System.out.println(String.format("nums[%d](%d) > nums[%d](%d)", j, nums[j], j + 1, nums[j+1]));
                if (nums[j] > nums[j + 1]) {
                    final int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array = " + Arrays.toString(nums));

    }

    void selectionSort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            int smallestIdx = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[smallestIdx]) {
                    smallestIdx = j;
                }
            }
            System.out.println(String.format("Before swapping: [i=%d][nums[i]=%d][smallestIdx=%d][nums[smallestIdx]=%d]",
                    i, nums[i], smallestIdx, nums[smallestIdx]));
            System.out.println(Arrays.toString(nums));

            System.out.println("************************");

            final int temp = nums[i];
            nums[i] = nums[smallestIdx];
            nums[smallestIdx] = temp;

            System.out.print("After swapping: ");
            System.out.println(Arrays.toString(nums));

            System.out.println("************************");
        }
    }

    void insertionSort(int[] nums) {

        int lastIdx = 0;
        int[] targetArray = new int[nums.length];
        Arrays.fill(targetArray, -1);

        System.out.print("Before sorting:" + Arrays.toString(nums));

        for (int num : nums) {
            for (int j = lastIdx; j >= 0; j--) {

                if (targetArray[j] == -1){
                    targetArray[j] = num;
                } else {
                    if (num >= targetArray[j]) {
                        break;
                    }
                    targetArray[j + 1] = targetArray[j];
                    targetArray[j] = num;
                    lastIdx++;
                }
            }
        }
        System.out.print("After sorting:" + Arrays.toString(targetArray));
    }

    void mergeSort(Integer[] nums) {

        final List<Integer[]> arrays = new ArrayList<>(nums.length);

        split(arrays, nums, 0, nums.length);

        System.out.println(arrays.toString());
    }

    private void split(List<Integer[]> arrays, Integer[] nums, int start, int end) {

        final int middle = (start + end) / 2;

        System.out.println("[Array=" + Arrays.toString(nums) + "][start=" + start + "][middle=" + middle + "]" +
                "[end=" + end + "]");

        if (nums.length == 1){
            arrays.add(nums);
            return;
        }
        split(arrays, Arrays.copyOfRange(nums, start, middle + 1), start, middle);
        split(arrays, Arrays.copyOfRange(nums, middle == 0 ? 1 : middle, end + 1), middle, end);
    }
}
