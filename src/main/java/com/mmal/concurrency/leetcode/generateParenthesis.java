package com.mmal.concurrency.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * 22.括号生成
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 *
 * 例如，给出 n = 3，生成结果为：
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/generate-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class generateParenthesis {
    public static void main(String[] args) {

    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList<>();
        gen("",list,n,n);
        return list;
    }
    private void gen(String str,List<String> list,int left,int right){
     if(left == 0 && right == 0){
         list.add(str.toString());
         return ;
     }
     if(left > 0){
         gen(str + "(",list,left-1,right);
     }
     if(right > left){
         gen(str + ")",list,left,right-1);
     }
    }
}
