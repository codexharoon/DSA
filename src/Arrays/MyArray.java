package Arrays;

public class MyArray {
    private final int [] arr;
    private int index;


    public MyArray(int size){
        this.arr = new int [size];
        index = 0;
    }


    public void insert(int value){
        this.arr[index] = value;
        index++;
    }


    public int indexOf(int value){
        /*
 only applied to sorted array...
        int start = 0;
        int end = this.index;

        while(start < end){
            int mid = ( start + end )/2;

            if(this.arr[mid] == value){
                return mid;
            }
            else if(this.arr[mid] < value){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
*/

        for(int i=0; i<this.index; i++){
            if(this.arr[i] == value){
                return i;
            }
        }

        return -1;
    }

    public void removeAt(int ind){
        if(ind >= this.index) throw new IllegalArgumentException();

        for(int i=ind; i<=this.index -2; i++){
            this.arr[i] = this.arr[i+1];
        }
        this.index--;
        this.arr[index] = 0;
    }


    public int max(){
        int max = this.arr[0];

        for(int i=1; i<this.index; i++){
            if(this.arr[i] > max){
                max = this.arr[i];
            }
        }

        return max;
    }


    public int min(){
        int min = this.arr[0];

        for(int i=0; i<this.index; i++){
            if(this.arr[i] < min){
                min = this.arr[i];
            }
        }

        return min;
    }


    public void reverse(){
        for(int i=0; i<this.index/2; i++){
            int temp = this.arr[i];
            this.arr[i] = this.arr[this.index-1-i];
            this.arr[this.index-1-i] = temp;
        }
    }


    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("[");

        for(int i=0; i<this.index; i++)
            str.append(this.arr[i]).append(", ");

        str.append("\b\b").append("]");
        return str.toString();
    }
}
