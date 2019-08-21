package com.company;

import java.util.Calendar;
import java.util.Stack;

public class SolutionStackCalculator {

    /**
     * Give a string, and implement a calculator to evaluate a simple expression string. The expression string contains only non-negative integers, +, -, * operators.
     *
     * Example1: input “1+2”, output:3
     *
     * Example2: input “1+2*5”, output:11
     */

    private static Stack<String> stack = new Stack<>();

    public static int calculate(String s){
        for(int i = 0; i < s.length(); i++){
            stack.push(s.substring(i, i+1));
        }

        String currentItem = null;
        Integer register1 = null;
        Integer register2 = null;
        String action = null;

        while (stack.size() > 0){
            currentItem = stack.pop();
            if(currentItem.equals("+") || currentItem.equals("-") || currentItem.equals("*")) {
                action = currentItem;
                continue;
            }
            if(register1 == null){
                register1 = Integer.parseInt(currentItem);
            } else if (register2 == null){
                register2 = Integer.parseInt(currentItem);
            }
            
            if(register1 != null && register2 != null && action != null){
                Integer value = null; 
                if (action.equals("+")) value = register2 + register1;
                if (action.equals("-")) value = register2 - register1;
                if (action.equals("*")) value = register2 * register1;
                action = null;
                register1 = null;
                register2 = null;
                stack.push(value.toString());
            }

        }

        return Integer.parseInt(currentItem);
    }


}
