function solution(number, k){
    let arrayIndex = [0];
    let limit = number.length - k;
    for(let i = 0 ; i < limit ; i++) {
        for (let j = 9; j >= 0; j--) {
            let index = number.indexOf(j, arrayIndex[i]);
            if(index !== -1 && number.length - index >= limit - i){
                console.log(number.length - index, number[index]);
                arrayIndex.push(index+1);
                break;
            }
        }
    }
}

// anotherSol
function anotherSolution(number, k) {
    const answer = []
    let head = 0
    let del = k

    answer.push(number[head++])
    while(answer.length < number.length - k || head < number.length) {
        if(del && answer[answer.length-1] < number[head]) {
            answer.pop()
            del--
            continue
        }
        answer.push(number[head++])
    }
    return answer.slice(0, number.length - k).join('')
}
