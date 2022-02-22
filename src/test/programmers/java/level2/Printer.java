package test.programmers.java.level2;

import java.util.*;

public class Printer {
    public static void main(String[] args) {

    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++) {
            int[] arr = {priorities[i], i};
            queue.offer(arr);
        }

        Arrays.sort(priorities);
        int idx = priorities.length - 1;
        int turn = 1;
        while(!queue.isEmpty()) {
            while(queue.peek()[0] != priorities[idx]) {
                queue.offer(queue.poll());
            }

            int[] peekItems = queue.peek();

            if(peekItems[0] == priorities[idx]) {
                if(peekItems[1] == location) {
                    answer = turn;
                    break;
                } else {
                    queue.poll();
                    idx--;
                    turn++;
                }
            }
        }

        return answer;
    }
}
