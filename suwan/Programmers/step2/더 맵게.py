import heapq
def solution(s_l, K):
    heap = []
    for num in s_l:
        heapq.heappush(heap,num)
    # print(heap)
    mix_cnt = 0
    while heap[0]<K:
        try:
            heapq.heappush(heap, heapq.heappop(heap) + heapq.heappop(heap)*2)
        except:
            return -1
        mix_cnt += 1
    return mix_cnt
