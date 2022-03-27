package test.thisiscodingtest.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlipString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        String[] one = num.split("0");
        int toZero = 0;
        for(String o : one) {
            if(o.contains("1")) toZero++;
        }

        String[] zero = num.split("1");
        int toOne = 0;
        for(String z : zero) {
            if(z.contains("0")) toOne++;
        }

        System.out.println(Math.min(toZero, toOne));
    }
}
