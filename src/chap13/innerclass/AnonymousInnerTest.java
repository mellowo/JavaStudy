package chap13.innerclass;

class Outer2 {
    Runnable getRunnable(int i){
        int num = 100;
        return  new Runnable() {
            @Override
            public void run() {
                System.out.println(i);
                System.out.println(num);
            }
        };
    }
    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable이 구현된 익명 클래스 변수");
        }
    };
}

public class AnonymousInnerTest {
    public void test(){
        System.out.println("test");
    }
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        Runnable runner = outer2.runner;
        AnonymousInnerTest at = new AnonymousInnerTest();
        at.test();
    }
}
