package com.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionArrayList {
    public static void main(String[] args) {
        List<Integer> firstPrimeNumber = new ArrayList<>();
        firstPrimeNumber.add(2);
        firstPrimeNumber.add(3);
        firstPrimeNumber.add(5);
        firstPrimeNumber.add(7);
        firstPrimeNumber.add(11);

        List<Integer> tenPrimeNumber = new ArrayList<>(firstPrimeNumber);

        List<Integer> nextFivePrimeNumber = new ArrayList<>();
        nextFivePrimeNumber.add(13);
        nextFivePrimeNumber.add(15);
        nextFivePrimeNumber.add(19);
        nextFivePrimeNumber.add(23);
        nextFivePrimeNumber.add(29);

        tenPrimeNumber.addAll(nextFivePrimeNumber);

        System.out.println(tenPrimeNumber);

    }
}
