package Practice;

public class DecimalToBinary {
    public static void main(String[] args){
        String result = "";
        int num = 11;

        while(num != 0){
            int rem = num % 2;
            num = num / 2;
            result = rem + result;
        }

        System.out.println(result);
    }
}
