package chap05.reference;

public class StudentTest {
    public static void main(String[] args) {
        Student lee = new Student();
        lee.setKorea("korea",100);
        lee.setMath("math",100);

        lee.printTotal();

    }
}
