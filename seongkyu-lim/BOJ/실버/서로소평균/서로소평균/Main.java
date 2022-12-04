
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());
        double answer = 0;
        double cnt = 0;
        for (int i=0; i<n; i++){
            if(x<=arr[i]){
                int value = gcd(arr[i],x);
                if(value==1){
                    answer += arr[i]; 
                    cnt++;
                }
            }else{
                int value = gcd(x, arr[i]);
                if(value==1){
                    answer += arr[i];
                    cnt++;
                }
            }   
        }

        System.out.println(Math.round(((answer / cnt))*10000000)/10000000.0);
        
    }

    public static int gcd(int a, int b) {
		if(a%b == 0) {
			return b;
		}
		return gcd(b, a%b);
    }
    
}
