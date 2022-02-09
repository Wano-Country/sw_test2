package 트리순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    /*
    트리를 순회하는 세가지 방법의 결과에 대해 출략하라.

    재귀스
    node 클래스로 tree 하나 만들기.
    */

    static Node[] arr;
    static Node root = new Node("A");


    public static void main(String[] args) throws NumberFormatException, IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bf.readLine());

        arr = new Node[n+1];

        for(int i=0; i<n; i++){

            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

            String parentNode = st.nextToken();
            String leftNode = st.nextToken();
            String rightNode = st.nextToken();

            if(parentNode.equals("A")){
                root.left = leftNode.equals(".") ? null : new Node(leftNode);
                root.right = rightNode.equals(".") ? null : new Node(rightNode);
            }else{
                searchNode(root, parentNode, leftNode, rightNode);
            }
            
        }

        preOrder(root);
        System.out.print("\n");
        inOrder(root);
        System.out.print("\n");
        postOrder(root);
        System.out.print("\n");
    }

   public static void preOrder(Node node){
        if(node != null){
            System.out.print(node.data);
            if(node.left != null){preOrder(node.left);}
            if(node.right != null){preOrder(node.right);}
        }  
    }

    public static void inOrder(Node node){
        if(node != null){
            if(node.left != null){inOrder(node.left);}
            System.out.print(node.data);
            if(node.right != null){inOrder(node.right);}
        }  
    }
    public static void postOrder(Node node){
        if(node != null){
            if(node.left != null){postOrder(node.left);}
            if(node.right != null){postOrder(node.right);}
            System.out.print(node.data);
        }  
    }
 

    public static void searchNode(Node node, String parentNode, String leftNode, String rightNode){

        if(node == null){
            return;
        }else if(node.data.equals(parentNode)){
            node.left = leftNode.equals(".") ? null : new Node(leftNode);
            node.right = rightNode.equals(".") ? null  :  new Node(rightNode);
        }else {
            searchNode(node.left, parentNode, leftNode, rightNode);
            searchNode(node.right, parentNode, leftNode, rightNode);
        }

    }

    public static class Node{
        String data;
        Node left;
        Node right;

        public Node(String data){
            this.data = data;
        }

    }
    
}
