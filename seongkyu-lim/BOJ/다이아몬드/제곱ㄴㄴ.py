import sys
# MAX가 200001인 이유는 최대 인풋의 제곱근보다 크기 때문이다
MAX = 200001

# mo : 뫼비우스 배열
mo = [0] * MAX
mo[1] = 1

# 뫼비우스 값 갱신
for i in range(1,MAX):
    j = 2 * i
    while j < MAX:
        mo[j] -= mo[i]
        j += i

# found : 1부터 num까지의 제곱ㄴㄴ수의 갯수를 리턴하는 함수
def found(num):
    res = 0
    for i in range(1, int(num ** 0.5) + 1):
        res += mo[i] * (num // (i * i))
    return res

n = int(sys.stdin.readline())
left = 1
right = 20000000000

# 이분탐색
while left < right:
    mid = (left + right) // 2
    now = found(mid)
    if now < n:
        left = mid + 1
    elif now > n:
        right = mid - 1
    else:
        right = mid
    #찾은뒤 now값은 항상 n보다 작고, 점점 left가 right가 되면서 끝남.
    #잘 이해안간다 이 부분.
    
print(left)

# 1. 어떠한 값까지의 제곱ㄴㄴ수를 구한다.(값-제곱수들) (뫼비우스 함수)
# 2. 어떠한 값이 k인지 체크한다. (binary search)

# 모방 코딩 // 높은 난이도의 알고리즘 개념을 요한다. 문제를 푸는 방식에 대한 깊고 체계적인 사고력을 요구한다.
# 뫼비우스 함수
# k번째 제곱ㄴㄴ수를 구하여라