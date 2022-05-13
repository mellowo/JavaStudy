package chap15.stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("b.txt")) {
			fos.write(65);
			fos.write(66);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
		
	}
}
