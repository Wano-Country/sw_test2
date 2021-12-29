function solution(n, arr1, arr2) {
    let answer = []
    for(let i = 0 ; i < n ; i++){
        let bit = (arr1[i] | arr2[i]>>>0).toString(2);
        bit = bit.length >= n ? bit:new Array(n-bit.length+1).join('0')+bit;
        bit = bit.replace(/1/g, '#').replace(/0/g, ' ');
        answer.push(bit);
    }
    return answer;
}

// another sol
function anotherSolutionA(n, arr1, arr2) {
    return arr1.map((v, i) => addZero(n, (v | arr2[i]).toString(2)).replace(/1|0/g, a => +a ? '#' : ' '));
}

const addZero = (n, s) => {
    return '0'.repeat(n - s.length) + s;
}
