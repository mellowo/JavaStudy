package chap13.innerclass;

class OutClass {
    private int num = 10;
    private static int sNum = 20;

    InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass {
        int inNum = 100;

        //static int sInNum = 200; 인스턴스 내부 클래스에 정적 변수 선언 불가능함
        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 인스턴스 변수)");
        }
        //static void sTest(){}; 정적 메서드 정의 불가능
    }

    static class InStaticClass{
        int inNum = 100;
        static int sInNum = 200;
    }


    public void usingClass(){
        inClass.inTest();
    }

}
public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.inClass.inTest();
        outClass.usingClass();

        OutClass outClass1 = new OutClass();
        OutClass.InClass inclass = outClass1.new InClass();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        System.out.println(sInClass.inNum);
        System.out.println(OutClass.InStaticClass.sInNum);
    }
}
