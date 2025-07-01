package com.collection;

import java.util.ArrayList;
import java.util.List;

// How to create an Array list and how to use a add() method.
public class ListInterface {
    public static void main(String[] args) {
        List<String> bikeList = new ArrayList<String>();
        bikeList.add("Yamaha R15");
        bikeList.add("RX100");
        bikeList.add("Pulser 250");
        System.out.println(bikeList);
    }
}
