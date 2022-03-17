package test.programmers.java.level2;

import java.util.PriorityQueue;

public class MoreSpicy {
    public static void main(String[] args) {

    }

    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(int i : scoville) {
            queue.offer(i);
        }

        while(queue.peek() < K) {
            queue.offer(queue.poll() + (queue.poll() * 2));
            answer++;

            if(queue.size() == 1 && queue.peek() < K) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}
