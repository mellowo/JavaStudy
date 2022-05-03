package chap15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileinputstreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\lgh_0326\\git\\JavaStudy\\src\\chap15\\stream\\input.txt");
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end");
		
	}
}
