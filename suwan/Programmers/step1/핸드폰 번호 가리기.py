def solution(phone_number):
    return "*" * (len(phone_number) - 4) + phone_number[-4:]


phone_number1 = "01033334444"  # return "*******4444"
phone_number2 = "027778888"  # return "*****8888"

print(solution(phone_number1))
print(solution(phone_number2))
