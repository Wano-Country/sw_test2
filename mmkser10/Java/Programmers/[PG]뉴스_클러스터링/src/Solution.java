import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int solution(String str1, String str2) {
        HashSet<String> words = new HashSet<>();
        HashMap<String, Integer> alpha = new HashMap<>();
        HashMap<String, Integer> beta = new HashMap<>();
        double mole = 0;
        double deno = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        for(int i = 0 ; i < str1.length() - 1 ; i++){
            StringBuffer sb = new StringBuffer();
            for(int j = 0 ; j < 2 ; j++){
                if( str1.charAt(i+j) >= 'A' &&  str1.charAt(i+j) <= 'Z')
                    sb.append(str1.charAt(i+j));

            }
            if(sb.length() == 2) {
                String word = new String(sb);
                alpha.put(word, alpha.getOrDefault(word, 0) + 1);
                words.add(word);
            }
        }

        for(int i = 0 ; i < str2.length() - 1 ; i++){
            StringBuffer sb = new StringBuffer();
            for(int j = 0 ; j < 2 ; j++){
                if( str2.charAt(i+j) >= 'A' &&  str2.charAt(i+j) <= 'Z')
                    sb.append(str2.charAt(i+j));

            }
            if(sb.length() == 2) {
                String word = new String(sb);
                beta.put(word, beta.getOrDefault(word, 0) + 1);
                words.add(word);
            }
        }
        Iterator iterator = words.iterator();

        while(iterator.hasNext()){
            String tmp = String.valueOf(iterator.next());
            int countAlpha = alpha.getOrDefault(tmp, 0);
            int countBeta = beta.getOrDefault(tmp, 0);
            deno += Math.max(countAlpha, countBeta);
            if(countAlpha != 0 && countBeta != 0)
                mole += Math.min(countAlpha, countBeta);
        }

        if(mole == 0 && deno == 0)
            return 65536;
        else
            return (int) Math.floor((mole/deno)*65536);
    }
}