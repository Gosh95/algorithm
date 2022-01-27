package test.programmers.java.level1;

public class ConvertStringToNumber2 {
    public static void main(String[] args) {
        System.out.println(solution("onetwothree"));
    }
    static int solution(String s) {
        String[] numberStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numberStr.length; i++) {
            s = s.replaceAll(numberStr[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}
