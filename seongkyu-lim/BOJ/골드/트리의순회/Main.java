package 트리의순회;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    /*

    postOrder로 루트 노드를 찾고,
    inorder로 왼쪽과 오른쪽 자식트리를 찾는다.

    preorder는 가운데, 왼쪽, 오른쪽 순으로 순회하므로 위에서 얻은 정보로 preorder를 완성시킨다.

    */

    static int n;
    static int[] inOrder, postOrder;
    static String[] preOrder;
    static int idx = 0;

    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(bf.readLine());

        inOrder = new int[n];
        postOrder = new int[n];
        preOrder = new String[n];

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        for(int i=0; i<n; i++){
            inOrder[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");

        for(int i=0; i<n; i++){
            postOrder[i] = Integer.parseInt(st2.nextToken());
        }

        getPreOrder(0, inOrder.length-1, 0, postOrder.length-1);
        bw.write(String.join(" ",preOrder)+"\n");
        bw.flush();
        bw.close();

    }

    //post : 왼쪽 오른쪽 가운데
    //in : 왼쪽 가운데 오른쪽

    private static void getPreOrder(int in_start, int in_end, int post_start, int post_end) {
        
        if((in_start <= in_end) && (post_start <= post_end)){

            preOrder[idx++] = Integer.toString(postOrder[post_end]);
            //왼쪽 자식과 오른쪽 자식 트리의 범위 찾기.
                int indexOfRoot = 0;
                for(int i=in_start; i<=in_end; i++){
                    if (inOrder[i] == postOrder[post_end]){
                        indexOfRoot = i;
                        break;
                    }
                }
/*

                //왼쪽 자식 트리.
                getPreOrder(0, indexOfRoot-1, 0, indexOfRoot-1);

                //오른쪽 자식 트리.
                getPreOrder(indexOfRoot+1, inOrder.length-1,postOrder.length-2-((inOrder.length-1)-(indexOfRoot+1))
                , postOrder.length-2);

                */
                getPreOrder(in_start, indexOfRoot - 1, post_start, post_start + indexOfRoot - in_start - 1);
			    getPreOrder(indexOfRoot + 1, in_end, post_start + indexOfRoot - in_start, post_end - 1);

        }
    }
    
}
