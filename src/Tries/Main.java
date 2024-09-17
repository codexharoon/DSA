package Tries;



public class Main {
    public static void main(String[] args){
        Tries tries = new Tries();

        String[] words = new String[]{"car","carpet","carpool","bag","baggage","ball","cat",};
        String[] words2 = new String[]{"car","carpet","carpool",};

        for(String word : words2){
            tries.insert(word);
        }

//        tries.remove("baggage");

//        System.out.println(tries.autoComplete("bag"));

        System.out.println(tries.getLongestCommonPrefix());
    }
}
