package com.gz.leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * 判断
 */
public class IsValid {
    public  static  Stack<Character> stack = new Stack<Character>();

    public static void main(String[] args) {
        System.out.println(isValid("()"));

//        Stack<Character> stack = new Stack<Character>();
//        stack.push('(');
//        System.out.println(stack.pop());
    }
    public static boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);
            if (!map.containsKey(element)){
                boolean b = stack.add(element);
                System.out.println(b);
            }else if (stack.size() != 0 || map.get(element) != stack.pop()){
                return false;
            }
        }

        return !stack.empty();
    }
}
