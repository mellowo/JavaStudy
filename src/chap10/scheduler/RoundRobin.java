package chap10.scheduler;

public class RoundRobin implements Scheduler
{
    @Override
    public void getNextCall() {
        System.out.println("순서대로 전화대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음순번의 상담원에게 전달합니다.");
    }
}
