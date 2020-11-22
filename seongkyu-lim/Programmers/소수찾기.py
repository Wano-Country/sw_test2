
# using 에라토스테네스의 체


def eratos(list_num):
    i = 0
    while i < len(list_num):
        j = 2
        while list_num[i]*j <= list_num[len(list_num)-1]:
            if list_num[i]*j in list_num:
                list_num.remove(list_num[i]*j)
            j += 1
        i += 1
    return len(list_num)


def solution(n):
    list1 = list(range(2, n+1))
    answer = eratos(list1)
    return answer


num = 10

print(solution(num))


# list안의 값 확인 :  if item in list : / else :
# list.remove() -> 값으로 삭제 , del list_num[] -> index로 삭제
# 연속되는 숫자 list 생성 : a= list(range(n))


'''
# time error

    for i in range(0, n):
        num = n-i
        count = 0
        for j in range(2, num):
            if num % j == 0:
                break
            else:
                count += 1
        if count == num-2:
            answer += 1
    return answer

'''
