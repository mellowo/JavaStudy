package chap09.abstractex;


// 추상 클래스 - 추상 메서드를 포함한 클래스
public abstract class Computer {

    //추상 메서드
    public abstract void display(); // 구현부 (body)가 없어야 한다. {}를 쓰면 안됨
    public abstract void typing();

    public void turnOn(){
        System.out.println("전원을 켭니다");
    }
    public void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}
