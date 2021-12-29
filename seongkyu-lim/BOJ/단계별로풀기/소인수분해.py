num = int(input())

for i in range(2, num):
    while num % i == 0:
        num = num/i
        print(i)

num2 = num

if num2 == num and num != 1:
    print(num)
