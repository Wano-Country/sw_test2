function solution(citations) {
    let answer = 1;
    citations.sort( (x, y) => x - y);
    for(let x = citations.length-1 ; x >= 0 ; x--, answer++){
        if(citations[x] < answer) {
            break;
        }
    }
    return answer-1;
}