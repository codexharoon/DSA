package Stacks;

import java.util.EmptyStackException;

public class MyStack {
    // fields
    private int [] arr;
    private int top;
    private int size;

    // ctor
    public MyStack(int size){
        this.size = size;
        arr = new int[size];
        top = 0;
    }

    // isEmpty
    public boolean isEmpty(){
        return top == 0;
    }

    // push
    public void push(int value){
        if(this.top == this.size) throw new StackOverflowError();

        arr[top] = value;
        top++;
    }

    // pop
    public int pop(){
        if(isEmpty()) throw new EmptyStackException();

        top--;
        int res =  arr[top];
        arr[top] = 0;

        return res;
    }

    // size
    public int size(){
        if(isEmpty()) throw new EmptyStackException();

        return top;
    }


    // peek
    public int peek(){
        if(isEmpty()) throw new EmptyStackException();

        return arr[top - 1];
    }

    // toString
    public String toString(){
        if(isEmpty()){
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for(int i=0; i<size; i++){
            if(arr[i] == 0) continue;
            builder.append(arr[i]).append(", ");
        }

        builder.append("\b\b").append("]");
        return builder.toString();
    }


    public static void main(String[] args){
        MyStack stack = new MyStack(10);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack);

        stack.pop();
        stack.pop();
        System.out.println(stack);

    }
}
