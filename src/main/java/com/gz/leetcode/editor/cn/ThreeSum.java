  //给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例： 
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针

  
  package com.gz.leetcode.editor.cn;

  import java.lang.reflect.Array;
  import java.util.*;

  public class ThreeSum{
      public static void main(String[] args) {
           Solution solution = new ThreeSum().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        Set<Integer> set;
        list.sort(Comparator.comparing(Integer::intValue));
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            if( i >0 && a == list.get(i - 1)){
                continue;
            }
            set = new HashSet<>();
            for(int j = i + 1; j < list.size(); j++) {
                int b = list.get(j);
                if(!set.contains(b)){
                   set.add(-(a + b));
                } else {
                    result.add(Arrays.asList(a,-(a+b),b));
                }
            }
        }


        return new ArrayList<>(result);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }