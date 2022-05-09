package chap15.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("a.txt")) {
            int i ;
            while ((i = fis.read()) != -1){
                System.out.print((char)i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
