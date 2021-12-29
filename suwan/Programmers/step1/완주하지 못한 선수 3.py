def solution(p, c):
    p.sort()
    c.sort()
    for p_i, c_i in zip(p, c):
        if p_i != c_i:  # 순서대로 정렬 후 반복했을 때 다른 것이 있다면 실패자!
            return p_i
    return p[-1]  # 반복이 다 돌고도 return 이 안되면 p중 마지막이 실패


participant1 = ['leo', 'kiki', 'eden']
completion1 = ['eden', 'kiki']  # return "leo"

participant2 = ['marina', 'josipa', 'nikola', 'vinko', 'filipa']
completion2 = ['josipa', 'filipa', 'marina', 'nikola']  # return 'vinko'

participant3 = ['mislav', 'stanko', 'mislav', 'ana']
completion3 = ['stanko', 'ana', 'mislav']  # return 'mislav'

print(solution(participant1, completion1))
print(solution(participant2, completion2))
print(solution(participant3, completion3))
