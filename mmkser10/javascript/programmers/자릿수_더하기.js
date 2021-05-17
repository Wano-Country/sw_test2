function solution(n)
{
    return (n+"").split("").reduce((acc, cur) => acc + parseInt(cur), 0);
}