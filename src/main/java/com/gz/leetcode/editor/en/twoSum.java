package com.gz.leetcode.editor.en;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,2,3,4,612,45,34,999}, 1000)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(target - nums[i])){
                return new int[]{hashMap.get(target - nums[i]),i};
            }else{
                hashMap.put(nums[i],i);
            }
        }
        return null;
    }
}
