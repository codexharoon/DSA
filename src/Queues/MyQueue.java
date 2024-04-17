package Queues;

import java.util.Arrays;

public class MyQueue {
    int [] arr;
    int front;
    int rear;
    int size;
    int count;

    public MyQueue(int len){
        arr = new int [len];
        front = -1;
        rear = 0;
        size = len;
        count = 0;
    }

    public void enqueue(int val){
//        if(rear == size) return;
        if(count == size) return;
        arr[rear] = val;

//        rear++;
        rear = (rear + 1) % size;
        count++;
    }


    public int dequeue(){
//        if(front + 1 == rear) return -1;
        if(count == 0) return -1;

//        front++;
        front = (front + 1) % size;
        int val = arr[front];
        arr[front] = 0;

        count--;

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

//        queue.enqueue(12); // we have empty slot in array still can't add new values we have a bug which we can solve using circular array ---> (index % size) formula

        queue.enqueue(12);
        System.out.println(queue.dequeue());

        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(16);

        System.out.println(queue);

        System.out.println(queue.dequeue());

        System.out.println(queue);

        queue.enqueue(99);

        System.out.println(queue);
    }
}
