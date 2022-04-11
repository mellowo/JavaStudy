package chap10.scheduler;

import java.io.IOException;
import java.util.Scanner;

public class SchedulerTest {
    public static void main(String[] args)  {
//        System.out.println("전화 상담 배분방식을 선택하세요 R L P");
//        int ch = System.in.read();
//        System.out.println((char)ch);
//        Scheduler scheduler = null;
//
//        if ( ch == 'R' || ch == 'r'){
//            scheduler = new RoundRobin();
//        }else if (ch == 'L' || ch == 'l'){
//            scheduler = new LeastJob();
//        }else if (ch == 'P' || ch == 'p'){
//            scheduler = new PriorityAllocation();
//        }
        System.out.println("전화 상담 배분방식을 선택하세요 R L P");
        Scanner scan = new Scanner(System.in);
        String mode = scan.next();
        Scheduler scheduler = null;

        if ( mode.equals("R") || mode.equals("r")){
            scheduler = new RoundRobin();
        }else if (mode.equals("L") || mode.equals("l")){
            scheduler = new LeastJob();
        }else if (mode.equals("P") || mode.equals("p")) {
            scheduler = new PriorityAllocation();
        }
        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
