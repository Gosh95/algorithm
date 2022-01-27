package test.programmers.java.level2;

import java.util.Arrays;
import java.util.Comparator;

public class SortFileName {
    public static void main(String[] args) {
        String[] arr = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};

        System.out.println(Arrays.toString(solution(arr)));
    }

   static String[] solution(String[] files) {
        String[] answer = {};

        answer = files.clone();

        Arrays.sort(answer, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //정규식 [0-9] : 0 ~ 9 숫자를 기준으로 나눈다.
                String head1 = o1.split("[0-9]")[0];
                String head2 = o2.split("[0-9]")[0];

                //대소문자 무시하고 비교
                int result = head1.compareToIgnoreCase(head2);

                //만약 같을 경우 헤드 뒤에 숫자로 비교
                if(result == 0) {
                    result = compareNum(o1, head1) - compareNum(o2, head2);
                }

                return result;
            }
        });

        return answer;
    }

    private static int compareNum(String str, String head) {
        //head 제외 뒷부분만 추출
        str = str.substring(head.length());

        //뒤에 숫자 담을 변수
        String num = "";

        for(char ch : str.toCharArray()) {
            //문자가 정수 이고 총 숫자 길이가 5자리 밑일 경우 num 에 숫자 추가
            if(Character.isDigit(ch) && num.length() < 5) {
                num += ch;
            } else {
                break;
            }
        }

        return Integer.parseInt(num);
    }
}
