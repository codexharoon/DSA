package Heap;

public class Main {
    public static void main(String[] args){
        int [] nums = new int[]{10,3,4,6,16};

        MaxHeap heap = new MaxHeap(nums.length);

        for(int num : nums){
            heap.insert(num);
        }

        System.out.println("Done!");
    }
}
