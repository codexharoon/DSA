package Arrays;

public class SingleNumberLeetcode {
    public static void main(String[] args){
        int [] arr = new int[] {1,2,1,2,4,3,4};

        // O(n^2)
        int result = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j] && i != j && arr[i] != -1) {
                    arr[i] = -1;
                    arr[j] = -1;
                }

                if(arr[i] != -1)
                    result = arr[i];
            }
        }

        System.out.println(result);


        // optimize solution: O(n)
        result = 0;
        for(int n : arr){
            result = result ^ n;
        }

        System.out.println(result);

//        {1,2,1,2,4,3,4}
        System.out.println("----------------------------");
/*
        System.out.println(0 ^ 1);
        System.out.println(1 ^ 2);
        System.out.println(1 ^ 2 ^ 1);
        System.out.println(1 ^ 2 ^ 1 ^ 2);
        System.out.println(1 ^ 2 ^ 1 ^ 2 ^ 4);
        System.out.println(1 ^ 2 ^ 1 ^ 2 ^ 4 ^ 3);
        System.out.println(1 ^ 2 ^ 1 ^ 2 ^ 4 ^ 3 ^ 4);
*/
    }
}
