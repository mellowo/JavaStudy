package chap13.innerclass;

class Outer{
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i){
        int num = 100;

        class MyRunnable implements Runnable {
            int localNum = 10;

            @Override
            public void run() {
                //num = 200; 지역변수는 상수처리됨 따라서 값을 바꿀 수없음
                System.out.println(i);
                System.out.println(num);
            }
        }
        return new MyRunnable();
    }
}

public class LocalInnerTest {
    public static void main(String[] args) {
        Outer out = new Outer();
        Runnable runner = out.getRunnable(20);
        runner.run();
    }
}
