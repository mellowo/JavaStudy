package chap09.abstractex;

public class ComputerTest {
    public static void main(String[] args) {
        Computer c1 = new MyDesktop();
        c1.turnOn();
        c1.turnOff();
        c1.display(); //Desktop에서 구현
        c1.typing();  //MyDesktop에서 구현
    }
}
