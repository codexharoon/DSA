package Queues;

import java.util.Arrays;
import java.util.Queue;

public class PriorityQueue {

    int [] arr;
    int front;
    int rear;
    int size;
    int count;

    public PriorityQueue(int len){
        arr = new int [len];
        front = -1;
        rear = 0;
        size = len;
        count = 0;
    }

    public void enqueue(int val){
        if(count == size) return;

        int i;
        for(i = rear; i > 0; i--){
            if(arr[i - 1] <= val) break;
            if(arr[i - 1] > val){
                arr[i] = arr[i-1];
            }
        }

        arr[i] = val;

        rear = (rear + 1) % size;
        count++;
    }


    public int dequeue(){
        if(count == 0) return -1;

        front = (front + 1) % size;
        int val = arr[front];
        arr[front] = 0;

        count--;

        return val;
    }


    public String toString(){
        return Arrays.toString(arr);
    }


    public static void main(String[] args) {
        Queue<Integer> queue = new java.util.PriorityQueue<>();

//        queue.offer(12);
//        queue.offer(13);
//        queue.offer(15);
//        queue.offer(2);
//
//        System.out.println(queue);
//
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//
//        System.out.println(queue);


        // my priority queue

        PriorityQueue q = new PriorityQueue(5);
        q.enqueue(12);
        q.enqueue(1);
        q.enqueue(4);
        q.enqueue(15);

        System.out.println(q);



    }
}
