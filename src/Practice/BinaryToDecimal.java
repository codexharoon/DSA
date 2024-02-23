package Practice;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Binary number: ");
        int num = scanner.nextInt();

        int result = 0;

        int i = 0;
        while(num !=  0){
            int lastDigit = num % 10;

            if(lastDigit == 1)
                result = result + (int)Math.pow(2,i);

            num = num / 10;
            i++;
        }

        System.out.println(result);
    }
}
