package com.mmal.concurrency.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 找出众数
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    public static int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(map.containsKey(num)){
                int value = map.get(num) + 1;
                if(value > nums.length / 2){
                    return num;
                }
                map.put(num,value);
            }else {
                map.put(num,1);
            }

        }
        return 0;
    }
}
