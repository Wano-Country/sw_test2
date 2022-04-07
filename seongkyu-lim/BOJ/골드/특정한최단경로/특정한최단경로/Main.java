package 특정한최단경로;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
배열 초기값 및 distance 값을 INF로 하니 맞음.  왜 --
*/

public class Main {
    
    static int[][] arr1;
    static int N;
    static int E;

    static final int INF = 200_000_000;

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        arr1 = new int[N][N];

        for(int i=0;i<N; i++){
            for(int j=0; j<N; j++){
                arr1[i][j] = INF;
            }
        }

        for(int i=0; i<E; i++){

            st = new StringTokenizer(bf.readLine()," ");
            int row = Integer.parseInt(st.nextToken())-1;
            int col = Integer.parseInt(st.nextToken())-1;
            int length = Integer.parseInt(st.nextToken());
            
            arr1[row][col] = length;
            arr1[col][row] = length;
        }

        st = new StringTokenizer(bf.readLine()," ");

        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        // 0-v1-v2-(N-1) || 0-v1-v2-v1-(N-1)
        // 0-v2-v1-(N-1) || 0-v2-v1-v2-(N-1)

        /*
        // 0-v2-v1-v2-(N-1)
        int answer3 = dijkstra(0, v2-1)+dijkstra(v2-1, v1-1)+ dijkstra(v1-1, v2-1) + dijkstra(v2-1, N-1); 

        // 0-v1-v2-v1-(N-1)
        int answer4 = dijkstra(0, v1-1)+dijkstra(v1-1, v2-1)+ dijkstra(v2-1, v1-1) + dijkstra(v1-1, N-1); 
*/
        if(E == 0) System.out.println(-1);
        else if(dijkstra(0, v1-1)+dijkstra(v1-1, v2-1)+dijkstra(v2-1, N-1)>INF && dijkstra(0, v2-1)+dijkstra(v2-1, v1-1)+dijkstra(v1-1, N-1)>INF) System.out.println(-1);
        else System.out.println(Math.min(dijkstra(0, v1-1)+dijkstra(v1-1, v2-1)+dijkstra(v2-1, N-1),dijkstra(0, v2-1)+dijkstra(v2-1, v1-1)+dijkstra(v1-1, N-1)));
    }

    public static int dijkstra(int start, int end){ 

        int[][] arr = new int[N][N];
        
        for(int i=0; i<N; i++){
            System.arraycopy(arr1[i], 0, arr[i], 0, N);
        }

        int[] distance = new int[N]; // 최단 거리를 저장할 변수 
        boolean[] check = new boolean[N]; // 해당 노드를 방문했는지 체크할 변수 // distance값 초기화. 무한대를 int 자료형의 최대값으로 표현했다. 
        
        for(int i=0; i<N; ++i){ 
            distance[i] = INF; 
        }

        distance[start] = 0; 
        check[start] = true; 

        for(int i=0; i<N; ++i){ 
            if(!check[i] && arr[start][i] != INF){ 
                distance[i] = arr[start][i]; 
            } 
        }

        for(int a=0; a<N-1; a++){ 
            int min = INF; 
            int min_index = -1; // 노드 최소값 찾기 
            for(int i=0; i<N; i++){ 
                if(!check[i] && min > distance[i]){ 
                        min = distance[i]; 
                        min_index = i; 
                } 
            }
            if(min_index != -1){ 
                check[min_index] = true;
    
                for(int i=0; i<N; i++){ 
                    if(!check[i] && arr[min_index][i] != INF && distance[min_index]+arr[min_index][i]<distance[i]){
                        distance[i] = distance[min_index] + arr[min_index][i]; 
                    } 
                }
            }
        } 
        return distance[end];
    }
}
