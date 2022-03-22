package test.programmers.java.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Tuple {
    public int[] solution(String s) {
        int[] answer = {};
        List<Integer> arr = new ArrayList<>();
        String[] strList = s.replace("{", "").replace("}}", "").split("},");
        Arrays.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for(String str : strList) {
            String[] temp = str.split(",");
            for(String t : temp) {
                int num = Integer.parseInt(t);
                if(!arr.contains(num)) {
                    arr.add(num);
                }
            }
        }

        answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}
