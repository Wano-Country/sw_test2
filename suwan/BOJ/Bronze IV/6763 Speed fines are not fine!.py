line = int(input())
speed = int(input())
pay = 0
if 1 <= speed - line <= 20:
    pay = 100
elif 21 <= speed - line <= 30:
    pay = 270
elif 31 <= speed - line:
    pay = 500

if pay:
    print(f'You are speeding and your fine is ${pay}.')
else:
    print("Congratulations, you are within the speed limit!")
