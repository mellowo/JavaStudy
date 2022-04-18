package chap12.collection.treemap;

import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<String, String> treeMap  = new TreeMap<>();

        treeMap.put("나","박건형");
        treeMap.put("가","이건형");
        treeMap.put("다","김건형");

        for ( String key : treeMap.keySet()){
            String val = treeMap.get(key);
            System.out.println(key + " : " +  val);
        }
        /*
        가 : 이건형
        나 : 박건형
        다 : 김건형
        */
    }
}