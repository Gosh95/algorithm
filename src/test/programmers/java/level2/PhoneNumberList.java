package test.programmers.java.level2;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumberList {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book));
    }
    static public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < phone_book.length; i++) {
            hashMap.put(phone_book[i], i);
        }

        for(int i = 0; i < phone_book.length; i++) {
            String phone_number = phone_book[i];
            for(int j = 1; j < phone_number.length(); j++) {
                if(hashMap.containsKey(phone_number.substring(0, j))) {
                    return false;
                }
            }
        }
        return answer;
    }
}
