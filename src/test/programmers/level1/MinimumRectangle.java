package test.programmers.level1;

public class MinimumRectangle {
    public static void main(String[] args) {
        int[][] matrix = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
    }

    static int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth = 0;
        int maxLength = 0;

        for(int i = 0; i < sizes.length; i++) {
            int width = sizes[i][0];
            int length = sizes[i][1];

            int tempWidth = Math.max(width, length);
            int tempLength = Math.min(width, length);
            //keyPoint : 현재 주어진 직사각형의 형태를 보면 어떤 직사각형은 가로가 길고 어떤 직사각형은 세로가 길다.
            // 각 직사각형의 가장 긴 부분을 가로로 작은 부분을 세로로 모두 통일시켜준다.
            // 통일 시킨 후 각 가로 세로 길이에서 가장 큰 길이를 구해서 곱하면 된다.

            maxWidth = Math.max(maxWidth, tempWidth);
            maxLength = Math.max(maxLength, tempLength);
        }

        answer = maxWidth * maxLength;

        return answer;
    }
}
