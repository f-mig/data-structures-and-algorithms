package com.linkedin.training.intro.ds.algo;

import java.util.Arrays;

/**
 * Created by F. Migliaro on 17/02/2018.
 */
class SearchAlgorithms {

    int binarySearch(int[] nums, int target) {
        int leftIdx = 0;
        int rightIdx = nums.length - 1;

        System.out.println("Nums = " + Arrays.toString(nums));

        return loop(leftIdx, rightIdx, nums, target);
    }

    private int loop(int leftIdx, int rightIdx, int[] nums, int target) {

        final int middleIdx = Math.abs((rightIdx - leftIdx) / 2) + leftIdx;

        System.out.println(String.format("[target=%d][leftIdx=%d][middleIdx=%d][rightIdx=%d][l=%d, m=%d, r=%d]",
                target, leftIdx, middleIdx, rightIdx, nums[leftIdx], nums[middleIdx], nums[rightIdx]));

        if (target == nums[middleIdx]) {
            return middleIdx;
        }
        if (target == nums[leftIdx]) {
            return leftIdx;
        }
        if (target == nums[rightIdx]) {
            return rightIdx;
        }
        if (middleIdx == leftIdx || middleIdx == rightIdx) {
            return -1;
        }
        if (target < nums[middleIdx]) {
            return loop(leftIdx, middleIdx, nums, target);
        }
        return loop(middleIdx, rightIdx, nums, target);
    }
}
