package chap11.object;

public class StringTest {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		
		System.out.println(System.identityHashCode(str1));
		str1 = str1.concat(str2);
		System.out.println(System.identityHashCode(str1));
	}
}
