//给定一个字符串，逐个翻转字符串中的每个单词。 
//
// 
//
// 示例 1： 
//
// 输入: "the sky is blue"
//输出: "blue is sky the"
// 
//
// 示例 2： 
//
// 输入: "  hello world!  "
//输出: "world! hello"
//解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
// 
//
// 示例 3： 
//
// 输入: "a good   example"
//输出: "example good a"
//解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
// 
//
// 
//
// 说明： 
//
// 
// 无空格字符构成一个单词。 
// 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。 
// 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。 
// 
//
// 
//
// 进阶： 
//
// 请选用 C 语言的用户尝试使用 O(1) 额外空间复杂度的原地解法。 
// Related Topics 字符串 
// 👍 224 👎 0

  package com.gz.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;

//java:翻转字符串里的单词
public class P151ReverseWordsInAString{
    public static void main(String[] args){
        Solution solution = new P151ReverseWordsInAString().new Solution();
        System.out.println(solution.reverseWords(" the sky is blue "));


    }


    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
        int left = 0 ;
        int right = s.length() -1;
        Deque<String> deque = new ArrayDeque<>();
        StringBuilder builder = new StringBuilder();
        while (left<=right &&s.charAt(left) != ' '){
            left ++;
        }
        while (left<=right && s.charAt(right) != ' '){
            right ++;
        }
        while (left <= right){
            char c = s.charAt(left);
            if(builder.length() !=0 && c== ' '){
                deque.addFirst(builder.toString());
                builder.setLength(0);
            }else if (c !=' '){
                builder.append(c);
            }
            left++;
        }
        deque.add(builder.toString());

        return String.join(" ",deque);
        
    }


        //双端队列解法
        public String reverseWords1(String s) {
            int left = 0;
            int right = s.length() - 1;

            while (left <= right && s.charAt(left) == ' '){
                left++;
            }
            while (left <= right && s.charAt(right) == ' '){
                right--;
            }
            Deque<String> deque = new ArrayDeque<>();
            StringBuilder sb = new StringBuilder();
            while (left <= right){
                char c = s.charAt(left);
                if((sb.length() != 0) && c == ' '){
                    deque.addFirst(sb.toString());
                    sb.setLength(0);
                }else if (c != ' '){
                    sb.append(c);
                }
                left ++;
            }
            deque.add(sb.toString());
            return String.join(" ",deque);
        }

}
//leetcode submit region end(Prohibit modification and deletion)

}
