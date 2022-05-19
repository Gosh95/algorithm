package test.programmers.java.level2;

public class FindPrimeNumberInKthNumber {
    public int solution(int n, int k) {
        String[] nums = convert(n, k).split("0");
        int answer = 0;

        for (String num : nums) {
            if (isDigit(num)) {
                if (isPrime(Long.parseLong(num))) {
                    answer++;
                }
            }
        }

        return answer;
    }

    static boolean isDigit(String n) {
        return n.matches("[0-9]+");
    }

    static boolean isPrime(long n) {
        if (n == 1) {
            return false;
        }

        int range = ((int)Math.sqrt(n)) + 1;
        for (int i = 2; i < range; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static String convert(int n, int k) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int mod = n % k;
            sb.append(mod);
            n /= k;
        }

        return sb.reverse().toString();
    }
}
