function solution(n) {
    let answer = 0;
    for (let i = 1 ; i <= (n/2) ; i++) {
        if (n%i === 0) {
            answer = answer + i;
        }
    }
    return answer+n;
}