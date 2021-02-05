function solution(phone_number) {
    phone_number = phone_number.split("")
    for (let i=0;i<phone_number.length-4;i++){
        phone_number[i] = '*'
    }
    phone_number = phone_number.join("")
    return phone_number;
}