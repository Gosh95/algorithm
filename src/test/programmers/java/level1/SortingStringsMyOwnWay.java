package test.programmers.java.level1;

import java.util.ArrayList;
import java.util.Collections;

public class SortingStringsMyOwnWay {
    String[] solution(String[] strings, int n) {
        String[] answer = {};
        answer = new String[strings.length];

        ArrayList<String> arr = new ArrayList<>();

        for(String str : strings) {
            arr.add(str.charAt(n) + str);
        }

        Collections.sort(arr);

        for(int i = 0; i < arr.size(); i++) {
            String str = arr.get(i);

            answer[i] = str.substring(1, str.length());
        }

        return answer;
    }
}
