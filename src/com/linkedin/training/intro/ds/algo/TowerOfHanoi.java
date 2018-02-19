package com.linkedin.training.intro.ds.algo;

import java.util.LinkedList;

/**
 * Created by Francisco Migliaro on 19/02/2018.
 */
public class TowerOfHanoi {

    private LinkedList<String> towerA = new LinkedList<>();
    private LinkedList<String> towerB = new LinkedList<>();
    private LinkedList<String> towerC = new LinkedList<>();

    void hanoi(LinkedList<String> source, LinkedList<String> target, LinkedList<String> inter){

        int n = source.size();
        loop(n, source, target, inter);
    }

    private void loop(int n, LinkedList<String> source, LinkedList<String> target, LinkedList<String> inter) {

        if (target.size() == n - 1) {
            final String elem = source.pop();
            target.push(elem);
        }

    }
}
