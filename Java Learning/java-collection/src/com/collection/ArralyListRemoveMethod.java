package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArralyListRemoveMethod {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<String>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("orange");
        fruitList.add("pear");
        fruitList.add("grape");
        System.out.println(fruitList);

        // Remove only object using remove method();
        fruitList.remove("apple");
        System.out.println("After removing a object : "
                + fruitList);

        // Remove index object using a remove method.
        fruitList.remove(2);
        System.out.println("After removing a 2 index : " + fruitList);

        List<String> subFruitList = new ArrayList<>();
        subFruitList.add("apple1");
        subFruitList.add("banana2");
        fruitList.addAll(subFruitList);

        System.out.println("After adding a sublist into main list" + fruitList);

        // Remove All method
        fruitList.removeAll(subFruitList);
        System.out.println("After removing all sub fruits into main list : " + fruitList);

        // clear method()
        fruitList.clear();
        System.out.println("Clear a Collection method : " + fruitList);

    }
}
