package com.linkedin.training.intro.ds.algo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by F. Migliaro on 17/02/2018.
 */
public class SearchAlgorithmsTest {

    private SearchAlgorithms searchAlgorithms;

    @Before
    public void before(){
        searchAlgorithms = new SearchAlgorithms();
    }

    @Test
    public void binarySearch() throws Exception {
        final int[] sortedArray = new int[]{1, 2, 7, 9, 18};

        assertTrue(searchAlgorithms.binarySearch(sortedArray, 1) == 0);
        assertTrue(searchAlgorithms.binarySearch(sortedArray, 2) == 1);
        assertTrue(searchAlgorithms.binarySearch(sortedArray, 7) == 2);
        assertTrue(searchAlgorithms.binarySearch(sortedArray, 9) == 3);
        assertTrue(searchAlgorithms.binarySearch(sortedArray, 18) == 4);
        assertTrue(searchAlgorithms.binarySearch(sortedArray, 24) == -1);
    }

}