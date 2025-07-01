//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        list.add(3, 25);
//        long endTime = System.currentTimeMillis();
//        System.out.println("Execute time of the process: " + (endTime - startTime) + "ms" +  "---> " + list);
//
//
//        long startTimeArray = System.currentTimeMillis();
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//        list1.add(5);
//
//        list1.add(3, 25);
//        long endTimeArray = System.currentTimeMillis();
//        System.out.println("Execute time of the process: " + (endTimeArray - startTimeArray) + "ms" +  "---> " + list1);

        final int ITERATIONS = 1_000_000;
        LinkedList<Integer> listAdding = new LinkedList<Integer>();

        long startTime = System.nanoTime();
        for(int i=0; i<ITERATIONS; i++){
            listAdding.add(i,i);
        }
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Linked List Time Taken: " + elapsedTime + " ns");
        System.out.println(listAdding.get(9));

        long arrayStartTime = System.nanoTime();
        ArrayList<Integer> arrayListAdding = new ArrayList<>();
        for(int i=0; i<ITERATIONS; i++){
            arrayListAdding.add(i,i);
        }
        long arrayEndTime = System.nanoTime();
        long arrayElapsedTime = arrayEndTime - arrayStartTime;
        System.out.println("Array Time Taken: " + arrayElapsedTime + " ns");
        System.out.println(arrayListAdding.get(9));

        System.out.println(elapsedTime - arrayElapsedTime);
    }
}