function solution(N, stages) {
    var answer = [];
    let temp1 = []
    let temp2 = []
    let cnt = 0;
    let cnt2 = 0;
    
    for (let i = 1 ; i<=N ; i++){
        for (let j = 0 ; j<stages.length ; j++){
            if (stages[j] ==i){
                cnt +=1;
            }else if(stages[j] > i){
                cnt2 += 1;
            }
        }
        if(cnt==0 && cnt2 ==0){
            temp1.push(0)
        temp2.push(0)
            
        }else{
        temp1.push(cnt/(cnt2 + cnt))
        temp2.push(cnt/(cnt2 + cnt))
            }
        cnt = 0;
        cnt2 = 0; 
    } 
    
    temp1 = temp1.sort(function(a,b){return b-a;})
    for (let idx in temp1){
    answer.push(temp2.indexOf(temp1[idx]) + 1)
    temp2[temp2.indexOf(temp1[idx])] = 200001
    }
    return answer;
}