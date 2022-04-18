package chap12.collection.hashmap;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<Integer, String>();
        hashmap.put(0,"가");
        hashmap.put(1,"나");

        for( int int1 : hashmap.keySet()){
            String val = hashmap.get(int1);
            System.out.println(val);
        }
    }
}
