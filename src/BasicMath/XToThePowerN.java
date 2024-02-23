package BasicMath;

public class XToThePowerN {
    // using loop
    public static int loop(int x, int n){
        int result = 1;
        for(int i=1; i<=n; i++){
            result = result * x ;
        }

        return result;
    }


    // using recursion
    public static int recursion(int x, int n){
        if(n == 0) return 1;
        if(n == 1) return x;
        return x * recursion(x,n-1);
    }



    public static void main(String[] args){
        int x = 2;
        int n = 3;

        System.out.println(loop(2,0));
        System.out.println(recursion(2,3));
    }
}
