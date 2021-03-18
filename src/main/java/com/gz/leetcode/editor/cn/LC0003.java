package com.gz.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class LC0003 {
    public static void main(String[] args) {
    int length =2;
        Map<Character,Integer> map = new HashMap((int) (1 * length / 0.75));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }


    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        int fast = 0, slow = 0, max = 0,length = s.length();;
        Map<Character,Integer> map = new HashMap<>();
        char[] cs = s.toCharArray();
        for(; fast < length ; fast ++){
            char c = cs[fast];
            if(map.containsKey(c)){
                slow = Math.max(slow, map.get(c) + 1);
            }
            map.put(c,fast);
            max = Math.max(max,fast - slow +1 );
        }
        return max;
    }
}
