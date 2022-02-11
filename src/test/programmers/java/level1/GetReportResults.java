package test.programmers.java.level1;

import java.util.*;

public class GetReportResults {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        System.out.println(Arrays.toString(solution(id_list, report, 2)));
    }

    static public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> userReport = new HashMap<>();
        Map<String, Integer> userCount = new HashMap<>();
        List<String> stop = new ArrayList<>();

        for(String rep : report) {
            String[] s = rep.split(" ");
            String key = s[0], value = s[1];
            Set<String> set = userReport.getOrDefault(key, new HashSet<>());
            set.add(value);
            userReport.put(key, set);
        }

        for(String id : id_list) {
            Set<String> users = userReport.get(id);
            if(users == null) {
                continue;
            }
            for(String user : users) {
                userCount.put(user, userCount.getOrDefault(user, 0) + 1);
            }
        }

        for(String id : id_list) {
            if(userCount.get(id) != null && userCount.get(id) >= k) {
                stop.add(id);
            }
        }

        for(int i = 0; i < id_list.length; i++) {
            int count = 0;
            String id = id_list[i];
            Set<String> users = userReport.get(id);

            if(users == null) {
                answer[i] = 0;
                continue;
            }

            for(String user : users) {
                if(stop.contains(user)) count++;
            }

            answer[i] = count;
        }

        return answer;
    }
}
