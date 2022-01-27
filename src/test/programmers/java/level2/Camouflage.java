package test.programmers.java.level2;

import java.util.HashMap;
import java.util.Iterator;

public class Camouflage {
    public static void main(String[] args) {
        String[][] arr = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(arr));
    }

    static public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();

        for(String[] clothe : clothes) {
            //2차 배열을 이와같거나, 스트림 으로 나눌 경우 각 행(1차배열) 이 된다.
            String type = clothe[1];

            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        Iterator<Integer> iterator = map.values().iterator();

        while(iterator.hasNext()) {
            //모든 옷 종류를 입지 않는 경우(하나씩만 입는 경우) 가 있으니 + 1
            answer *= iterator.next().intValue() + 1;
        }

        //아무것도 입지 않는 경우 - 1
        return answer - 1;
    }
}
