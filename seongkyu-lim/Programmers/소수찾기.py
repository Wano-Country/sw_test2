def prime_list(n):

    sieve = [True] * (n+1)

    m = int(n ** 0.5)
    for i in range(2, m + 1):
        if sieve[i] == True:
            for j in range(i+i, n+1, i):
                sieve[j] = False
                print(j)

    return [i for i in range(2, n+1) if sieve[i] == True]


print(len(prime_list(5)))

# list 값 true false 로 바꿔주는 것이 훨씬 시간면에서 단축 되는 듯.
# -> reason : ??

'''
# using 에라토스테네스의 체
#time error

def eratos(list_num):
    i = 0
    length = int(len(list_num)**0.5)
    while list_num[i] < length+1:
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

'''

# for 구문은 len(list 갱신안되지만 while 구문은 len(list) 변경되었을 때 갱신됨.

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
