package chap15.stream.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShellTest {
    public static void main(String[] args) throws IOException {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec("/Users/igeonhyeong/Desktop/JavaStudy/test.sh");
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String line = br.readLine();
        System.out.println(line);
    }
}
