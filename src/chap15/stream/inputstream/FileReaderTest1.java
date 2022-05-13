package chap15.stream.inputstream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("b.txt")) {
			int i;
			while((i = fr.read()) != -1 ) {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
