package chap13.lambda;

interface PrintString {
    void showString(String str);
}

public class TestLambda {
    public static void main(String[] args) {
        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("hello lambda_1");
        showMyString(lambdaStr); //매개변수로 전달되는 람다식

        PrintString reStr = returnString();
        reStr.showString("hello");
        System.out.println("git test111");
    }

    private static PrintString returnString() {
        return s -> System.out.println(s + " world");
    }

    private static void showMyString(PrintString p) {
        p.showString("hello lambda_2");
    }
}
