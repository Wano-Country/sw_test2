function solution(arr1, arr2) {
    var answer = new Array();
        for(let i=0;i<arr1.length;i++){
            answer[i] = new Array(arr1[i].length);
            for(let j=0;j<arr1[i].length;j++){
                answer[i][j] = arr1[i][j] + arr2[i][j]
            }
        }
    return answer;
}

// javascript에서는 이차원 배열을 최초에 선언할 수 없다.
// 그래서 나는 반복문을 이용해 각 행마다 새로운 배열을 선언해줌.
