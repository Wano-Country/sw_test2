var list = [4, 2, 3, 7];

// 임시 배열은 위치 및 정렬 값이있는 객체를 보유합니다.
var mapped = list.map(function(el) {
  return el ;
})

console.log(mapped)

console.log(mapped[0].value == list[0])

mapped.sort(function(a, b) {
    return b-a;
  });

  console.log(mapped)
  console.log(list)