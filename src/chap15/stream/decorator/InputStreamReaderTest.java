package chap15.stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		try (InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i ;
			while((i=isr.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
