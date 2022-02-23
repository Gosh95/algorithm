def solution(phone_book):
    answer = True
    hash_map = {number: 1 for number in phone_book}
    for phone_number in phone_book:
        for i in range(1, len(phone_number)):
            if hash_map.get(phone_number[0:i]) == 1:
                return False

    return True

print(solution(["119", "97674223", "1195524421"]))