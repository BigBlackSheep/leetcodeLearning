package com.mmal.concurrency.leetcode;

import java.util.PriorityQueue;

/**
 * 设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。
 *
 * 你的 KthLargest 类需要一个同时接收整数 k 和整数数组nums 的构造器，它包含数据流中的初始元素。每次调用 KthLargest.add，返回当前数据流中第K大的元素。
 *
 * 示例:
 *
 * int k = 3;
 * int[] arr = [4,5,8,2];
 * KthLargest kthLargest = new KthLargest(3, arr);
 * kthLargest.add(3);   // returns 4
 * kthLargest.add(5);   // returns 5
 * kthLargest.add(10);  // returns 5
 * kthLargest.add(9);   // returns 8
 * kthLargest.add(4);   // returns 8
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kth-largest-element-in-a-stream
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class KthLargest {

    PriorityQueue<Integer> priorityQueue ;//使用优先队列 （默认为小顶队列）
    int k;                       //第K大的数据

    public KthLargest(int k, int[] nums) {
        this.k = k;
        priorityQueue = new PriorityQueue(k); //只需要存K个数据即可
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if(priorityQueue.size() < k){ //如果队列不中不够 K 个数据的话 直接插入
            priorityQueue.offer(val); //插入
        }else if(priorityQueue.peek() < val){ //如果顶部元素小于新值 则先删再增
            priorityQueue.poll();//用于检索或获取和删除队列的第一个元素或队列头部的元素
            priorityQueue.offer(val); //插入
        }
        return priorityQueue.peek();//返回顶部元素
    }

}
