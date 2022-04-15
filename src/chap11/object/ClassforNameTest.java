package chap11.object;

import java.lang.reflect.Constructor;

public class ClassforNameTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass = Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();
		
		for ( Constructor c : cons) {
			System.out.println(c);
		}
	}
}
