class SoldOutError(Exception):
    def __init__(self, message):
        Exception.__init__(self)
        self.message = message

    def __str__(self):
        return self.message

chicken = 10
waiting = 1

while True:
    try:
        print(f"남은 치킨 개수: {chicken}")
        num = int(input())
        if num < 1 or type(num) != int:
            raise ValueError
        elif num > chicken:
            raise SoldOutError(f"죄송합니다. 현재 남아있는 치킨은 {chicken} 마리 입니다.")

        print(f"[대기번호 {waiting}] {num} 마리 주문이 완료되었습니다.")
        chicken -= num
        waiting += 1

        if chicken == 0:
            print("재고가 소진되어 더 이상 주문을 받지 않습니다.")
            break
    except ValueError:
        print("잘못된 값을 입력하였습니다.")
    except SoldOutError as err:
        print(err)

