package test.programmers.level1;

public class HashadSu {
    public static void main(String[] args) {
        System.out.println(solution(11));
    }

    static boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        char[] chars = String.valueOf(x).toCharArray();

        for(char ch : chars) {
            sum += ch - '0';
        }

        return answer = x % sum == 0 ? true : false;
    }
}
