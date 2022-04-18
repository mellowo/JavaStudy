package chap12.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("가");
        treeSet.add("다");
        treeSet.add("나");

        System.out.println(treeSet); // [가, 나, 다]
    }
}
