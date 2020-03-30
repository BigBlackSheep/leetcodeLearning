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
                //这里1.如果有新的符号进来 因为不包含在map中（也就是不是左括号）也就是右括号 但是此时栈中为空则不合法
                // 2.或者新来的右括号无法个栈顶元素相匹配的话 那么也是不合法
//                if(stack.size() ==0 || map.get(aChar) != stack.pop()){
//                    return false;
//                }
//            }
//        }
              //因为每次比较都把栈顶元素给移除掉了 如果栈不为空 则说明 有不匹配的情况 所以不合法.
//            return stack.isEmpty();

//实现方式 二 简单方便 字符串直接操作
//    int length;
//    do {
//        //每次length 都等于 当前新的s的长度
//        length = s.length();
//      //每次都把成对出现的括号给干掉 并把新值重新付给s
//      s = s.replace("()","").replace("{}","").replace("[]","");
//      //while 循环的条件则是 当前的length 是否等于新的 s的长度 如果等于 则说明没有可以替换的了
//    }while (s.length() != length );
//    return s.length() == 0;

    //和上面实现方式是一样的 只不过上面是do while 方式 下面的是 while true 方式
    //可能有些人觉得下面的实现方式清晰一些.
    int length = 0;
    while (length != s.length()){
        length = s.length();
        s = s.replace("()","").replace("{}","").replace("[]","");
    }
    return s.length() == 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }