package chap14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling1 {
	public static void main(String[] args) {
//		try {
//			//a.txt가 없을수도 있으니 미리 예외 처리를 진행 해라
//			FileInputStream fis = new FileInputStream("C:\\Users\\lgh_0326\\git\\JavaStudy\\src\\chap14\\exception\\a.txt");
//			if(fis != null) {
//				try {
//					fis.close();
//					System.out.println("파일이 닫힙니다.");
//				}catch(IOException e) {
//					System.out.println(e);
//				}
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e);
//		}
//		System.out.println("여기도 수행됩니다.");
		
		FileInputStream fis = null;
		try {
			//a.txt가 없을수도 있으니 미리 예외 처리를 진행 해라
			fis = new FileInputStream("C:\\Users\\lgh_0326\\git\\JavaStudy\\src\\chap14\\exception\\a1.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return;
		//finally는 try나 catch에 return문이 있어도 수헹됨 
		}finally {
			if(fis != null) {
				try {
					fis.close();
				}catch (IOException e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}
			System.out.println("항상 수행됩니다.");
		}
		System.out.println("여기도 수행됩니다.");
		
	}
}
