function solution(n) {
    if(n < 2)
        return 1;
    let fibo = [];
    fibo[1] = 1;
    fibo[2] = 1;
    for(let i = 3 ; i <= n ; i++)
        fibo[i] = (fibo[i-1] + fibo[i-2])%1234567;
    return fibo[n];
}

// another sol
function anotherSolutionA(n) {
    let a = 0, b = 1, f = 1;
    for (let i = 2; i <= n; i++) {
        f = a + b;
        a = b;
        b = f;
    }
    return f;
}
