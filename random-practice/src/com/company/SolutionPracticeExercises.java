package com.company;

import java.util.*;

public class SolutionPracticeExercises {

    public static int findDuplicate(String input){
        Set<Character> seen = new HashSet<>();
        for(int i = 0; i < input.length(); i++){
            Character c = input.charAt(i);
            if(seen.contains(c)) return i;
            else seen.add(c);
        }
        return -1;
    }

    public static boolean twoSum(int[] nums, int target){
        Set<Integer> pair = new HashSet<>();
        for(int n: nums){
            int diff = target - n;
            if(pair.contains(n)) return true;
            pair.add(diff);
        }
        return false;
    }

    public static String reverseString(String s){
        StringBuilder reverse = new StringBuilder();
        for(int i = s.length() - 1; i > -1; i--){
            reverse.append(s.charAt(i));
        }
        return reverse.toString();
    }

    public static int[] findKLargestNumbers(int[] nums, int k){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.push(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > ll.get(0)) ll.push(nums[i]);
        }
        ArrayList<Integer> largest = new ArrayList<>();
        int count = 0;;
        while(largest.size() < k){
            largest[count] = ll.get(count);
            count++;
        }
        return largest;
    }


}
