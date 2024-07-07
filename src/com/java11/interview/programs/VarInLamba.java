package com.java11.interview.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@interface NonNull {}

public class VarInLamba {
    public static void main(String[] args) {
        List<String> tutorialsList = Arrays.asList("java", "Html");

        String tutorials = tutorialsList.stream()
                .map((@NonNull var tutorial) -> tutorial.toUpperCase())
                .collect(Collectors.joining(", "));

        System.out.println(tutorials);
    }
}


/*
Limitations -->
        There are certain limitations on using var in lambda expressions.

        var parameters cannot be mixed with other parameters. Following will throw compilation error.

        (var v1, v2) -> v1 + v2
        var parameters cannot be mixed with other typed parameters. Following will throw compilation error.

        (var v1, String v2) -> v1 + v2
        var parameters can only be used with parenthesis. Following will throw compilation error.

        var v1 -> v1.toLowerCase()*/
