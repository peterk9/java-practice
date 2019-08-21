package com.company;

import java.util.List;
import java.util.TreeMap;

public class SolutionWordFrequency {

    private static TreeMap<String, Integer> map = new TreeMap<>();

    public static void countWords(List<String> string){

        string.forEach((word) -> {
            map.put(word, map.getOrDefault(word, 0) + 1);
        });

        map.forEach((key, value) -> {
         System.out.println(key + " | " + value);
        });

    }

}
