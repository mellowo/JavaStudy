package chap15.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileinputstreamTest {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("a.txt")){
			System.out.println((char)fis.read());
		}catch (IOException e){
			System.out.println(e);
		}
	}
}
