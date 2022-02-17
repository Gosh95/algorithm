package test.baekjoon.java.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Jewel {
    int mass;
    int value;

    Jewel(int mass, int value) {
        this.mass = mass;
        this.value = value;
    }
}

public class JewelThief {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Jewel[] jewels = new Jewel[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int mass = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            jewels[i] = new Jewel(mass, value);
        }

        Arrays.sort(jewels, new Comparator<Jewel>() {
            @Override
            public int compare(Jewel o1, Jewel o2) {
                if(o1.mass == o2.mass) {
                    return (o2.value - o1.value);
                }

                return o1.mass - o2.mass;
            }
        });

        int[] bags = new int[K];
        for(int i = 0; i < K; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(bags);

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        long result = 0;
        for(int i = 0, idx = 0; i < K; i++) {
            while(idx < N && jewels[idx].mass <= bags[i]) {
                queue.offer(jewels[idx++].value);
            }

            if(!queue.isEmpty()) {
                result += queue.poll();
            }
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
