package com.mmal.concurrency.leetcode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 239. 滑动窗口最大值
 * 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 *
 * 返回滑动窗口中的最大值。
 *
 *
 *
 * 示例:
 *
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 *
 *   滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 */
public class maxSlidingWindow {

    public static void main(String[] args) {
        int nums[] = {1,-1};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 1)));
    }
    public  static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0 || nums.length < 2){
            return nums;
        }
        LinkedList<Integer> window = new LinkedList();
        int [] res = new int[nums.length - k +1];
        window.add(0);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(window.peek() < i - k + 1){
                window.remove();
            }
            Iterator<Integer> iterator = window.iterator();
            while (iterator.hasNext()){
                if( nums[iterator.next()] < nums[i]){
                    iterator.remove();
                }
            }
            window.add(i);
            if(i >= k -1){
                res[i-k+1] = nums[window.peek()];
            }

        }
        return res;
    }

}
