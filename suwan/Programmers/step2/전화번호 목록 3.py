def solution(phone_book):
    for phone in phone_book:
        cnt = 0
        phone_len = len(phone)
        for phone2 in phone_book:
            if phone == phone2[:phone_len]:
                cnt += 1
                if cnt == 2:
                    return False
    return True