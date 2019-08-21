package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionGroupedLists {
    //test
//    List<String> input1 = Arrays.asList("abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbbb", "eeee");
//    List<String>[] test = groupString(input1);
//        for (List<String> lst : test) {
//        System.out.println(lst);
//        System.out.println();
//    }
    public static List<String>[] groupString(List<String> input){
        List<String>[] groupedList = new List[3];
        groupedList[0] = new ArrayList<>();
        groupedList[1] = new ArrayList<>();
        groupedList[2] = new ArrayList<>();
        for(String s: input){
            if(s.charAt(0) == 'a') groupedList[0].add(s);
            else if (s.charAt(0) == 'b') groupedList[1].add(s);
            else groupedList[2].add(s);
        }
        return groupedList;
    }
}
