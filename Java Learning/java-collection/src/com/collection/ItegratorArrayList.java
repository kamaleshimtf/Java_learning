package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItegratorArrayList {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<Integer>();
        listNumber.add(10);
        listNumber.add(20);
        listNumber.add(30);
        listNumber.add(40);
        listNumber.add(50);
        listNumber.add(60);

        System.out.println("----------Basic For loop method------------");
        for(int i=0; i<listNumber.size(); i++){
            System.out.println(listNumber.get(i));
        }

        System.out.println("----------Basic Advance For loop method------------");
        for(Integer number : listNumber){
            System.out.println(number);
        }

        System.out.println("----------Loop based Iterator method------------");
        Iterator<Integer> iterator = listNumber.iterator();
        while(iterator.hasNext()){
            Integer number = iterator.next();
            System.out.println(number);
        }

        System.out.println("----------Java 8 Stream method------------");
        listNumber.stream().forEach(number -> System.out.println(number));

        System.out.println("----------Java 9 Lambda method------------");
        listNumber.forEach(number -> System.out.println(number));
    }
}
