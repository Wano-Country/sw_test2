angles = [int(input()) for _ in range(3)]

if sum(angles) != 180:
    print("Error")

else:
    if len(set(angles)) == 3:
        print("Scalene")
    elif len(set(angles)) == 2:
        print("Isosceles")
    else:
        print("Equilateral")