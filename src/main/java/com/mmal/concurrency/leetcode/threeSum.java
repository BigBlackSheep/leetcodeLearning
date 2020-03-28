package com.mmal.concurrency.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 *三数之和
 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。

 注意：答案中不可以包含重复的三元组。



 示例：

 给定数组 nums = [-1, 0, 1, 2, -1, -4]，

 满足要求的三元组集合为：
 [
 [-1, 0, 1],
 [-1, -1, 2]
 ]
 */
public class threeSum {
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
