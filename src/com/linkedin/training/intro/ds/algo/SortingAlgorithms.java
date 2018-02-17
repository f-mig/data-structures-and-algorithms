package com.linkedin.training.intro.ds.algo;

import java.util.Arrays;

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
        System.out.println("Sorted array = ");
        printArray(nums);

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

    void insertionSort(int[] nums) {

        int lastIdx = 0;
        int[] targetArray = new int[nums.length];
        Arrays.fill(targetArray, -1);

        System.out.print("Before sorting:");
        printArray(nums);

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
        System.out.print("After sorting:");
        printArray(targetArray);
    }

    void mergeSort(int[] first, int[] second) {
        //TODO
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
