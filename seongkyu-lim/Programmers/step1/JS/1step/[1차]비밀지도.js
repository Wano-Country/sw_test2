function solution(n, arr1, arr2) {
    var answer = [];
    var row = [];
    for (let idx in arr1){
        arr1[idx] = arr1[idx].toString(2)
        arr2[idx] = arr2[idx].toString(2)
        let zeroNum1 = n-(arr1[idx].length)
        let zeroNum2 = n-(arr2[idx].length)
        
        for(let i=0;i<zeroNum1;i++){
                    arr1[idx]='0' + arr1[idx]
        }
        for(let i=0;i<zeroNum2;i++){
                    arr2[idx]='0' + arr2[idx]
        }
        for (let i=0;i<n;i++){
            if (arr1[idx][i] == '0' && arr2[idx][i] =='0') {
                row.push(' ');
            }else {
                row.push('#');
            }
        }
        answer.push(row.join(""))
        row =[]
    }
    return answer;
}