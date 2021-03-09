def solution(b, y):
    # b+y 의 약수 구하기..
    # 그 중 2x+2y-4 를 한 값이 brown 와 같은 약수 찾기

    # 약수 리스트
    m_list = []
    num = b + y
    for i in range(1, num // 2):
        if num % i == 0:
            m_list.append([i, num // i])
    for m in m_list:
        if m[0] <= m[1]:
            if 2 * m[0] + 2 * m[1] - 4 == b:
                return m[::-1]
