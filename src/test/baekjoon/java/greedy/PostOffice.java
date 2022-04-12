package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

class TownInfo {
    long town;
    long people;

    public TownInfo(long town, long people) {
        this.town = town;
        this.people = people;
    }
}

public class PostOffice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<TownInfo> townInfos = new ArrayList<>();
        StringTokenizer st;
        long peopleCnt = 0;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            long town = Integer.parseInt(st.nextToken());
            long people = Integer.parseInt(st.nextToken());

            townInfos.add(new TownInfo(town, people));
            peopleCnt += people;
        }

        townInfos.sort(Comparator.comparingLong(t -> t.town));

        if(peopleCnt % 2 == 1) {
            peopleCnt += 1;
        }

        long halfCnt = peopleCnt / 2;

        long tempCnt = 0;
        long answer = 0;
        for(TownInfo t : townInfos) {
           tempCnt += t.people;
           if(tempCnt >= halfCnt) {
               answer = t.town;
               break;
           }
        }

        System.out.println(answer);
    }
}
