package test.programmers.level2;

import java.util.*;

public class Compression {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("KAKAO")));
    }

    static int[] solution(String msg) {
        int[] answer = {};
        char ch = 'A';

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 1; i < 27; i++) {
            map.put(String.valueOf(ch++), i);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        int value = map.values().size();
        boolean isEnd = false;

        for(int i = 0; i < msg.length(); i++) {
            String w = msg.charAt(i) + "";

            while(map.containsKey(w)) {
                //입력 값이 저장되어 있으면 다음 인덱스 문자열을 계속 추가해준다.
                //인덱스가 문자열 길이랑 같아지면 break 해준다.
                i++;

                if(i == msg.length()) {
                    isEnd = true;
                    break;
                }

                w += msg.charAt(i);
            }

            //문자열이 모두 map 안에 있기 때문에 배열에 추가해주고 break 한다.
            if(isEnd) {
                arr.add(map.get(w).intValue());

                break;
            }

            arr.add(map.get(w.substring(0, w.length() - 1)).intValue());
            map.put(w, ++value);

            i--;
        }

        answer = new int[arr.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}
