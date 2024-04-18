package Queues;

import java.util.Stack;

public class QueueByStacks {
    Stack<Integer> stack = new Stack<>();

    public void insertAtBottom(Stack<Integer> s,int x){
        if(s.isEmpty()){
            s.push(x);
            return;
        }

        int num = s.pop();
        insertAtBottom(s,x);
        s.push(num);
    }

    public void enqueue(int x){
        insertAtBottom(this.stack,x);
    }

    public int dequeue(){
        if(stack.isEmpty()) return -1;

        return stack.pop();
    }

    @Override
    public String toString() {
        if(stack.isEmpty()) return "[]";

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        Stack<Integer> temp = new Stack<>();
        temp.addAll(this.stack);

        while(!temp.isEmpty()){
            builder.append(temp.pop()).append(", ");
        }

        builder.append("\b\b").append("]");

        return builder.toString();
    }

    public static void main(String[] args){
        QueueByStacks queue = new QueueByStacks();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue);

        System.out.println(queue.dequeue());

        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue);
    }
}
