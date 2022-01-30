import datetime

def solution(a, b):
    day = ['MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT', 'SUN']
    idx = datetime.date(2016, a, b).weekday()
    return "".join(day[idx])
