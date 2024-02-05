package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArryVSArrylist {
    public static void main(String[] args) {


        // create an array of 3 elements
        String[] names = {"John", "Mary", "Bob"};
        System.out.println(names[0]);
        // get the size of the array
        System.out.println(names.length);

        // sat an element to the array
        names[0] = "Alice";



        // create an arraylist of
        ArrayList<String> names2 = new ArrayList<>(Arrays.asList( "John", "Mary", "Bob"));
        System.out.println(names2.get(0));

        // get the size of the arraylist
        System.out.println(names2.size());
        // add an element to the arraylist
        names2.add("Alice");

        // remove an element from the arraylist
        names2.remove(0);

        // set an element to the arraylist
        names2.set(0, "Alice");









    }
}
