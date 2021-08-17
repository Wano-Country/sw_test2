function solution(N, road, K) {
    let distance = new Array(N).fill(500001);
    let isCheck = new Array(N).fill(false);
    let graph = new Array(N).fill(0).map(() => new Array(N));
    let answer = 0;
    distance[0] = 0;

    for(let i = 0 ; i < road.length ; i++){
        if(graph[road[i][0]-1][road[i][1]-1] == null || graph[road[i][0]-1][road[i][1]-1] > road[i][2]){
            graph[road[i][0]-1][road[i][1]-1] = road[i][2];
            graph[road[i][1]-1][road[i][0]-1] = road[i][2];
        }
    }

    for(let j = 0 ; j < N - 1 ; j++){
        let min = 500001;
        let index = -1;

        for(let k = 0 ; k < N ; k++){
            if(!isCheck[k] && min > distance[k]){
                index = j;
                min = distance[k];
            }
        }

        for(let l = 0 ; l < N ; l++){
            if(!isCheck[l] && graph[index][l] !== 0 && distance[index] != 500001 && distance[index] + graph[index][l] < distance[l]){
                distance[l] = distance[index] + graph[index][l];
            }
        }
        isCheck[index] = true;
    }

    for(let m = 0 ; m < N ; m++){
        if(distance[m] <= K){
            answer++;
        }
    }
    return answer;
}