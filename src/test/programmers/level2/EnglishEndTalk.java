package test.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;

public class EnglishEndTalk {
    public static void main(String[] args) {
        String[] arr = 	{"hello", "one", "even", "never", "now", "world", "draw"};
        int n = 2;
        System.out.println(Arrays.toString(solution(n, arr)));

    }

    static public int[] solution(int n, String[] words) {
        int[] answer = {};
        int turn = 0;
        int nth = 0;
        boolean isFail = false;

        ArrayList<String> arr = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            if(!arr.contains(words[i])) {
                arr.add(words[i]);
            } else {
                turn = (i % n) + 1;
                nth = (i / n) + 1;
                isFail = true;
                break;
            }
        }

        int j = 0;

        while(!isFail) {
            String a = arr.get(j);
            String b= arr.get(++j);

            if(a.charAt(a.length() - 1) != b.charAt(0)) {
                turn = (j % n) + 1;
                nth = (j / n) + 1;
                isFail = true;
            }

            if(j == arr.size() - 1) break;
        }

        answer = new int[]{turn, nth};

        return answer;
    }
}
