package LinkedList;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> list = new LinkedList<>();

        list.add(12);
        list.add(1);

        System.out.println(list);

        list.sort(null);

        System.out.println(list);
    }
}
