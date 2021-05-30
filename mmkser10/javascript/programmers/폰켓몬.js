function solution(nums) {
    let N = nums.length/2;
    let set = new Set();
    for(let i = 0 ; i < nums.length ; i++){
        set.add(nums[i]);
    }
    return Math.min(N, set.size);
}

// another sol
function anotherSolutionA(nums) {
    const max = nums.length / 2;
    const arr = [...new Set(nums)];

    return arr.length > max ? max : arr.length
}
