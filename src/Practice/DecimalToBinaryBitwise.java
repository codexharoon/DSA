package Practice;

import java.util.Scanner;

public class DecimalToBinaryBitwise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String result = "";
        while( num != 0){
            int lastBit = num & 1;
            result = lastBit + result;

            num = num >> 1;
        }

        System.out.println(result);
    }
}
