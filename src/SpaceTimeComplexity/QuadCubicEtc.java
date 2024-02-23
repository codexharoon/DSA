package SpaceTimeComplexity;

public class QuadCubicEtc {
    public static void main(String[] args){

        int [] arr = new int [] {2,4,3,6,4,8,6,5,9,0};

        int target = 8;

        for(int i=0; i<arr.length; i++){  // O(n)
            for(int j= i+1; j<arr.length; j++){  // O(n) // O(n^2)
                if(arr[i] + arr[j] == target){
                    System.out.println("Pair (" + arr[i] + " , " + arr[j] + ")");
                }
            }
        }

    }
}
