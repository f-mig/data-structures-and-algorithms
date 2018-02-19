package com.linkedin.training.intro.ds.datastructures;

/**
 * Created by Francisco Migliaro on 17/02/2018.
 */
public class DoublyEndedLinkedList<E extends Comparable<E>> {

    private Node<E> head;
    private Node<E> tail;

    void addFirst(E data){
        final Node<E> node = new Node<>(data);
        node.next = head;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }

    void addLast(E data) {
        if (tail == null) {
            tail = new Node<>(data);
            head = tail;
        } else {
            final Node<E> node = new Node<>(data);
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }

    E removeFirst() {
        if (head == null) {
            return null;
        }
        final E data = head.data;
        if (head.next == null){
            head = null;
            return data;
        }
        head = head.next;
        head.prev = null;
        return data;
    }

    E removeLast() {

        if (tail == null) {
            return null;
        }

        E removedData = tail.data;
        tail = tail.prev;

        if (tail == null){
            head = null;
            return null;
        }
        tail.next = null;

        return removedData;
    }

    E peekFirst() {
        return head != null ? head.data : null;
    }


    E peekLast() {
        return tail != null ? tail.data : null;
    }

    int size() {
        Node<E> current = head;
        int size = 0;
        while (current != null){
            size++;
            current = current.next;
        }
        return size;
    }

    boolean find(E data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    void insertDataInAscOrder(E data) {

        final Node<E> newNode = new Node<>(data);

        if (head == null){
            head = newNode;
        } else {
            Node<E> current = head;
            while (current != null) {
                if (data.compareTo(current.data) <= 0) {
                    newNode.next = current;
                    newNode.prev = current.prev;
                    current.prev.next = newNode;
                    current.prev = newNode;
                }
                current = current.next;
            }
        }
    }

    @Override
    public String toString() {

        Node<E> current = head;
        final StringBuilder sb = new StringBuilder();

        while (current != null){
            sb.append(current).append(",");
            current = current.next;
        }
        sb.setLength(sb.length() - 1);

        return sb.toString();
    }

    private static class Node<E> {
        private E data;
        private Node<E> prev;
        private Node<E> next;

        Node(E data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", prev=" + (prev != null ? prev.data : "null") +
                    ", next=" + (next != null ? next.data : "null") +
                    '}';
        }
    }
}
