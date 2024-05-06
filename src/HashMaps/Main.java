package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<>();

        map.put(1001,"Yo");
        map.put(1000,"1");

        System.out.println(map);

        System.out.println(map.get(1000));
    }
}
