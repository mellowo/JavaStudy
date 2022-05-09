package chap15.stream.inputstream;

import java.io.IOException;
import java.io.InputStream;

public class SystemInTest {
	public static void main(String[] args) {
		byte[] bytes = new byte[4096];

		try {
			System.in.read(bytes,0,4096);

			for(int i : bytes){
				System.out.println((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
