  //给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 注意空字符串可被认为是有效字符串。 
//
// 示例 1: 
//
// 输入: "()"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "()[]{}"
//输出: true
// 
//
// 示例 3: 
//
// 输入: "(]"
//输出: false
// 
//
// 示例 4: 
//
// 输入: "([)]"
//输出: false
// 
//
// 示例 5: 
//
// 输入: "{[]}"
//输出: true 
// Related Topics 栈 字符串

  
  package com.gz.leetcode.editor.cn;

  import java.util.HashMap;
  import java.util.Map;
  import java.util.Stack;

  public class ValidParentheses{
      public static void main(String[] args) {
           Solution solution = new ValidParentheses().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
//        实现方式1使用 stack + map的方
//        map 枚举的左括号的KEY 方便判断
//        Stack<Character> stack = new Stack<>();
//        Map<Character,Character> map = new HashMap<>();
//        map.put(')','(');
//        map.put(']','[');
//        map.put('}','{');
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            char aChar = chars[i];
//            if(!map.containsKey(aChar)){
//                stack.push(aChar);
//            }else {
//                if(stack.size() ==0 || map.get(aChar) != stack.pop()){
//                    return false;
//                }
//            }
//        }
//            return stack.isEmpty();

//实现方式 二 简单方便 字符串直接操作
    int length;
    do {
        length = s.length();
      s = s.replace("()","").replace("{}","").replace("[]","");

    }while (s.length() != length );
    return s.length() == 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }