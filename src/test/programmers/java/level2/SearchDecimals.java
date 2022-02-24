package test.programmers.java.level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class SearchDecimals {
    public static void main(String[] args) {
        solution("17");
    }

    static public int solution(String numbers) {
        List<Integer> nums = Arrays.stream(numbers.split("")).map(i -> Integer.parseInt(i)).sorted().collect(toList());
        Collections.sort(nums, Collections.reverseOrder());
        String temp = "";
        for(int i : nums) {
            temp += i;
        }

        int maxValue = Integer.parseInt(temp);
        boolean[] isNotDecimal = new boolean[maxValue + 1];
        for(int i = 2; i < (int)(Math.sqrt((maxValue + 1))) + 1; i++) {
            if(!isNotDecimal[i]) {
                for(int j = i + i; j < maxValue + 1; j += i) {
                    isNotDecimal[j] = true;
                }
            }
        }

        int answer = 0;
        for(int i = 2; i < maxValue + 1; i++) {
            if(!isNotDecimal[i]) {
                boolean right = true;
                String num = String.valueOf(i);
                String tempNumbers = numbers;
                for(int j = 0; j < num.length(); j++) {
                    if(tempNumbers.indexOf(num.charAt(j)) == -1) {
                        right = false;
                        break;
                    } else {
                        tempNumbers = tempNumbers.replaceFirst(String.valueOf(num.charAt(j)), "");
                    }
                }
                if(right) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
