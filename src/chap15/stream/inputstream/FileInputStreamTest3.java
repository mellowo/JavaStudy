package chap15.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
    public static void main(String[] args) {
//        try (FileInputStream fis = new FileInputStream("a.txt")) {
//            byte[] bs = new byte[10];
//            int i;
//            while ((i = fis.read(bs)) != -1 ){
//                for(int k = 0 ; k < i ; k++){
//                    System.out.println((char)bs[k]);
//                }
//                System.out.println(": " + i + "바이트 읽음");
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        System.out.println("End");
        
        
        try (FileInputStream fis = new FileInputStream("a.txt")) {
        	byte[] bs = new byte[4096];
        	
        	int i ;
        	while((i=fis.read(bs)) != -1) {
        		for(int k = 0 ; k < i ; k++) {
        			System.out.print((char)bs[k]);
        		}
        		System.out.println(i + "바이트 읽음");
        	}
        	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}
