package Arrays;

public class Main {
    public static void main(String[] args){
        MyArray arr = new MyArray(1);
        arr.insert(1);
        arr.insert(5);
        arr.insert(-20);
        arr.insert(20);
        arr.insert(35);
        arr.insert(40);
        arr.insert(14);

        System.out.println(arr.indexOf(14));
        System.out.println(arr);

        arr.removeAt(2);

        System.out.println(arr);

        System.out.println("Max: "+ arr.max());
        System.out.println("Min: "+ arr.min());

        arr.reverse();
        System.out.println(arr);
    }
}
