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
}