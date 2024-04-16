package Queues;

import java.util.Arrays;

public class MyQueue {
    int [] arr;
    int front;
    int rear;
    int size;

    public MyQueue(int len){
        arr = new int [len];
        front = -1;
        rear = 0;
        size = len;
    }

    public void enqueue(int val){
        if(rear == size) return;

        arr[rear] = val;
        rear++;
    }


    public int dequeue(){
        if(front + 1 == rear) return -1;

        front++;
        int val = arr[front];
        arr[front] = 0;

        return val;
    }


    public String toString(){
        return Arrays.toString(arr);
    }


    public static void main(String[] args){
        MyQueue queue = new MyQueue(3);

        queue.enqueue(23);
        queue.enqueue(43);
        queue.enqueue(2);
//        queue.enqueue(2);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue);
    }
}
