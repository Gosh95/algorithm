import math

def solution(fees, records):
    answer = []
    basic_time, basic_fee, add_time, add_fee = fees[0], fees[1], fees[2], fees[3]
    records = sorted(records, key=lambda x: x.split()[1])
    car = {r.split()[1]: 0 for r in records}

    for i in range(len(records)):
        info = records[i].split()
        hour, minute = map(int, info[0].split(":"))
        time = (hour * 60) + minute
        car_number, status = info[1], info[2]
        if status == "IN":
            if car[car_number] == 0:
                car[car_number] = [0, time, 0]  # status, in_time, sum_time
            else:
                car[car_number] = [0, time, car.get(car_number)[2]]
        else:
            status, in_time, sum_time = car.get(car_number)
            car[car_number] = [1, 0, time - in_time + sum_time]

    for c in car:
        status, in_time, sum_time = car.get(c)
        limit_time = ((23 * 60) + 59)
        if status == 0:
            sum_time += limit_time - in_time
        if sum_time <= basic_time:
            answer.append(basic_fee)
        else:
            over_time = (sum_time - basic_time) / add_time
            if str(over_time) != str((sum_time - basic_time) // add_time):
                over_time = math.ceil(over_time)
            price = basic_fee + over_time * add_fee
            answer.append(price)
    return answer

print(solution([180, 5000, 10, 600], ["05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"]))