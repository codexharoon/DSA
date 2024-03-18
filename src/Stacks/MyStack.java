package Stacks;

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
        if(this.top == this.size){
            System.out.println("Stack is Full!");
            return;
        }

        arr[top] = value;
        top++;
    }

    // pop
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            return -1;
        }

        top--;
        int res =  arr[top];
        arr[top] = 0;

        return res;
    }

    // size
    public int size(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            return -1;
        }
        return top;
    }

    // toString
    public String toString(){
        if(isEmpty()){
            return "Stack is Empty!\n";
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

        stack.pop();

        System.out.println(stack);
        stack.pop();
        stack.pop();

        System.out.println(stack);




    }
}
