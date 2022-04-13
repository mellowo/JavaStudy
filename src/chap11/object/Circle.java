package chap11.object;

class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Circle implements Cloneable {  //해당객체를 복제해도 된다는 의미로 Cloneable 인터페이스를 함께 선언 
	Point point;
	int radius;
	
	
	public Circle(Point point, int radius) {
		this.point = point;
		this.radius = radius;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {  //clone() 메서드를 사용할 때 발생할 수 있는 오류를 예외 처리함 
		// TODO Auto-generated method stub
		return super.clone();
	}
}
