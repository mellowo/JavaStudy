package chap06;

public class SingleTonTest {
    public static void main(String[] args) {
        SingleTon singleton = SingleTon.getInstance();

        System.out.println(singleton);
        singleton.showInstanceInfo();
    }
}
