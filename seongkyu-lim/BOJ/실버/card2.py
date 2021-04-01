from collections import deque

n = int(input())

num_list = deque()

for i in range(n):
    num_list.append(i+1)
    
while len(num_list) != 1 :
    num_list.popleft()
    num_list.append(num_list[0])
    num_list.popleft()
    
print(num_list[0])

# deque (스택과 큐의 연산을 모두 지원하는 자료구조)
# doubly linked list로 연결되어있어 단순 삽입 삭제 시 O(1)