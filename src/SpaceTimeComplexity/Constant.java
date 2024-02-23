package SpaceTimeComplexity;

public class Constant {
    public static void main(String[] args){
        int [] nums = new int [] {1,2,3,4,5};

        // adding 10 to first index of array
        nums[0] += 10;  // big O (1) // constant time

        System.out.println(nums[0]);   // big O (1) constant time it will take weather the length of array is 1 or 100.

        // O(1) + O(1) ==> O(2) which is constant so , O(2) => O(1)
    }
}
