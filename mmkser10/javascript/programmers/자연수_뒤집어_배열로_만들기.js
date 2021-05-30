function solution(n) {
    return Array.from(n+"").reverse().map( (o) => o = parseInt(o));
}

// another sol
function anotherSolutionA(n){
    let arr = [];

    do {
        arr.push(n%10);
        n = Math.floor(n/10);
    }
    while (n>0);

    return arr;
}