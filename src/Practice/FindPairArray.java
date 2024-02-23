package Practice;

public class FindPairArray {
    public static void main(String[] args){
        int [] arr = new int [] {1,3,2,4,5,3,6,7,8,0,5,4,3,2,4,5};

        // find pair
        int target = 6;

        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if((arr[i] + arr[j]) == target){
                    System.out.println("Pair ("+arr[i]+" , "+arr[j]+")");
                }
            }
        }
    }
}
