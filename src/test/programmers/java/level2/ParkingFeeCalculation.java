package test.programmers.java.level2;

import java.util.*;

public class ParkingFeeCalculation {
    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        System.out.println(solution(fees, records));
    }

    static public int[] solution(int[] fees, String[] records) {
        Arrays.sort(records, Comparator.comparingInt(o -> Integer.parseInt(o.split(" ")[1])));
        int basicTime = fees[0], basicFee = fees[1], addTime = fees[2], addFee = fees[3];

        Map<String, int[]> car = new LinkedHashMap<>();
        for (String record : records) {
            String[] info = record.split(" ");
            int[] timeInfo = Arrays.stream(info[0].split(":")).mapToInt(Integer::parseInt).toArray();
            int hour = timeInfo[0], minute = timeInfo[1];
            int time = (hour * 60) + minute;
            String carNumber = info[1], status = info[2];

            if (status.equals("IN")) {
                if (car.get(carNumber) == null) {
                    car.put(carNumber, new int[]{0, time, 0});
                } else {
                    car.put(carNumber, new int[]{0, time, car.get(carNumber)[2]});
                }
            } else {
                int[] carInfo = car.get(carNumber);
                car.put(carNumber, new int[]{1, 0, time - carInfo[1] + carInfo[2]});
            }
        }

        Iterator<String> keys = car.keySet().iterator();
        int[] answer = new int[car.size()];
        for(int i = 0; i < answer.length; i++) {
            int[] carInfo = car.get(keys.next());
            int status = carInfo[0], inTime = carInfo[1], sumTime = carInfo[2];
            int limitTime = ((23 * 60) + 59);
            if(status == 0) {
                sumTime += limitTime - inTime;
            }

            if(sumTime <= basicTime) {
                answer[i] = basicFee;
            } else {
                double doubleTime = (sumTime - basicTime) / (double) addTime;
                int intTime = (sumTime - basicTime) / addTime;
                if(doubleTime != intTime) {
                    intTime = (int) Math.ceil(doubleTime);
                }

                int price = basicFee + intTime * addFee;
                answer[i] = price;
            }
        }

        return answer;
    }
}
