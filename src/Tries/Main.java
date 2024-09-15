package Tries;



public class Main {
    public static void main(String[] args){
        Tries tries = new Tries();

        String[] words = new String[]{"car","carpet","carpool","bag","baggage","ball","cat",};

        for(String word : words){
            tries.insert(word);
        }

        System.out.println(tries.autoComplete("ca"));
    }
}
