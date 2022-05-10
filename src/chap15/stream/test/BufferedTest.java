package chap15.stream.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedTest {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("a.txt"))) {

            String str = br.readLine();
            System.out.println(str);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
