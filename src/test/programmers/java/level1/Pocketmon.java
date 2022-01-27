package test.programmers.java.level1;


import java.util.HashSet;
import java.util.Set;

public class Pocketmon {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 2, 2, 4};
        System.out.println(solution(arr));
    }
    static int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();

        for(int i : nums) {
            set.add(i);
        }

        int maxCount = nums.length / 2; //최대 고를 수 있는 갯수
        int countOfTypes = set.size(); //종류의 갯수

        if(countOfTypes >= maxCount) { //종류의 갯수가 고를 수 있는 갯수보다 많다
            answer = maxCount;
        } else {
            answer = countOfTypes;
        }

        return answer;
    }
}
