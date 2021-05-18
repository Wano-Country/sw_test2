function solution(arr1, arr2) {
    return arr1.map( (o1, i) => o1.map( (o2, j) => o2 + arr2[i][j]));
}