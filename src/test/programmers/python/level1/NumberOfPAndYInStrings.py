def solution(s):
    # count = 0
    # for i in range(len(s)):
    #     if s[i] == 'p' or s[i] == 'P':
    #         count += 1
    #     elif s[i] == 'y' or s[i] == 'Y':
    #         count -= 1
    # return True if count == 0 else False
    return s.lower().count('p') == s.lower().count('y')
    # count 함수를 활용해서 두 문자의 갯수가 같으면 True 아니면 False 를 반환한다.




