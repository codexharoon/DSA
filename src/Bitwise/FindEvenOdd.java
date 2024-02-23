package Bitwise;

import java.util.Scanner;

public class FindEvenOdd {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if((num & 1) == 0){
            System.out.println(num + " is Even number!");
        }
        else{
            System.out.println(num + " is Odd number!");
        }

    }
}
