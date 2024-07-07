package com.java11.interview.programs;

import java.util.Arrays;
import java.util.List;

public class CollectionToArray {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Joe", "Sarah");
        // Old way
        String[] names = namesList.toArray(new String[namesList.size()]);
        System.out.println("Old way ==> "+Arrays.toString(names));

        // New way
        names = namesList.toArray(String[]::new);
        System.out.println("New way ==> "+Arrays.toString(names));
    }
}
