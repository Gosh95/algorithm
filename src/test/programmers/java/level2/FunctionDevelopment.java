package test.programmers.java.level2;

import java.util.*;

public class FunctionDevelopment {
    public static void main(String[] args) {
        int[] p = new int[]{93, 30, 55};
        int[] s = new int[]{1, 30, 5};

        System.out.println(Arrays.toString(solution(p, s)));
    }
    static public int[] solution(int[] progresses, int[] speeds) {
        LinkedList<Integer> queue = new LinkedList<>();
        List<Integer> temp_answer = new ArrayList<>();

        for(int i = 0; i < progresses.length; i++) {
            int time = (int)(Math.ceil((100 - progresses[i]) / (float)speeds[i]));

            while(!queue.isEmpty() && queue.peekFirst() < time) {
                temp_answer.add(queue.size());
                queue.clear();
            }

            queue.offer(time);
        }

        temp_answer.add(queue.size());

        int[] answer = temp_answer.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}

