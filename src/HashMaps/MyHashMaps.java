package HashMaps;

import java.util.Arrays;
import java.util.LinkedList;

class Entry{
    int key;
    String value;

    public Entry(int k,String v){
        this.key = k;
        this.value = v;
    }

    @Override
    public String toString() {
        return key+" = "+value;
    }
}


public class MyHashMaps {
    LinkedList<Entry>[] list;

    public MyHashMaps(){
        this.list = new LinkedList[5];
    }

    private int hashFun(int key){
        return key % list.length;
    }

    public void put(int key,String value){
        int index = hashFun(key);

        if(list[index] == null){
            list[index] = new LinkedList<>();
        }

        var bucket = list[index];

        for(Entry item : bucket){
            if(item.key == key){
                item.value = value;
                return;
            }
        }

        bucket.addLast(new Entry(key,value));
    }

    public String toString(){
        return Arrays.toString(list);
    }


    // main fun
    public static void main(String[] args){
        MyHashMaps map = new MyHashMaps();

        map.put(1,"Haroon");
        map.put(3,"Code x Haroon");
        map.put(6,"Jarvis");

        System.out.println(map);
    }
}
