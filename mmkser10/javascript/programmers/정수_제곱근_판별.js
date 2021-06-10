function solution(n) {
    let number = Math.sqrt(n);
    return Number.isInteger(number) ? Math.pow(number+1, 2) : -1
}