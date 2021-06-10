function solution(record) {
    let map = new Map();
    let array = []
    let answer = []
    for(let i = 0 ; i < record.length ; i++){
        array.push(record[i].split(' '));
        if(array[i][0] !== 'Leave')
            map.set(array[i][1], array[i][2])
    }
    for(let j = 0 ; j < record.length ; j++){
        if(array[j][0] !== 'Change'){
            let nickname = map.get(array[j][1]);
            let action = array[j][0] === 'Enter' ? '들어왔습니다.' : '나갔습니다.'
            answer.push(nickname + "님이 " + action)
        }
    }
    return answer;
}