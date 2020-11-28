def solution(s):
    list1 = []
    for i in range(len(s)):
        list1.append(s[i])
    list1.sort()
    list1.reverse()
    answer = "".join(list1)
    return answer
