package com.linkedin.training.intro.ds.algo;

import java.util.Arrays;

public class SortingAlgorithms {

    public void bubbleSort(int[] nums) {

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
        System.out.println("Sorted array = ");
        printArray(nums);

    }

    public void selectionSort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            int smallestIdx = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[smallestIdx]) {
                    smallestIdx = j;
                }
            }
            System.out.println(String.format("Before swapping: [i=%d][nums[i]=%d][smallestIdx=%d][nums[smallestIdx]=%d]",
                    i, nums[i], smallestIdx, nums[smallestIdx]));
            printArray(nums);

            System.out.println("************************");

            final int temp = nums[i];
            nums[i] = nums[smallestIdx];
            nums[smallestIdx] = temp;

            System.out.print("After swapping: ");
            printArray(nums);

            System.out.println("************************");
        }
    }

    public void insertionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int topIdx = i;
            for (int j = topIdx; j >= 0 ; j--) {
                if (nums[i] < nums[j]){
                    final boolean isElemOnLeft = j - 1 >= 0;
                    if (isElemOnLeft && nums[i] > nums[j - 1]) {
                        final int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        continue;
                    }
                }
            }
        }
    }

    public void mergeSort(int[] first, int[] second) {

        final int[] merged = new int[first.length + second.length];

        int firstArrIdx = 0;
        int secondArrIdx = 0;

        while (firstArrIdx < first.length && secondArrIdx < second.length) {

        }
    }

    private void printArray(int[] nums) {

        final StringBuilder sb = new StringBuilder();
        for (int n : nums) {
            sb.append(n).append(",");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb.toString());
    }
}
