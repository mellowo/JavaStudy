package chap10.interfaceex;

public class CompleteCalc extends Calculator{
    @Override
    public int times(int num1, int num2) {
        return num1 * num2 ;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 != 0 ){
            return num1 / num2 ;
        }else{
            return ERROR;
        }
    }

    public void showInfo(){
        System.out.println("Complete Calc 인터페이스를 구현하였습니다.");
    }
}
