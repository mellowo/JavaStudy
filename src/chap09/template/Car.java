package chap09.template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }
    public  void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    //템플릿 메서드 -> 일련의 순서 (시나리오 구현) 수정할수 없다. final 키워드로 구현
    public final void run(){
        startCar();
        drive();
        stop();
        turnOff();

    }
}

