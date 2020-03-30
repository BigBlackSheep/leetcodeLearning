  //使用栈实现队列的下列操作： 
//
// 
// push(x) -- 将一个元素放入队列的尾部。 
// pop() -- 从队列首部移除元素。 
// peek() -- 返回队列首部的元素。 
// empty() -- 返回队列是否为空。 
// 
//
// 示例: 
//
// MyQueue queue = new MyQueue();
//
//queue.push(1);
//queue.push(2);  
//queue.peek();  // 返回 1
//queue.pop();   // 返回 1
//queue.empty(); // 返回 false 
//
// 说明: 
//
// 
// 你只能使用标准的栈操作 -- 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
// 
// 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。 
// 假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）。 
// 
// Related Topics 栈 设计

  
  package com.gz.leetcode.editor.cn;

  import java.util.Stack;

  public class ImplementQueueUsingStacks{
      public static void main(String[] args) {

      }
      //leetcode submit region begin(Prohibit modification and deletion)
class MyQueue {
          //定义一个出栈 一个入栈
          Stack<Integer> inputStack;
          Stack<Integer> outputStack;
          /** Initialize your data structure here. */
    public MyQueue() {
        //构造器初始化出入栈
       inputStack = new Stack<>();
       outputStack = new Stack<>();


    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        //push的时候压入 入栈
        inputStack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        //pop和 peek是一样的
        //如果出栈不为空 则直接在出栈上操作
        // 例如 1）.压力了 数字 1 和 2 然后 peek栈顶元素 2 出栈了
        //     2）.这个时候 栈里面还有一个1 此时再 压入了 数字2
        //     3) .这个时候做peek操作栈顶元素应该就是1了.
        //如果出栈为空 则把入栈的元素全部倒入出栈中.
        if(outputStack.isEmpty()) {
            for (int i = inputStack.size() - 1; i >= 0; i--) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        //同理pop操作
        if(outputStack.isEmpty()) {
            for (int i = inputStack.size() - 1; i >= 0; i--) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        //同时判断出栈和入栈都为空 防止 只压入数据就去 判断 empty（）.此时入栈数据尚未到出栈
    return outputStack.isEmpty() && inputStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

  }