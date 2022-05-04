package chap14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("C:\\Users\\lgh_0326\\git\\JavaStudy\\src\\chap14\\exception\\a.txt")){
			int i = fis.read();
			System.out.println((char)i);
		}catch (IOException e) {
			System.out.println(e);
		};
		
		
	}
}
