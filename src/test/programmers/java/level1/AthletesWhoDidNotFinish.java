package test.programmers.java.level1;

import java.util.HashMap;

public class AthletesWhoDidNotFinish {
    public static void main(String[] args) {
        String[] str = {"mislav", "stanko", "mislav", "ana"};
        String[] str2 = {"stanko", "ana", "mislav"};

        System.out.println(solution(str, str2));
    }

    static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for(String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
            // 키 값 밸류가 없으면 default + 1 있으면 원래 값 + 1
        }

        for(String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        for(String key : map.keySet()) {
            if(map.get(key) != 0) {
                answer += key;
            }
        }

        return answer;
    }

}
