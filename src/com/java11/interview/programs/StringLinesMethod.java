package com.java11.interview.programs;

import java.util.ArrayList;
import java.util.List;

public class StringLinesMethod {
    public static void main(String[] args) {
        String sample = "This\nis\na\nmultiline\ntext.";

        List<String> lines = new ArrayList<>();

        /*sample.lines().forEach(line -> lines.add(line));*/   // lambda
        sample.lines().forEach(lines::add); // method references
        lines.forEach(line -> System.out.println(line));
    }
}
/*
String.lines() − Return the stream of lines of multi-line string.
*/