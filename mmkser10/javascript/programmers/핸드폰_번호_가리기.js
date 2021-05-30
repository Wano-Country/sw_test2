function solution(phone_number) {
    const count = phone_number.length-4;
    return '*'.repeat(count)+phone_number.slice(count);
}