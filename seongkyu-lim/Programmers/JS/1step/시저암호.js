function replaceAll(str, searchStr, replaceStr) {
    return str.split(searchStr).join(replaceStr);
  }
  
  function solution(s, n) {
      var answer = '';
      var s_array = new Array();
      s_array = s.split('')
      console.log(s_array);
      for(let i=0;i<s.length;i++){
          if ((65<=s_array[i].charCodeAt(0))&&(s_array[i].charCodeAt(0)<=90) && (s_array[i].charCodeAt(0)+n>90)) {
              s_array[i] = String.fromCharCode(65 + n-(90-s_array[i].charCodeAt(0)+1));     
          }
          else if ((97<=s_array[i].charCodeAt(0))&&(s_array[i].charCodeAt(0)<=122) && (s_array[i].charCodeAt(0)+n>122)) {
              s_array[i] = String.fromCharCode(97 + n-(122-s_array[i].charCodeAt(0)+1));
              console.log('2')
              console.log(s_array[i])
          }
          else if (s_array[i].charCodeAt(0) == 32) {
              s_array[i] = String.fromCharCode(36);
              console.log('3')
          }
          else {
              s_array[i] = String.fromCharCode(s_array[i].charCodeAt(0) + n);
              console.log('4')
              console.log(s_array[i])
  
          };
      };
      answer = s_array.join("");
      console.log(answer);
      answer =replaceAll(answer,'$', ' ');
      return answer;
  }

  //js: 1<=x<=4 와같은 부등식 사용 안됨..?