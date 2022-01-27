package test.programmers.java.level1;

public class MakeDecimal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 6, 4};

        System.out.println(solution(arr));
    }

    static int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int value = nums[i] + nums[j] + nums[k];
                    if(chkDecimal(value)) {
                        answer += 1;
                    }
                }
            }
        }

        return answer;
    }

    static boolean chkDecimal(int value) {
        int count = 0;

        for(int i = 1; i <= value; i++) {
            if (value % i == 0) count++;
        }

        return count <= 2 ? true : false;
    }
}
