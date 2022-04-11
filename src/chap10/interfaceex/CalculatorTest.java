package chap10.interfaceex;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        Calc cal = new CompleteCalc() ;

        System.out.println(cal.add(num1,num2));

        if (cal instanceof CompleteCalc){
            CompleteCalc ccal = (CompleteCalc) cal;
            ccal.showInfo();
        }

    }
}
