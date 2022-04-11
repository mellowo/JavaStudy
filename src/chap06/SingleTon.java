package chap06;

public class SingleTon {

    //인스턴스는 한개만 생성되도록 한다.
    private static SingleTon singleton = new SingleTon();

    private SingleTon(){};

    public static SingleTon getInstance(){
        return singleton;
    }
    public static void showInstanceInfo(){
        System.out.println(singleton);
    }

}
