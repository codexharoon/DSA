package Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Queue<Integer> queue = new ArrayDeque<>();

//        queue.add(2);
//        queue.add(8);
//        queue.add(20);
//
//        System.out.println(queue);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());  // remove fun will give exception
//
//        System.out.println(queue);

        queue.offer(2);
        queue.offer(8);
        queue.offer(20);

        System.out.println(queue);


        // reverse queue using stack
        Stack<Integer> stack = new Stack<>();

        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }

        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }

        System.out.println(queue);
    }
}
