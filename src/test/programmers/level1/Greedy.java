package test.programmers.level1;

public class Greedy {
    public static void main(String[] args) {
        int[] lost = {3};
        int[] reserve = {1};
        System.out.println(solution(5, lost, reserve));
    }

    static int solution(int n, int[] lost, int[] reserve) {
        int answer = n; //전체 학생 수

        int[] student = new int[n];

        for(int i : lost) student[i - 1]--; //잃어버린 학생 -1
        for(int i : reserve) student[i - 1]++; //여벌가진 학생 + 1

        for(int i = 0; i < student.length; i++) {
            if(student[i] == -1) { //잃어버린 학생이면
                if(i > 0 && student[i - 1] == 1) { //인덱스가 0 보다 크고 전의 학생이 여벌을 갖고 있는 학생일 경우
                    student[i]++;
                    student[i - 1]--;
                } else if(i < n - 1 && student[i + 1] == 1) { //인덱스가 n - 1 보다 작고 앞에 학생이 여벌을 갖고 있는 학생일 경우
                    student[i]++;
                    student[i + 1]--;
                } else {
                    answer--; //못 빌릴 경우 전체 학생 - 1
                }
            }
        }

        return answer;
    }
}
