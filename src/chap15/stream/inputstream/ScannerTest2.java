package chap15.stream.inputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new File("a.txt"));
			String alpha = scan.nextLine();
			System.out.println(alpha);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
