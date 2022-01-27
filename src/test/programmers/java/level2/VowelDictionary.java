package test.programmers.java.level2;

public class VowelDictionary {
    public static void main(String[] args) {
        System.out.println(solution("i"));
    }
    static int solution(String word) {
        //패턴을 찾아야한다.
        //5 글자의 패턴을 찾기는 어렵기 때문에 2글자로 먼저 쪼개서 패턴을 찾는 것도 하나의 방법이다.
        //A, B 두 글자로 가정하면 A, AA, AB, B, BB, BA 가 된다.
        //패턴은 A 로 (시작하는 두 글자 수 + A 로 시작하는 한 글자 수) * 총 글자 수(A, B) 를 하면 6이 나오게 된다.
        //이를 AEIOU 다섯 글자로 적용하면 ((((5 + 1) * 5 + 1) 5 + 1) 5 + 1) * 5 이런 공식이 성립되고
        //문자의 위치 순으로 [781, 156, 31, 6, 1] 이 구해지고 이를 이용하여 풀면 된다. 
        int answer = word.length();
        int[] value = {781, 156, 31, 6, 1};
        String vowel = "AEIOU";

        for(int i = 0; i < word.length(); i++) {
            int idx = vowel.indexOf(String.valueOf(word.charAt(i)).toUpperCase());
            answer += value[i] * idx;
        }

        return answer;
    }
}
