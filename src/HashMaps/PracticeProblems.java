package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class PracticeProblems {

    public static void maxRepeatedChar(String s,Map<Character,Integer> map){
        int max = 0;
        char ch = ' ';

        for(char c : s.toCharArray()){
            if(map.get(c) > max) {
                max = map.get(c);
                ch = c;
            }
        }

        System.out.println("Max Repeated Character: " + "'" + ch + "' " + "(" + max + ")");
    }

    public static void main(String[] args){
        // 1 - first non repeated char. in string
        // 2 - first repeated char. in string

        String s = "a green apple";
        Map<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
//            if(map.containsKey(c))
//                map.put(c,map.get(c) + 1);
//            else
//                map.put(c,1);

            // exact work as above
            int count = map.getOrDefault(c,0);
            map.put(c,count + 1);
        }

        for(char c : s.toCharArray()){
            if(map.get(c) == 1){
                System.out.println("First Non Repeated Character: " + "'" + c + "'");
                break;
            }
        }

        for(char c : s.toCharArray()){
            if(map.get(c) > 1){
                System.out.println("First Repeated Character: " + "'" + c + "'");
                break;
            }
        }

        maxRepeatedChar(s,map);

    }
}
