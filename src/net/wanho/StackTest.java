package net.wanho;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        //stack就是数据结构中的栈：先进后出
        Stack<String> stack = new Stack<>();
        stack.push("1234");
        stack.push("678");
        stack.push("67890");
        stack.push("5678");

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());


        Queue <String> queue = new LinkedList<>();
        queue.add("123");
        queue.add("344");
        queue.add("567");

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
