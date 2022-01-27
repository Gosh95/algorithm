package test.programmers.java.level2;

public class JumpAndTeleportation {
    public static void main(String[] args) {
        System.out.println(solution(5000));
    }

    static public int solution(int n) {
        int ans = 0;

        //효율성 테스트를 통과하기 위해 Math 함수를 빼고 적용
        while(n != 0) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
                ans++;
            }
        };

/*          내가 푼 답안. 테스트는 다 통과했지만 Math.floor 때문인지 효율성 테스트는 실패했다.
            while(n != 0) {
            if(n % 2 == 1) ans++;
            n = (int)Math.floor(n / 2);
        };*/

        return ans;
    }
}
