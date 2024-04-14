package Stacks;

class Node{
    int data;
    Node next;

    public Node(int val){
        this.data = val;
        next = null;
    }
}
public class StackLinkedList {
    Node head = null;
    int size = 0;

    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        return size;
    }

    public void push(int val){
        Node newNode = new Node(val);

        if(isEmpty()){
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }


    public int pop(){
        if(isEmpty()) return -1;

//        if(head.next == null){
//            int val = head.data;
//            head = null;
//            return val;
//        }

        int data = head.data;
        head = head.next;

        size--;

        return data;
    }


    public int peek(){
        if(isEmpty()) return -1;

        return head.data;
    }


    @Override
    public String toString() {
        if(isEmpty()) return "[]";

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        Node temp = head;
        while(temp != null){
            builder.append(temp.data).append(", ");
            temp = temp.next;
        }

        builder.append("\b\b").append("]");

        return builder.toString();
    }


    public static void main(String[] args){
        StackLinkedList stack = new StackLinkedList();

        System.out.println(stack);
        System.out.println(stack.size());

        stack.push(12);
        stack.push(1);
        stack.push(11);
        stack.push(22);
        stack.push(30);

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.pop());
        System.out.println(stack.size());

        System.out.println(stack);
    }
}
