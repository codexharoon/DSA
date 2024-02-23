package Bitwise;

public class SwapNumWithXOR {
    public static void main(String[] args){

        int a = 2;
        int b = 4;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a: "+a);
        System.out.println("b: "+b);

        System.out.println(Integer.parseInt("010"));
        System.out.println(10%10);

    }
}
