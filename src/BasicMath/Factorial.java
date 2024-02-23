package BasicMath;

public class Factorial {

    public static int factorial(int n){
        if(n<=1) return 1;

        int fact = 1;
        for(int i=2; i<=n; i++){
            fact = fact * i;
        }

        return fact;
    }

    public static int recursion(int n){
        if(n<=1) return 1;   // base condition

        return n * recursion(n-1);
    }

    // print n to 1
    // e.g: 5 -> 5 4 3 2 1
    public static void task1(int n){
        if(n<1) return;

        System.out.print(n+ " ");
        task1(n-1);
    }

    //sum n to 1
    // e.g: 5 -> 5+4+3+2+1
    public static int task2(int n){
        if(n<=1) return 1;

        return n + task2(n-1);
    }

    public static void main(String[] args){
        System.out.println(factorial(14));
        System.out.println(recursion(14));

        task1(5);
        System.out.println("\nTask 2: "+ task2(5));
    }
}
