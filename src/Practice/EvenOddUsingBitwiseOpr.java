package Practice;

import java.util.Scanner;

public class EvenOddUsingBitwiseOpr {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if((num & 1) == 0){
            System.out.println("Even Number!");
        }
        else{
            System.out.println("Odd Number!");
        }
    }
}
