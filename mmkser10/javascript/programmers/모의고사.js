function solution(answers) {
    let answer = [];
    let one = [1,2,3,4,5];
    let two = [2,1,2,3,2,4,2,5];
    let three = [3,3,1,1,2,2,4,4,5,5];
    let count = new Array(3).fill(0);
    for(let i = 0 ; i < answers.length ; i++){
        if(one[i%one.length] === answers[i]) count[0]++;
        if(two[i%two.length] === answers[i]) count[1]++;
        if(three[i%three.length] === answers[i]) count[2]++;
    }
    let max = Math.max(count[0], count[1], count[2]);

    if(max === count[0]) answer.push(1)
    if(max === count[1]) answer.push(2)
    if(max === count[2]) answer.push(3)

    return answer;
}