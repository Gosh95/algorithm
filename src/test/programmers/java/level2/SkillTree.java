package test.programmers.java.level2;

public class SkillTree {
    public static void main(String[] args) {
        String str = "CBD";
        String[] arr = {"BACDE", "CBADF", "AECB", "BDA"};

        System.out.println(solution(str, arr));
    }
    static public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String skillTree : skill_trees) {
            String temp = skillTree;

            for(int i = 0; i < skillTree.length(); i++) {
                String s = String.valueOf(skillTree.charAt(i));

                if(!skill.contains(s)) {
                    temp = temp.replace(s, "");
                }
            }

            System.out.println(temp);

            if(skill.indexOf(temp) == 0) {
                answer++;
            }
        }
        return answer;
    }
}
