package test.programmers.level2;

import java.util.Arrays;

public class Lifeboat {
    public static void main(String[] args) {
        int limit = 100;
        int[] arr = {70, 80, 50};

        System.out.println(solution(arr, limit));
    }

    static public int solution(int[] people, int limit) {
        int answer = 0;
        int min = 0;

        Arrays.sort(people);

        for(int max = people.length - 1; max >= min; max--) {
            if(people[min] + people[max] > limit) {
                answer++;
            } else {
                //문제 조건이 두 명 밖에 탈 수 없으므로 두 무게의 합이 제한 무게보다 작아도 보트에 태워서 보내야한다.
                answer++;
                min++;
            }
        }

        return answer;
    }
}
