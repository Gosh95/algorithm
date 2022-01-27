package test.programmers.java.level1;

public class DartGame {
    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));
    }

    static int solution(String dartResult) {
        int answer = 0;
        char[] chars = dartResult.toCharArray();
        int[] nums = new int[3];
        int count = -1; //keyPoint

        for(int i = 0; i < chars.length; i++) {
            char ch = chars[i];

            if(ch >= '0' && ch <= '9') {
                count++;
                if(ch == '1' && chars[i + 1] == '0') {
                    nums[count] = 10;
                    i++; //10 으로 인덱스를 두자리 차지하기 때문에 i++
                } else {
                    nums[count] = ch - '0';
                }
            } else if(ch == 'S') {
                nums[count] = (int) Math.pow(nums[count], 1);
            } else if(ch == 'D') {
                nums[count] = (int) Math.pow(nums[count], 2);
            } else if(ch == 'T') {
                nums[count] = (int) Math.pow(nums[count], 3);
            } else if(ch == '*') {
                if(count > 0) { //첫번째 숫자가 아니면 현재 숫자와 전의 숫자 둘다 *2
                    nums[count - 1] *= 2;
                }
                nums[count] *= 2;
            } else if(ch == '#') {
                nums[count] *= -1;
            } else {
                continue;
            }
        }

        answer += nums[0] + nums[1] + nums[2];

        return answer;
    }
}
