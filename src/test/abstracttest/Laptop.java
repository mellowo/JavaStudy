package test.abstracttest;

public class Laptop extends Computer{

	@Override
	public void display() {
		System.out.println("display()메서드 오버라이딩");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Computer lt = new Laptop();
		System.out.println(lt.a);
		lt.display();
	}
}
