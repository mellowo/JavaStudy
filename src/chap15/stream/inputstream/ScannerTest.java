package chap15.stream.inputstream;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("이름 : ");
        String name = scan.nextLine();
        System.out.println(name);

        Scanner scan1 = new Scanner("ATAGATAG");
        String seq = scan1.nextLine();
        System.out.println(seq);
    }

}
