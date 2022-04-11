package chap10.scheduler;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.next();

        System.out.println(name.equals("이건형"));
    }
}
