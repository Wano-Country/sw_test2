function solution(land) {
    let N = land.length;
    for(let i = 1 ; i < N ; i++){
        land[i][0] += Math.max(land[i-1][1], land[i-1][2], land[i-1][3]);
        land[i][1] += Math.max(land[i-1][0], land[i-1][2], land[i-1][3]);
        land[i][2] += Math.max(land[i-1][0], land[i-1][1], land[i-1][3]);
        land[i][3] += Math.max(land[i-1][0], land[i-1][1], land[i-1][2]);
    }
    return Math.max(land[N-1][0], land[N-1][1], land[N-1][2], land[N-1][3]);
}