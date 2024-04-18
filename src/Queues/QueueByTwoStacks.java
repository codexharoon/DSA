package Queues;

import java.util.Stack;

public class QueueByTwoStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();


    public void enqueue(int x){
        s1.push(x);
    }

    public int dequeue(){
        if(s1.isEmpty() && s2.isEmpty()) return -1;

        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }


    public static void main(String[] args){
        QueueByTwoStacks queue = new QueueByTwoStacks();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
