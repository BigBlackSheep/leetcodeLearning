  //在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 
//
// 示例: 
//
// s = "abaccdeff"
//返回 "b"
//
//s = "" 
//返回 " "
// 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 50000 
// Related Topics 哈希表

  
  package com.gz.leetcode.editor.cn;

  import java.util.LinkedHashMap;
  import java.util.Map;
  import java.util.Set;

  public class DiYiGeZhiChuXianYiCiDeZiFuLcof{
      public static void main(String[] args) {
           Solution solution = new DiYiGeZhiChuXianYiCiDeZiFuLcof().new Solution();
          System.out.println(solution.firstUniqChar("loveleetcode"));
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character,Boolean> map = new LinkedHashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i],map.containsKey(chars[i]));
        }

        for (int i = 0; i < chars.length; i++) {
            if(!map.get(chars[i])){
                return chars[i];
            }
        }
        return ' ';
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }