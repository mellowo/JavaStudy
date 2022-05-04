package chap14.exception;

public class ArrayExceptionHandling {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			for (int i = 0 ; i <= 5 ; i++) {
				arr[i] = i;
				System.out.println(i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("예외처리 부분");
		}
		System.out.println("프로그램 종료");
	}
}
