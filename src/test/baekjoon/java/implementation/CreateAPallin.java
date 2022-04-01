package test.baekjoon.java.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CreateAPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String string = br.readLine();
        String revString = sb.append(string).reverse().toString();

        for(int i = 0; i < string.length(); i++) {
            if(string.substring(i).equals(revString.substring(0, revString.length() - i))) {
                System.out.println(string.length() + i);
                break;
            }
        }
    }
}
