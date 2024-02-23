package NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();


        // bitwise operators & can be used to find even or odd number  // in binary if last bit is 1 its odd else its even num...
        if((num & 1) == 0){
            System.out.println("This is even number!");
        }
        else{
            System.out.println("This is odd number!");
        }


        // con..

        String result = "";

        while(num != 0){
            int rem = num % 2;
            num = num / 2;
            result = rem + result;
        }

        System.out.println(result);

//        System.out.println(Integer.parseInt(result) & 1);


    }
}
