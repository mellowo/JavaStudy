package chap10.scheduler;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("순서대로 대기열에서 전화를 받아옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("대기가 가장 적은 상담원에게 전달합니다.");
    }
}
