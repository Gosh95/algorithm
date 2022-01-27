package test.programmers.java.level2;

public class JustThatSong {
    public static void main(String[] args) {
        JustThatSong jts = new JustThatSong();

        String m = "CC#BCC#BCC#BCC#B";
        String[] info = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};

        jts.solution(m, info);
    }

    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        m = convert(m);
        int max = 0;

        for(String music : musicinfos) {
            String[] info = music.split(",");
            String title = info[2];
            String[] code = convert(info[3]).split("");
            String[] startTime = info[0].split(":");
            String[] endTime = info[1].split(":");

            int hour = (Integer.parseInt(endTime[0]) - Integer.parseInt(startTime[0])) * 60;
            int minute = Integer.parseInt(endTime[1]) - Integer.parseInt(startTime[1]);
            int playTime = hour + minute;

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < playTime; i++) {
                sb.append(code[i % code.length]);
            }

            if(sb.toString().contains(m)) {
                if(max < sb.toString().length()) {
                    max = sb.toString().length();
                    answer = title;
                }
            }
        }

        return answer;
    }

    private String convert(String melody) {
        //이게 문제였음. 위에 로직에서 스플릿으로 나눌 경우 # 을 따로 세기 때문에 길이가 안맞아서 계속 실패함.
        //A# 을 두 개의 길이로 세는것이 아닌 한개로 세기 위해서 소문자 a 로 바꿔줌.
        melody = melody.replaceAll("A#", "a");
        melody = melody.replaceAll("C#", "c");
        melody = melody.replaceAll("D#", "d");
        melody = melody.replaceAll("F#", "f");
        melody = melody.replaceAll("G#", "g");

        return melody;
    }
}
