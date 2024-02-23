package BasicMath;

public class PrimeNumber {

    // Leetcode problem 204 naive approach! (time limit exceeded!)
//    class Solution {
//        public int countPrimes(int n) {
//            if(n==0 || n==1)
//                return 0;
//
//            int count = 0;
//            for(int i=2; i<n; i++){
//                if(Prime.check(i)){
//                    count++;
//                }
//            }
//
//            return count;
//        }
//    }
//
//    class Prime{
//        public static boolean check(int n){
//            for(int i=2; i<=n/2; i++){
//                if(n % i == 0)
//                    return false;
//            }
//
//            return true;
//        }
//    }

    public static void main(String [] args){
        int num = 3;

        boolean notAPrime = false;

        for(int i=2; i<= num/2; i++){
            if((num % i) == 0 ){
                notAPrime = true;
                break;
            }
        }

        if(notAPrime) {
            System.out.println("Not a prime number!");
        }
        else
            System.out.println("a prime number!");
    }
}
