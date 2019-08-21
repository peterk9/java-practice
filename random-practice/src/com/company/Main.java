package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] input1 = {-1, 15, 59, 22, 6, 42, 45, 0};
        int[] input2 = {5, 10, 22, 100, 8};

        int[] result1 = SolutionPracticeExercises.findKLargestNumbers(input1, 4);
        int[] result2 = SolutionPracticeExercises.findKLargestNumbers(input2, 2);

        System.out.println(result1);
        System.out.println(result2);

    }

}
