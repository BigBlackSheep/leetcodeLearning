package com.mmal.concurrency.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二分查找联系模板
 */
public class BinarySearch {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(14);
        list.add(19);
        list.add(26);
        list.add(27);
        list.add(31);
        list.add(33);
        list.add(35);
        list.add(42);
        list.add(44);
        int target = 31;
        System.out.println(bs(list, target));


    }
    private static int bs(List<Integer> list,int target){
        int left = 0;
        int right = list.size() - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(list.get(mid) == target){
                return list.get(mid);
            }else if(list.get(mid) < target){
                left = mid +1;
            }else {
                right = mid -1;
            }
        }
        return 0;
    }
}
