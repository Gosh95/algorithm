package test.thisiscodingtest.java.implementation;

public class StringCompression {
    public int solution(String s) {
        int answer = s.length();
        for(int step = 1; step < s.length() / 2 + 1; step++) {
            StringBuilder compressed = new StringBuilder();
            String prev = s.substring(0, step);
            int count = 1;

            for(int j = step; j < s.length(); j += step) {
                StringBuilder temp = new StringBuilder();
                for(int i = j; i < j + step; i++) {
                    if(i < s.length()) {
                        temp.append(s.charAt(i));
                    }
                }

                if(prev.equals(temp.toString())) {
                    count++;
                } else {
                    compressed.append((count >= 2) ? count + prev : prev);
                    prev = temp.toString();
                    count = 1;
                }
            }

            compressed.append((count >= 2) ? count + prev : prev);
            answer = Math.min(answer, compressed.length());
        }

        return answer;
    }
}
