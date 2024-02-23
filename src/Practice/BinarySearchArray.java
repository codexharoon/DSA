package Practice;

public class BinarySearchArray {
    public static void main(String[] args){
        int [] arr = new int [] {10,14,15,18,20,45,60,75,77,90};
        int target = 60;

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start+end) / 2;
            if(arr[mid] == target){
                System.out.println("Target found at index " + mid);
                break;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
    }
}
