package com.linkedin.training.intro.ds.algo;

import org.junit.Before;
import org.junit.Test;

public class SortingAlgorithmsTest {

    private SortingAlgorithms sortingAlgos;

    @Before
    public void before(){
        sortingAlgos = new SortingAlgorithms();
    }

    @Test
    public void bubbleSort() {
        final int[] testArray = new int[]{10, 2, 7, 5, 1};
        sortingAlgos.bubbleSort(testArray);
    }

    @Test
    public void selectionSort() {
        final int[] testArray = new int[]{10, 2, 7, 5, 1};
        sortingAlgos.selectionSort(testArray);
    }

    @Test
    public void insertionSort() {
        final int[] testArray = new int[]{10, 2, 7, 5, 1};
        sortingAlgos.insertionSort(testArray);
    }

    @Test
    public void mergeSort() {
        final Integer[] testArray = new Integer[]{10, 2, 7, 5, 1};
        sortingAlgos.mergeSort(testArray);
    }

    @Test
    public void testNums() {

        final int n1 = 7;
        final int n2 = 4;
        final int resultNoFloor = (7 + 4) / 2;
        final double resultFloor = Math.floor((n1 + n2) / 2);

        System.out.println("result without floor = " + resultNoFloor);
        System.out.println("result with floor = " + resultFloor);
    }
}