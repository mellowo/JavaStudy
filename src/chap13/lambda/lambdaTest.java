package chap13.lambda;

public class lambdaTest {
	public static void main(String[] args) {
		Test test = new Test() {
			
			@Override
			public void printname(String name) {
				// TODO Auto-generated method stub
				System.out.println(name);
			}
		};
		
		test.printname("aaaaa");
		
		
		Test test1 = new Test() {
			
			@Override
			public void printname(String name) {
				// TODO Auto-generated method stub
				System.out.println(name + "added");
			}
		};
		
		test1.printname("hahaha");
		
		
		Test tes2 = (name) -> {
			System.out.println(name + "lamdba");
		};
		
		
		tes2.printname("ttt");
	}
	
}
