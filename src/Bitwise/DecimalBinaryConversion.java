package Bitwise;

class Conversion{
    public String decimalToBinary(int n){
        String result = "";

        while(n != 0){
            int lastBit = n & 1;
            result = lastBit + result;

            n = n >> 1;
        }

        return result;
    }

    public int binaryToDecimal(int binary){
        int result = 0;

        int i=0;
        while(binary != 0){
            int lastDigit = binary % 10;

            if(lastDigit == 1)
                result = result + (int)Math.pow(2,i);

            binary = binary / 10;
            i++;
        }

        return result;
    }
}

public class DecimalBinaryConversion {
    public static void main(String[] args){

        Conversion c = new Conversion();
        System.out.println(c.decimalToBinary(2));

        System.out.println(c.binaryToDecimal(10));

        
    }
}
