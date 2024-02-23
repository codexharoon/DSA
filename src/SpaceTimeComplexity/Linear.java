package SpaceTimeComplexity;

public class Linear {
    public static void main(String[] args){
        int [] arr = new int [] {1,23,4,5};

        // add 10 to the first index
        arr[0] += 10;    // O(1) constant time

        System.out.println(arr[0]);  // O(1) constant time

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);     // O(n) linear time , based on the arr length
        }

        // overall time complexity
        // O(1) + O(1) + O(n) ==> O(2+n) ==> O(n)


        // copying one element of arr into newArr

        int [] newArr = new int [arr.length];  // t.c -> O(1) // s.c -> O(n)

        for(int i=0; i<arr.length; i++){
            newArr[i] = arr[i];    // O(n) linear time , based on the arr length
        }

        System.out.println("----------------------------------");

        for(int i=0; i<newArr.length; i++){
            System.out.println(newArr[i]);     // O(n) linear time , based on the arr length
        }
    }
}
