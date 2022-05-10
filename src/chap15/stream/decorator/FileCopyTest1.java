package chap15.stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest1 {
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("C:\\Users\\lgh_0326\\Desktop\\putty.exe")) {
			FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\lgh_0326\\\\Desktop\\\\putty1.exe");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int i ;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
