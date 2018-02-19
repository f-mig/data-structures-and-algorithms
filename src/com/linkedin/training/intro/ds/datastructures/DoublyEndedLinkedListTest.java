package com.linkedin.training.intro.ds.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Francisco Migliaro on 17/02/2018.
 */
public class DoublyEndedLinkedListTest {

    private DoublyEndedLinkedList<Integer> linkedList;

    @Before
    public void setUp() throws Exception {
        linkedList = new DoublyEndedLinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(7);
    }

    @Test
    public void addFirst() {
        System.out.println("Before adding: " + linkedList.toString());
        linkedList.addFirst(8);
        System.out.println("After adding: " + linkedList.toString());
        assertTrue(linkedList.peekFirst() == 8);
    }

    @Test
    public void addLast() throws Exception {
        linkedList.addLast(5);
        System.out.println(linkedList.toString());
        assertTrue(linkedList.peekLast() == 5);
    }

    @Test
    public void removeFirst() throws Exception {

        System.out.println("Before removing: " + linkedList.toString());
        final Integer first = linkedList.removeFirst();
        System.out.println("After removing: " + linkedList.toString());

        assertTrue(first == 1);
        assertTrue(linkedList.size() == 4);
    }

    @Test
    public void removeLast() throws Exception {

        System.out.println("Before removing: " + linkedList.toString());
        final Integer last = linkedList.removeLast();
        System.out.println("After removing: " + linkedList.toString());

        assertTrue(last == 7);
        assertTrue(linkedList.size() == 4);
        assertTrue(linkedList.peekLast() == 4);
    }

    @Test
    public void find() {
        assertTrue(linkedList.find(1));
        assertTrue(linkedList.find(2));
        assertTrue(linkedList.find(3));
        assertTrue(linkedList.find(4));
        assertFalse(linkedList.find(5));
    }

    @Test
    public void insertDataInAscOrder() {
        System.out.println("Before inserting: " + linkedList.toString());
        linkedList.insertDataInAscOrder(5);
        System.out.println("After inserting: " + linkedList.toString());
        assertTrue(linkedList.find(5));
    }
}