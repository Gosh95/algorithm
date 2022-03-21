package test.programmers.java.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenChatRoom {
    public String[] solution(String[] record) {
        String[] answer = {};
        List<String> arr = new ArrayList<>();
        String enter = "님이 들어왔습니다.";
        String leave = "님이 나갔습니다.";

        Map<String, String> map = new HashMap<>();
        for(String s : record) {
            String[] items = s.split(" ");
            if(items.length == 3) {
                map.put(items[1], items[2]);
            }
        }

        for(String s : record) {
            String[] items = s.split(" ");
            if(items[0].equals("Enter")) {
                arr.add(map.get(items[1]) + enter);
            } else if(items[0].equals("Leave")) {
                arr.add(map.get(items[1]) + leave);
            }
        }

        answer = new String[arr.size()];

        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}