def solution(s):
    if len(s) == 4 or len(s) == 6:
        for i in range(len(s)):
            chr_num = ord(s[i])
            if not (ord('0') <= chr_num and ord('9') >= chr_num):
                return False
    else:
        return False

    return True
