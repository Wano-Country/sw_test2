def solution(arr):
    '''
    answer = arr
    if len(answer) > 1 :
        small = arr[0]
        for i in range(1,len(arr)) :
            if arr[i]<small :
                small = arr[i]
        answer.remove(small)
    else :
        answer[0] = -1
    '''
    if len(arr) > 1:
        arr.remove(min(arr))
    else:
        arr[0] = -1
    answer = arr
    return answer
