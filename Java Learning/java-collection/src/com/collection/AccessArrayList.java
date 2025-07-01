package com.collection;

import java.util.ArrayList;
import java.util.List;

public class AccessArrayList {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<Integer>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);

        System.out.println("Size of the ArrayList : " + numberList.size());

        System.out.println("Get the first element of the ArrayList : " + numberList.getFirst());
        System.out.println("Get the last element of the ArrayList : " + numberList.getLast());

        numberList.set(4, 11);
        System.out.println("Set the first element of the ArrayList : " + numberList);
    }
}
