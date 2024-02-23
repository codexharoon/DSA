package SpaceTimeComplexity;

public class Log {
    public static void main(String[] args){

        int [] arr = new int [] {12,14,16,19,20,15};

        // linear search
        // find 20

        var startTime = System.nanoTime();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 20){
                System.out.println("Found 20 at index " + i);  // O(n)
            }
        }

        var endTime = System.nanoTime();

        System.out.println("Time Taken by linear search : " + (endTime - startTime));


        // binary search
        // find 20

        startTime = System.nanoTime();

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start+end)/2;

            if(arr[mid] == 20){
                System.out.println("Found 20 at index " + mid);    // O(log n)
                break;
            }
            else if(arr[mid] < 20){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        endTime = System.nanoTime();

        System.out.println("Time Taken by Binary search : " + (endTime - startTime));

    }
}
