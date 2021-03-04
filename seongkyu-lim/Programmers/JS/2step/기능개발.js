function solution(progresses, speeds) {
    let deployDate = [];
    let index = 0;
    
    for(let idx in progresses) {
        deployDate.push(0);
    }
    
    for(let value of progresses) {
        let progress = value;
        do {
            progress += speeds[index];
            deployDate[index] += 1;
        }while (progress<100)
        index += 1;
    }
    
    let sameDate = [];
    let cnt = 1;
    
    let firstDate = 0;
    for(let idx in deployDate) {
        if(idx == 0){
            firstDate = deployDate[idx];
        }
        if((firstDate >= deployDate[Number(idx)+1])&(idx !== deployDate.length-1)) {
            cnt += 1;
        
        } else if((firstDate < deployDate[Number(idx)+1])&(idx !== deployDate.length-1)) {
            sameDate.push(cnt);
            cnt = 1;
            firstDate = deployDate[Number(idx)+1];
        } else {
            sameDate.push(cnt);
        }
    }
    return sameDate;
}