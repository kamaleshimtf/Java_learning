package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface
{     public static void main(String[] args) {

              Collection<String> fruitCollection = new ArrayList<>();
              fruitCollection.add("Apple");
              fruitCollection.add("Banana");
              fruitCollection.add("Orange");
              fruitCollection.add("Pineapple");
              System.out.println("Adding a Data : " + fruitCollection);   // Adding an object to our collection

              Collection<String> fruitPrice = new ArrayList<>();
              fruitPrice.add("10");
              fruitPrice.add("20");
              fruitPrice.add("30");
              fruitCollection.addAll(fruitPrice);
              System.out.println("Adding a collection using addAll method : " + fruitCollection); // Adding a one collection into
                                                                                                  // another collection

              System.out.println("contain if there element present or not in our collection : "
                      + fruitCollection.contains("Apple")); // ---> Return value was Boolean

              System.out.println("contain if there collection present or not in our collection : "
               + fruitCollection.containsAll(fruitPrice)); // ---> Return Value was Boolean

              System.out.println("Check the size of the collection : "
               + fruitCollection.size()); // ---> Return an Integer Type

              System.out.println("Check the collection empty : "
               + fruitCollection.isEmpty()); // ---> Return a boolean type

              fruitCollection.remove("Apple"); // Removing particular object from the collection
              System.out.println("After removing a one object from collection: " + fruitCollection);

              fruitCollection.removeAll(fruitPrice); // Remove all object from the collection
              System.out.println("After removing all object from collection: " + fruitCollection);

              fruitCollection.clear(); // clear() and removeAll() are same to clear a hole collection
              System.out.println("After clearing collection: " + fruitCollection);

       }
}
