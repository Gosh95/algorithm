package test.programmers.java.level2;

import java.util.LinkedList;
import java.util.Queue;

public class TruckCrossingTheBridge {
    public static void main(String[] args) {
        int length = 2;
        int weight = 10;
        int[] arr = {7, 4, 5, 6};

        System.out.println(solution(length, weight, arr));
    }

    static public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int count = 0;
        int sum = 0;

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < truck_weights.length; i++) {
            int truck = truck_weights[i];

            while(true) {
                if(queue.isEmpty()) {
                    queue.add(truck);
                    sum += truck;
                    count++;

                    break;
                } else if(queue.size() == bridge_length) {
                    sum -= queue.poll();
                    //값을 리턴하면서 제거도 해준다.
                } else {
                    if(sum + truck <= weight) {
                        queue.add(truck);
                        sum += truck;
                        count++;

                        break;
                    } else {
                        queue.add(0);
                        count++;
                    }
                }
            }
        }

        answer = count + bridge_length;

        return answer;
    }
}
