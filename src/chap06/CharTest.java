package chap06;

import java.util.ArrayList;

public class CharTest {
    public static void main(String[] args) {
        char ch = 'A';
        //System.out.println((int)ch);

        char[] arraryChar = new char[1];

        arraryChar[0] = ch;

        for(int i = 0 ; i < arraryChar.length ; i++ ){
            System.out.println(arraryChar[i]);
        }

        int[] i1 = new int[5];

        for(int i :i1){
            System.out.println(i);
        }

        ArrayList i2 = new ArrayList();
        i2.add(1);
        i2.add("강남");

        for (int i = 0 ; i < i2.size(); i++){
            System.out.println(i2.get(i));
        }
    }
}
