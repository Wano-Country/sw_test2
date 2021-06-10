function solution(progresses, speeds) {
    let answer = []
    let index = 0
    while(index <= progresses.length) {
        progresses = progresses.map((el, idx) => el += speeds[idx]);
        console.log(progresses, index);
        for(let i = 0 ; i < progresses.length ; i++, index++){
            if(progresses[i] < 100) {
                if(i > 0)   answer.push(index);
                break;
            }
            console.log(answer);
        }
    }
    return answer;
}